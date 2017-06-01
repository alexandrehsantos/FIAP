package br.com.fiap.ExercicioII;

public class Aeroporto {

	private String nomeDoAeroporto;
	private boolean estadoDaPista;

	public Aeroporto(String nomeDoAeroporto) {
		this.nomeDoAeroporto = nomeDoAeroporto;
	}

	public synchronized void aguardarPistaDisponivel() {
		while (true) {
			
			
			if (estadoDaPista) {
				
				System.out.println(this.toString() + " Informa: Pista liberada");
			} else {
				System.out.println(this.toString() + " Informa: Pista não disponível! Aguarde Liberação");
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private synchronized void aguardeLiberacao() {
		System.out.println(this.toString() + " Informa: Pista não disponível! Aguarde Liberação");
		try {
			this.wait();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// private void threadWait() {
	// try {
	// Thread.currentThread().wait();
	// } catch (InterruptedException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();thread
	// }
	// }

	@Override
	public String toString() {
		return "Aeroporto - " + nomeDoAeroporto;
	}

	public synchronized void alterarEstadoDaPista() {
		while (true) {
			System.out.println("Estado false");
			this.estadoDaPista = false;
			this.aguardar(3000);

			System.out.println("Estado true");
			
			this.estadoDaPista = true;
			this.notifyAll();
			this.aguardar(3000);
		}

	}

	private void aguardar(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
