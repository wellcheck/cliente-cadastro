package com.curso.algarworks.curso.dao.jdbc;

public class DAOException extends RuntimeException {

	public DAOException(String msg , Throwable t) {
		super(msg, t);
	}
}
