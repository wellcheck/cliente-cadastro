package com.curso.algarworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.curso.algarworks.curso.dao.ClienteDAO;
import com.curso.algarworks.curso.modulo.Cliente;
import com.mysql.cj.protocol.Resultset;

public class jdbcClienteDAO implements ClienteDAO {

	private Connection connection;

	public jdbcClienteDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	// Metodo da interface para inserir dados no banco de dados mysql, com
	// tratamento de excesão caso ocorra erro!
	@Override
	public void salvarCliente(Cliente cliente) {

		try {
			String sql = String.format("insert into cliente (nome) values('%s')", cliente.getNome());
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente!", e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	@Override
	public Cliente buscarPeloCodigo(Long codigo) {
			Cliente cliente = null;
			
		try {
			String sql = String.format("select from * cliente where codigo =%d", codigo);
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		} catch (SQLException e) {
			throw new DAOException("Erro buscando cliente", e);

		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {

			}
		}

	}

}
