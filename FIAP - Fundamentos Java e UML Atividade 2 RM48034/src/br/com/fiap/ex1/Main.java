package br.com.fiap.ex1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Command command = new Command();
		
		Operadores[] options = Operadores.values();

		int option = JOptionPane.showOptionDialog(null, "Operadores",
				"Selecione a operação que deseja realizar entre os dois valores", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (option != JOptionPane.CLOSED_OPTION) {
			resultado = command.executarCalculo(calculadora, options[option], Float.valueOf(valor1), Float.valueOf(valor2));
			JOptionPane.showMessageDialog(null, "Resultado de sua operacao: " + resultado);
		} else {
			System.out.println("Nenhuma operacao foi selectionada");
		}
		
	}
}
