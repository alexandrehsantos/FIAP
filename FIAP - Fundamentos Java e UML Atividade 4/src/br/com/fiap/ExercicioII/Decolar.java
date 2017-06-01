package br.com.fiap.ExercicioII;

public class Decolar implements Runnable {
	
	private Aviao aviao;
	
	public Decolar(Aviao aviao) {
		this.aviao = aviao;
	}
	
	
	
	@Override
	public void run() {
			this.aviao.decolar();
	}

}
