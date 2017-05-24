package br.com.fiap.exercicioIV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("João Garcia", 20, 'm', "AIK Enterprises");
		Pessoa pessoa2 = new Pessoa("Maria Martins", 44, 'f', "Simples");
		Pessoa pessoa3 = new Pessoa("Henrique Fernando", 43, 'f', "AIK Enterprises");
		Pessoa pessoa4 = new Pessoa("Inácio Luís", 33, 'm', "Magazine André");
		Pessoa pessoa5 = new Pessoa("Fernando Ferreira", 87, 'm', "Casas Recife");

		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(pessoa);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa5);

		Random random = new Random();

		Pessoa pessoaSorteada = pessoas.get(random.nextInt(pessoas.size() - 1));

		System.out.println("Pessoa sorteada: \n" + pessoaSorteada);
		
		ComparadorPessoa comparadorPessoa = new ComparadorPessoa();
		Collections.sort(pessoas, comparadorPessoa);
		
		System.out.println("Lista ordenada pelo nome:");
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		System.out.println("Lista em ordem reversa pelo nome:");
		Collections.reverse(pessoas);
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}


	}
}
