package br.com.mw.produtor_consumidor_sem_sincronizacao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TesteBufferCompartilhado {

	public static void main(String[] args) {
		// Cria um pool de threads.
		ExecutorService aplicacao = Executors.newCachedThreadPool();

		// Cria um buffer nao sincronizado para armazenar inteiros.
		Buffer buffercompartilhado = new BufferNaoSIncronizado();

		System.out.println("Ação\t\t\t\tValor\t\tSoma Produzia\tSomaConsumida");
		System.out.println("---------------------\t\t---------\t--------------\t--------------\n");

		aplicacao.execute(new Produtor(buffercompartilhado));
		aplicacao.execute(new Consumidor(buffercompartilhado));

		// Termina a aplicacao quando as tarefas estao completas.
		aplicacao.shutdown();
	}
}
