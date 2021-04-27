package com.curso.algarworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.curso.algarworks.curso.dao.ClienteDAO;
import com.curso.algarworks.curso.dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {

	private Connection conection;

	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente", "root", "root");

		} catch (Exception e) {
			throw new RuntimeException("Erro ao reconectar com o banco de dados");
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {

		return new jdbcClienteDAO(conection);
	}
}
