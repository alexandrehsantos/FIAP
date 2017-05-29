package br.com.fiap.ExercicioI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MostradorDoTempo implements Runnable {

	@Override
	public void run() {

		while (true) {
			LocalDateTime now = LocalDateTime.now();
			String dataHora = now.format(DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss"));
			System.out.println(dataHora);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
