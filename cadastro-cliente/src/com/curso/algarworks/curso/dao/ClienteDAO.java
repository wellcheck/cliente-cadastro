package com.curso.algarworks.curso.dao;

import java.util.List;

import com.curso.algarworks.curso.modulo.Cliente;

public interface ClienteDAO {

	// Metodo obrigat�rio para salvar o cliente!
	public void salvarCliente(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();

}
