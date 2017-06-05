package br.com.fiap.ExercicioII;

public class Main {

	public static void main(String[] args) {

		Aeroporto aeroporto = new Aeroporto("Cumbica");

		Aviao aviao1 = new Aviao("TAN 123", aeroporto);
		Aviao aviao2 = new Aviao("OLÉ 111", aeroporto);
		Aviao aviao3 = new Aviao("LINHA 222", aeroporto);

		Thread thread0 = new Thread(aeroporto);
		thread0.setName(aeroporto.getNome());
		
		Thread thread = new Thread(aviao1);
		thread.setName(aviao1.getNome());
		
		Thread thread2 = new Thread(aviao2);
		thread2.setName(aviao2.getNome());
		
		Thread thread3 = new Thread(aviao3);
		thread3.setName(aviao3.getNome());
		
		
		thread0.start();
		thread.start();
		thread2.start();
		thread3.start();
		

	}

}
