package br.com.fiap.ex1;

import javax.swing.JOptionPane;

public class Command {

	public void inputarDados() {
		String valor1 = JOptionPane.showInputDialog(null, "Entre com o primeiro número da operação");
		String valor2 = JOptionPane.showInputDialog(null, "Entre com o primeiro número da operação");

		Operadores[] options = Operadores.values();

		int option = JOptionPane.showOptionDialog(null, "Operadores",
				"Selecione a operação que deseja realizar entre os dois valores", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (option != JOptionPane.CLOSED_OPTION) {
			resultado = command.executarCalculo(calculadora, options[option], Float.valueOf(valor1),
					Float.valueOf(valor2));
			JOptionPane.showMessageDialog(null, "Resultado de sua operacao: " + resultado);
		} else {
			System.out.println("Nenhuma operacao foi selectionada");
		}

	}

	public float executarCalculo(CalculadoraBasica basica, Operadores operadores, float float1, float float2) {
		float resultado;
		switch (operadores) {
		case SOMA:
			resultado = basica.somar(float1, float2);
			break;
		case SUBTRACAO:
			resultado = basica.subtrair(float1, float2);
			break;
		case DIVISAO:
			resultado = basica.dividir(float1, float2);
			break;
		case MULTIPLICACAO:
			resultado = basica.multiplicar(float1, float2);
			break;
		default:
			resultado = 0;
		}
		return resultado;
	}

}
