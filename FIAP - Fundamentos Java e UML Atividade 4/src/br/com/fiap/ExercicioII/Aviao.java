package br.com.fiap.ExercicioII;

public class Aviao extends Thread {

	private String nome;
	private Aeroporto aeroporto;

	public Aviao(String nome, Aeroporto aeroporto) {
		this.setNome(nome);
		this.aeroporto = aeroporto;

	}

	public synchronized void aterrissar() {
		try {

			System.out.println(Thread.currentThread().getName() + ": \n Solicitando pista para pouso");
			this.aeroporto.aguardarPistaDisponivel();
			System.out.println(Thread.currentThread().getName() + ": \n Realizando procedimento de pouso");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void decolar() {
		System.out.println(Thread.currentThread().getName() + ": \n Solicitando pista para decolagem");
		try {
			this.aeroporto.aguardarPistaDisponivel();
			
			System.out.println(Thread.currentThread().getName() + ": \n Prosseguindo com procedimentos de voo");
			this.voar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private  synchronized void voar() {
		System.out.println(Thread.currentThread().getName() + ": \n Voando... ");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			this.decolar();
			this.aterrissar();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
