package br.com.fiap.ex1;

public class Main2 {
		public static void main(String[] args) {
			float f = (23/3);
			System.out.println(f);
			
			float executarCalculo = new Command().executarCalculo(new Calculadora(), Operadores.DIVISAO, 23f, 3);

			String
			
			System.out.println(executarCalculo);
		}
}
