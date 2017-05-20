package br.com.fiap.ex1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Command command = new Command();
		
//		String entrada1 = JOptionPane.showInputDialog("DIGITE O PRIMEIRO VALOR PARA CALCULAR");
//		String entradaOperador = JOptionPane.showInputDialog("DIGITE O QUAL TIPO DE OPERAÇÃO DESEJA FAZER (+,-,*,/");
//		String entrada2 = JOptionPane.showInputDialog("DIGITE O SEGUNDO VALOR PARA CALCULAR");
		
//		Operadores operador = Operadores.valueOf(entradaOperador);
		
		Operadores[] values = Operadores.values();
		for (Operadores operadores : values) {
			System.out.println(operadores.getOperador());
		}
		
		System.out.println(Operadores.valueOf("SOMA"));
		
		
//		float resultado = command.executarCalculo(calculadora, operador, Float.valueOf(entrada1), Float.valueOf(entrada2));
		
		
		
	}
}
