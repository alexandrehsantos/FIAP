package br.com.fiap.ExercicioI;

import java.util.ArrayList;
import java.util.List;

public class ExibidorDeMensagens implements Runnable {

	private List<String> mensagens;

	public ExibidorDeMensagens() {
		super();
		this.carregarMensagens();
	}

	private void carregarMensagens() {
		mensagens = new ArrayList<>();
		mensagens.add("msg1");
		mensagens.add("msg2");
		mensagens.add("msg3");
		mensagens.add("msg4");
		mensagens.add("msg5");
		mensagens.add("msg6");
		mensagens.add("msg7");
		mensagens.add("msg8");
		mensagens.add("msg9");
		mensagens.add("msg10");
		mensagens.add("msg11");
		mensagens.add("msg12");
		mensagens.add("msg13");
		mensagens.add("msg14");
		mensagens.add("msg15");
	}

	private String mostrarMensagem(int index) {

		return mensagens.get(index);
	}

	public void rotina() throws InterruptedException {
		for (int i = 0; i < mensagens.size(); i++) {
			System.out.println(this.mostrarMensagem(i));
			Thread.sleep(20000);
		}
	}

	@Override
	public void run() {
				try {
					this.rotina();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

