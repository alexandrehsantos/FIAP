package br.com.fiap.exercicioII;

import java.time.LocalDateTime;

public class MainDatas {
	public static void main(String[] args) {
		FormatadorDeDatas formatadorDeDatas = new FormatadorDeDatas();
		LocalDateTime data = LocalDateTime.of(2012, 9, 10, 12, 00);
		formatadorDeDatas.retornarTodosFormatos(data);
	}
}
