package br.com.fiap.ExercicioII;

public class Aterrissar implements Runnable {
	private Aviao aviao;

	public Aterrissar(Aviao aviao) {
		this.aviao = aviao;

	}

	@Override
	public void run() {
		this.aviao.aterrisar();
	}
}
