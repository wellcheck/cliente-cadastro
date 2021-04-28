package com.curso.algarworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			String sql = String.format("select * from cliente where codigo = %d", codigo);
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
			}

		} catch (SQLException e) {
			throw new DAOException("Erro buscando cliente", e);

		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {

			}
		}
		return cliente;
	}

	@Override
	public List<Cliente> buscarTodos() {
		List<Cliente> clientes = new ArrayList<>();

		try {
			String sql = "select * from cliente";
			PreparedStatement rs = this.connection.prepareStatement(sql);
			ResultSet ps = rs.executeQuery();

			while (ps.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(ps.getLong("codigo"));
				cliente.setNome(ps.getString("nome"));
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			throw new DAOException("Erro buscando cliente", e);

		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {

			}
		}
		return clientes;
	}

}
