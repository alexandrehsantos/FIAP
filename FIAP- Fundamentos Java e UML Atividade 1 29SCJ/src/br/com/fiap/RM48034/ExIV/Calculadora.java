package br.com.fiap.RM48034.ExIV;

import java.util.List;

public class Calculadora {

	private Double resultado = 0d;

	public void calcular(List<Operacao> operador) {
		 for (Operacao operacao : operador) {
			 resultado += operacao.calcular();
		}
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	

}