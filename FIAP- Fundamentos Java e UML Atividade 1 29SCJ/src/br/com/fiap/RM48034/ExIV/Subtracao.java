package br.com.fiap.RM48034.ExIV;

import java.util.List;

public class Subtracao implements Operacao{

	private List<Double> numeros;
	
	public List<Double> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Double> numeros) {
		this.numeros = numeros;
	}

	@Override
	public Double calcular() {
		Double acumulador = 0d;

		for (Double numero : this.getNumeros()) {
			System.out.println(numero + this.toString());
			acumulador -= numero;
		}
		return acumulador;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "-";
	}
}
