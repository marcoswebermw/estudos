package br.com.mw.exemplothreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutarTarefa {
	public static void main(String[] args) {
		ImprimirTarefa tarefa1 = new ImprimirTarefa("Tarefa 1");
		ImprimirTarefa tarefa2 = new ImprimirTarefa("Tarefa 2");
		ImprimirTarefa tarefa3 = new ImprimirTarefa("Tarefa 3");
		System.out.println("Iniciando Executor...");
		// Cria ExecutorService para gerenciar as threads.
		ExecutorService executorDeThreads = Executors.newCachedThreadPool();
		// Inicia threads e as coloca em estado Runnable.
		executorDeThreads.execute(tarefa1);
		executorDeThreads.execute(tarefa2);
		executorDeThreads.execute(tarefa3);
		// Encerrando os trabalhos das threads quando suas tarefas estiverem
		// completas.
		executorDeThreads.shutdown();
		System.out.println("Tarefas iniciaram... main finalizada. \n");
	}
}
