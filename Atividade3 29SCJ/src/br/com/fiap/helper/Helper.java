package br.com.fiap.helper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.entity.Cliente;

public class Helper {

	private EntityManager em;

	public Helper(EntityManager em) {
		this.em = em;
	}

	public List<Cliente> listarTodos() {
		TypedQuery<Cliente> tQuery = em.createNamedQuery("Cliente.findaAll", Cliente.class);
		return tQuery.getResultList();
	}

}
