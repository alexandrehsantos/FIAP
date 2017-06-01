package br.com.fiap.ExercicioII;

public class Aviao {

	private String nomeDoVoo;
	private Aeroporto aeroporto;

	public Aviao(String nomeDoVoo, Aeroporto aeroporto) {
		this.nomeDoVoo = nomeDoVoo;
		this.aeroporto = aeroporto;
	}

	public void decolar() {
		String nome = Thread.currentThread().getName();

		System.out.println(this.nomeDoVoo + " \n Aguardando disponibilidade de pista \n");
		aeroporto.aguardarPistaDisponivel();

		System.out.println(this.nomeDoVoo + " \n Seguindo para pista para decolagem \n");

		aguardar(5000);

		System.out.println(this.nomeDoVoo + " \n DECOLANDO î \n\n");
	}

	public void aterrisar() {
		String nome = Thread.currentThread().getName();

		System.out.println(this.nomeDoVoo + " \n Aguardando disponibilidade de pista \n");

		aeroporto.aguardarPistaDisponivel();

		System.out.println(this.nomeDoVoo + " \n Preparando-se para aterrissagem \n");

		aguardar(5000);

		System.out.println(this.nomeDoVoo + " ATERRISANDO ¬ \n");

		// aeroporto.aguardarPistaDisponivel();

	}

	public void voar() {
		aguardar(2000);
	}

	private void aguardar(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
