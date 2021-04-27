package com.curso.algarworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.curso.algarworks.curso.dao.ClienteDAO;
import com.curso.algarworks.curso.modulo.Cliente;

public class jdbcClienteDAO implements ClienteDAO {

	private Connection connection;

	public jdbcClienteDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void salvarCliente(Cliente cliente) {
		
		try {
			String sql = String.format("insert into cliente (nome) values('%s')", cliente.getNome());
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente!", e); 
		}
		finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
