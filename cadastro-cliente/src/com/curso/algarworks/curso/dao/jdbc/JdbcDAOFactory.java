package com.curso.algarworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.curso.algarworks.curso.dao.ClienteDAO;
import com.curso.algarworks.curso.dao.DAoFactory;

public class JdbcDAOFactory extends DAoFactory {

	private Connection conection;

	public JdbcDAOFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conection = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "root");

		} catch (Exception e) {
			throw new RuntimeException("Erro ao reconectar com o banco de dados");
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		
		return new jdbcClienteDAO(conection);
	}
}
