package br.com.fiap.RM48034.ExIII;

import java.util.List;

import br.com.fiap.RM48034.ExIV.Operacao;

public class Divisao implements Operacao {

	private List<Double> numeros;

	@Override
	public Double calcular() {
		Double acumulador = 0d;

		for(int i=1; i <= numeros.size(); i++){
			
			if(i%2!=0){
				acumulador+=numeros.get(i);
			}
			if(i%2==0){
					acumulador = acumulador / numeros.get(i);
			}
		}
		
		for (Double numero : this.getNumeros()) {
			System.out.println(numero + this.toString());
			if(numeros.size() >=2){
			acumulador = numero;
			}
			throw new RuntimeException("Só é possível dividir 2 ou mais numeros, também não é possível ocorrer divisão por 0");
		}
		return acumulador;
	}

	@Override
	public String toString() {
		return "/";
	}

	public List<Double> getNumeros() {
		return numeros;
	}

	@Override
	public void setNumeros(List<Double> numeros) {
		this.numeros = numeros;
	}

}
