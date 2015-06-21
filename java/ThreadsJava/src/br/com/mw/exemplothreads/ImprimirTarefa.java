package br.com.mw.exemplothreads;

import java.util.Random;

public class ImprimirTarefa implements Runnable {
	private final int sleepTime;
	private final String nomeTarefa;
	private final static Random gerador = new Random();

	public ImprimirTarefa(String nome) {
		// Identifica a thread em execução.
		nomeTarefa = nome;
		// Gera um número inteiro de 0 a 5000 (5 segundos).
		sleepTime = gerador.nextInt(5000);
	}

	@Override
	public void run() {
		try {
			System.out.printf("%s indo dormir por %d milisegundos. \n",
					nomeTarefa, sleepTime);
			// Coloca a thread para dormir.
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			System.out
					.printf("%s %s\n", nomeTarefa, "Terminou prematuramente.");
		}
		
		System.out.printf("%s sleeping terminado.\n", nomeTarefa);
	}

}
