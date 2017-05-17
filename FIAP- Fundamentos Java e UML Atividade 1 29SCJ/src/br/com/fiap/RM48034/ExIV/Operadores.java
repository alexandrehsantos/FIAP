package br.com.fiap.RM48034.ExIV;

public enum Operadores {
	ADICAO('+'),
	SUBTRACAO('-'),
	MULTIPLICACAO('*'),
	DIVISAO('/'),
	IGUAL('=');
	
	private char operador;

	private Operadores(char operador) {
		this.operador = operador;
	}
	
	public char getOperador() {
		return operador;
	}

}
