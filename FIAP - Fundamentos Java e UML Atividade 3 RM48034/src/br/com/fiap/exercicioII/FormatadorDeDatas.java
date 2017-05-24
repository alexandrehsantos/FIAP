package br.com.fiap.exercicioII;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FormatadorDeDatas {
	public void retornarTodosFormatos(LocalDateTime data) {
		List<String> datas = new ArrayList<>();
		datas.add(data.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
		datas.add(data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ms")));
		datas.add(data.format(DateTimeFormatter.ofPattern("EEEE")));
		datas.add(data.format(DateTimeFormatter.ofPattern("yyyy")));
		datas.add(data.format(DateTimeFormatter.ofPattern("G")));
		
		for (String string : datas) {
			System.err.println(string);
		}
		
	}
}
