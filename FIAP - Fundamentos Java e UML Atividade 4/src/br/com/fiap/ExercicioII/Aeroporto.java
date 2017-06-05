package br.com.fiap.ExercicioII;

public class Aeroporto extends Thread {
	private volatile boolean pistaLivre;
	private String nomeDoVoo;

	public Aeroporto(String nomedoString) {
		this.nomeDoVoo = nomedoString;
	}

	public synchronized void aguardarPistaDisponivel() throws InterruptedException {

		if (!pistaLivre) {
			System.out.println("Pista sem liberação no momento - Aguarde...");
			this.wait(10000);

		} else {
			this.notifyAll();
			System.out.println("Pista liberada prossiga");
		}

	}

	public void alterarEstadoDaPista() {

		while (true) {
			pistaLivre = (pistaLivre) ? false : true;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public void run() {
		this.alterarEstadoDaPista();
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return this.nomeDoVoo;
	}

}
