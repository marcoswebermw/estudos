package br.com.mw.produtor_consumidor_com_sincronizacao_tradicional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TesteBufferSincronizado {
	public static void main(String[] args) {
		ExecutorService aplicacao = Executors.newCachedThreadPool();
		Buffer bufferCompartilhado = new BufferSincronizado();

		System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n", "Operação ", "Buffer Compartilhado ",
				"Ocupado ", "---------", "------\t\t------");

		aplicacao.execute(new Produtor(bufferCompartilhado));
		aplicacao.execute(new Consumidor(bufferCompartilhado));
		aplicacao.shutdown();
	}
}
