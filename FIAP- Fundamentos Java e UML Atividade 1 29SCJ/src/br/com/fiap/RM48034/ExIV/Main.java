package br.com.fiap.RM48034.ExIV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		List<Double> listaNumeros = new ArrayList<>();
		List<Double> listaNumeros2 = new ArrayList<>();
		List<Operacao> listOperadores = new ArrayList<>();

		Adicao adicao = new Adicao();
		Subtracao subtracao = new Subtracao();
		
		listaNumeros = Arrays.asList(2d, 2d, 2d, 2d, 2d);
		listaNumeros2 = Arrays.asList(1d);
		listOperadores = Arrays.asList(adicao,subtracao);
		
		adicao.setNumeros(listaNumeros);
		subtracao.setNumeros(listaNumeros2);
		
		calculadora.calcular(listOperadores);	
		
		System.out.println(calculadora.getResultado());

	}
}
