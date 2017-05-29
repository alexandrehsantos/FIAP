package br.com.fiap.ExercicioI;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		ExibidorDeMensagens executorDeTarefas1 = new ExibidorDeMensagens();
		MostradorDoTempo mostradorDoTempo = new MostradorDoTempo();
		Thread thread1 = new Thread(executorDeTarefas1);
		Thread thread2 = new Thread(mostradorDoTempo);

		List<Thread> threads = new ArrayList<>();
		threads.add(thread1);
		threads.add(thread2);
		
		MostradorDeEstado mostradorDeEstado = new MostradorDeEstado(threads);
		Thread thread0 = new Thread(mostradorDeEstado);
	
		threads.add(thread0);

		thread0.start();	
		thread1.start();
		thread2.start();

	}
}
