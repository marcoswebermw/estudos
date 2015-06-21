package br.com.mw.produtor_consumidor_com_sincronizacao_array_blocking_queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TesteBufferBloqueado {
	public static void main(String[] args) {
		ExecutorService aplicacao = Executors.newCachedThreadPool();
		Buffer bufferCompartilhado = new BufferBloqueado();

		aplicacao.execute(new Produtor(bufferCompartilhado));
		aplicacao.execute(new Consumidor(bufferCompartilhado));
		aplicacao.shutdown();
	}
}
