package com.curso.algarworks.curso.dao;

import com.curso.algarworks.curso.modulo.Cliente;

public interface ClienteDAO {

	//Metodo obrigat�rio para salvar o cliente!
	public void salvarCliente(Cliente cliente);

	public static Cliente buscarPeloCodigo(Long codigo) {
		return null;
		
	}

}
