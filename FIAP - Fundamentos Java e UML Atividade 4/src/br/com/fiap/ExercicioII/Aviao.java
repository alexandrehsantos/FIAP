package br.com.fiap.ExercicioII;

public class Aviao extends Thread {

	private String nomeDoVoo;
	private Aeroporto aeroporto = new Aeroporto("Galeao");

	public Aviao(String nomeDoVoo) {
		this.nomeDoVoo = nomeDoVoo;

	}

	public void decolar() {
		while (true) {
			if (this.aeroporto.aguardarPistaDisponivel()) {
				System.out.println("Decoloando");
			} else {
				System.out.println("Sem pista disponível para decolagem");
			}
		}
	}

	public void voar() throws InterruptedException {
		Thread.sleep(20000);
	}

	public void aterrisar() {
		while (true) {
			if (this.aeroporto.aguardarPistaDisponivel()) {
				System.out.println("Decoloando");
			} else {
				System.out.println("Sem pista disponível para decolagem");
			}
		}
	}
}
