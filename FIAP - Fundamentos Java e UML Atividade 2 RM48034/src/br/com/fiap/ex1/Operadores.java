package br.com.fiap.ex1;

public enum Operadores {
	
	SOMA("+"),
	SUBTRACAO("-"),
	DIVISAO("/"),
	MULTIPLICACAO("*"); 
	
	private String operador;
	
	private Operadores(String operador) {
		this.operador = operador;
	}

	public String getOperador() {
		return operador;
	}

}
