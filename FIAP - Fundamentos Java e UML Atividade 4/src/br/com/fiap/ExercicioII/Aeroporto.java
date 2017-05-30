package br.com.fiap.ExercicioII;

public class Aeroporto extends Thread {

	private String nomeDoAeroporto;
	private boolean estadoDaPista;

	public Aeroporto(String nomeDoAeroporto) {
		this.nomeDoAeroporto = nomeDoAeroporto;
	}

	public Boolean aguardarPistaDisponivel() {
		return this.estadoDaPista;
	}

	public void alterarEstadoDaPista() {

		while (true) {
			if (true)
				this.estadoDaPista = false;
			try {
				Thread.sleep(30000);
				this.estadoDaPista = true;
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
