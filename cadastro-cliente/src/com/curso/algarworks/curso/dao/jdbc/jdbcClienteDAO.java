package com.curso.algarworks.curso.dao.jdbc;

import java.sql.Connection;

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
		
		
	}

}
