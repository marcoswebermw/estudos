package br.com.mw.exemplothreads.sincronizado;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TesteArrayCompartilhado {

	public static void main(String[] args) {
		SimpleArray arrayCompartilhado = new SimpleArray(6);
		// Criar duas tarefas para escreverem no array compartilhado.
		ArrayWriter tarefa1 = new ArrayWriter(1, arrayCompartilhado);
		ArrayWriter tarefa2 = new ArrayWriter(11, arrayCompartilhado);
		// Executar as tarefas com um ExecutorService.
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(tarefa1);
		executor.execute(tarefa2);
		executor.shutdown();
		try {
			// Espera 1 minuto por ambas tarefas terminarem sua execução.
			boolean tarefasTerminadas = executor.awaitTermination(1,
					TimeUnit.MINUTES);
			if (tarefasTerminadas) {
				System.out.println(arrayCompartilhado);
			} else {
				System.out
						.println("Tempo terminou enquanto esperava tarefas terminarem.");
			}
		} catch (InterruptedException e) {
			System.out
					.println("Interrompido enquanto esperando por tarefas terminarem.");
		}
	}
}
