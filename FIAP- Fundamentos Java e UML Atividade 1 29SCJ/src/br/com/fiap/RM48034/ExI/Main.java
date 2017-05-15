package br.com.fiap.RM48034.ExI;

public class Main {
	public static void main(String[] args) {
		Integer arrayInteiros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		InversorDeArrays inversorDeArrays = new InversorDeArrays();
		Integer[] arrayInvertido = inversorDeArrays.inverte(arrayInteiros, arrayInteiros.length);

		for (int i = 0; i < arrayInvertido.length; i++) {
			System.out.print(arrayInvertido[i] + "," + "");
		}

	}
}
