package br.com.fiap.ExercicioII;

public class AlterarEstado implements Runnable{
	private Aeroporto aeroporto;

	public AlterarEstado(Aeroporto aeroporto){
		this.aeroporto = aeroporto;
	}

	@Override
	public void run() {
		aeroporto.alterarEstadoDaPista();
	}
	
	
	
}
