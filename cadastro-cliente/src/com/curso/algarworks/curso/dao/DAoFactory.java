package com.curso.algarworks.curso.dao;

import com.curso.algarworks.curso.dao.jdbc.JdbcDAOFactory;

public abstract class DAoFactory {

	public static JdbcDAOFactory getDAoFactory(){
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
}
