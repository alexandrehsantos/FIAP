package br.com.fiap.exercicioV;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Criptografador {

	private String nomeArquivoDeCriptografado;
	private String nomeArquivoCriptografado;
	private String mensagem;

	public Criptografador(String nomeArquivoDeCriptografado, String nomeArquivoCriptografado) {
		super();
		this.nomeArquivoDeCriptografado = nomeArquivoDeCriptografado;
		this.nomeArquivoCriptografado = nomeArquivoCriptografado;
	}

	public void executaProcesso() {
		this.coletarMensagem();
		this.criarArquivo(this.nomeArquivoDeCriptografado, this.mensagem);
		this.criarArquivo(this.nomeArquivoCriptografado, this.gerarCriptografia());
	}

	private void coletarMensagem() {
		String mensagem = JOptionPane.showInputDialog("Digite uma mensagem que deseja codificar");

		if (mensagem != null) {
			this.mensagem = mensagem;
		}

	}

	private String gerarCriptografia() {
		StringBuilder conctMsg = new StringBuilder();
		for (int i = 0; i < this.mensagem.length(); i++) {
			char letra = mensagem.charAt(i);
			letra += 1;
			conctMsg.append(letra);
		}
		return conctMsg.toString();
	}

	private void criarArquivo(String nomeDoArquivo, String mensagem) {
		try {

			if (new File(nomeDoArquivo).createNewFile()) {
				try (FileOutputStream output = new FileOutputStream(nomeDoArquivo)) {
					for (int i = 0; i < mensagem.length(); i++) {
						output.write(mensagem.charAt(i));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getNomeArquivoDeCriptografado() {
		return nomeArquivoDeCriptografado;
	}

	public void setNomeArquivoDeCriptografado(String nomeArquivoDeCriptografado) {
		this.nomeArquivoDeCriptografado = nomeArquivoDeCriptografado;
	}

	public String getNomeArquivoCriptografado() {
		return nomeArquivoCriptografado;
	}

	public void setNomeArquivoCriptografado(String nomeArquivoCriptografado) {
		this.nomeArquivoCriptografado = nomeArquivoCriptografado;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
