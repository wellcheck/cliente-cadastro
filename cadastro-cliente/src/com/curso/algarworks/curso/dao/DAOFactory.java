package com.curso.algarworks.curso.dao;

import com.curso.algarworks.curso.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

	public static JdbcDAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}

	public abstract ClienteDAO getClienteDAO();
}
