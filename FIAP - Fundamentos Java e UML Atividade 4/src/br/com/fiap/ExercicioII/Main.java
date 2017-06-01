package br.com.fiap.ExercicioII;

public class Main {
	public static void main(String[] args) {
		Aeroporto aeroporto = new Aeroporto("Cumbica");		
		Aviao aviao = new Aviao("TAM 1234", aeroporto);
		Aviao aviao2 = new Aviao("OLÉ 234", aeroporto);
		
		AlterarEstado alterarEstado = new AlterarEstado(aeroporto);
		
		Thread thread = new Thread(alterarEstado);
		
		Thread aviaoA = new Thread(new Decolar(aviao));
		Thread aviaoB = new Thread(new Aterrissar(aviao2));

		thread.start();
		aviaoB.start();
		aviaoA.start();
	}
}
