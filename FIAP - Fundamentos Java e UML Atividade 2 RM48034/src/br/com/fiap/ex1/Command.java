package br.com.fiap.ex1;

public class Command {
	
	

	public float executarCalculo(CalculadoraBasica basica, Operadores operadores, float float1, float float2){
		float resultado;
		switch (operadores) {
		case SOMA:  
			resultado = basica.somar(float1, float2);
			break;
		case SUBTRACAO:
			resultado = basica.subtrair(float1, float2);
		case DIVISAO:
			resultado = basica.dividir(float1, float2);
		case MULTIPLICACAO:
			resultado = basica.multiplicar(float1, float2);
		default:
			resultado = 0;
		}
		return resultado;
	}
	
}
