package br.com.mw.produtor_consumidor_com_sincronizacao_array_blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;

public class BufferBloqueado implements Buffer {
	private final ArrayBlockingQueue<Integer> bufferCompartilhado;

	public BufferBloqueado() {
		bufferCompartilhado = new ArrayBlockingQueue<Integer>(1);
	}

	@Override
	public void set(int valor) throws InterruptedException {
		bufferCompartilhado.put(valor);
		System.out.printf("%s%2d\t%s%d\n", "Produtor escreve ", valor,
				"Célula do buffer copiada\t", bufferCompartilhado.size());
	}

	@Override
	public int get() throws InterruptedException {
		int valorLido = bufferCompartilhado.take(); // Remove valor do buffer.
		System.out.printf("%s %2d\t%s%d\n", "Consumidor lê   ", valorLido,
				"Célula do buffer ocupada\t", bufferCompartilhado.size());
		return valorLido;
	}

}
