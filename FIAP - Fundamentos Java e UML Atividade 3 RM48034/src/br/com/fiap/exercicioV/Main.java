package br.com.fiap.exercicioV;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Criptografador criptografador = new Criptografador("mensagemDecodificada.txt", "mensagemCodificada.txt");
		criptografador.executaProcesso();

		JOptionPane.showMessageDialog(null, "Processo encerrados \n Confira os arquivos criados na raiz do projeto: \n "
				+ criptografador.getNomeArquivoCriptografado() + " " + criptografador.getNomeArquivoDeCriptografado());
	}
}
