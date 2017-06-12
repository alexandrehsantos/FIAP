package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.helper.Helper;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Atividade3 29SCJ");
		EntityManager em = createEntityManagerFactory.createEntityManager();
		
		Helper helper = new Helper(em);
		
		helper.listarTodos();
		
	}
}
