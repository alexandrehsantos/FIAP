package br.com.fiap.dao;

import br.com.fiap.entity.Cliente;

public class ClienteDAO extends GenericDao<Cliente> {


	public ClienteDAO(Class<Cliente> classe) {
		super(classe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void adicionar(Cliente entidade) {
		super.adicionar(entidade);
	}
	
}
