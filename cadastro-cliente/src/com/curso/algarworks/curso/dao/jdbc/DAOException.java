package com.curso.algarworks.curso.dao.jdbc;

public class DAOException extends RuntimeException {

	//Classe para o tratamento de excess�o
	public DAOException(String msg, Throwable t) {
		super(msg, t);
	}
}
