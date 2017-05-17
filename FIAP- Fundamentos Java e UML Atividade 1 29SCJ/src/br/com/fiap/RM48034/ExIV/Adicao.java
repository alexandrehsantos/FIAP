package br.com.fiap.RM48034.ExIV;

import java.util.List;

public class Adicao implements Operacao {

	private List<Double> numeros;

	@Override
	public Double calcular() {

		Double acumulador = 0d;

		for (Double numero : this.getNumeros()) {
			System.out.println(numero + this.toString());
			acumulador += numero;
		}
		return acumulador;
	}

	@Override
	public String toString() {
		return "+";
	}

	public List<Double> getNumeros() {
		return numeros;
	}
	@Override
	public void setNumeros(List<Double> numeros) {
		this.numeros = numeros;
	}

}
