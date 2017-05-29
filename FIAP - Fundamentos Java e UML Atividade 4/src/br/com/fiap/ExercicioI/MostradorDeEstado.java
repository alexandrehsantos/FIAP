package br.com.fiap.ExercicioI;

import java.util.List;

public class MostradorDeEstado implements Runnable {

	private List<Thread> thread2;

	public MostradorDeEstado(List<Thread> thread) {
		thread2 = thread;
	}

	@Override
	public void run() {
		while (true) {
			for (Thread thread : thread2) {
				System.out.println(thread.getState().toString() + " - "+ thread.getName());
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

