package br.com.mw.produtor_consumidor_com_sincronizacao_tradicional;

public class BufferSincronizado implements Buffer {
	private int bufferCompartilhado = -1;
	private boolean ocupado = false; // Indica se o buffer esta ocuupado.

	@Override
	public synchronized void set(int valor) throws InterruptedException {
		// Verifica se o buffer esta ocupado.
		while (ocupado) {
			System.out.println("Produtor esta tentando escrever.");
			mostrarEstado("Buffer Cheio. O Produtor espera.");
			// Assegura que a thread vai ficar em modo de espera.
			wait();
		}
		// Como o buffer nao esta mais ocupado...
		// Define o novo valor do buffer;
		bufferCompartilhado = valor;
		mostrarEstado("O produtor escreve " + bufferCompartilhado);
		// Agora libera o buffer para leitura e bloqueia para escrita.
		ocupado = true;
		// Notifica todas as threads para entrar em
		// modo de execucao (Runnable).
		notifyAll();
	}

	@Override
	public synchronized int get() throws InterruptedException {
		// Verifica se o buffer esta vazio.
		while (!ocupado) {
			System.out.println("Consumidor esta tentando ler.");
			mostrarEstado("Buffer vazio. O Consumidor espera.");
			// Assegura que a thread vai ficar esperando
			// a liberacao do buffer.
			wait();
		}
		// Lê o buffer.
		mostrarEstado("O consumidor lê " + bufferCompartilhado);
		// Agora indica que o Produtor ja pode escrever novamente.
		ocupado = false;
		// Notifica todas as threads que ja podem entrar em
		// modo de execucao (Runnable).
		notifyAll();
		return bufferCompartilhado;
	}

	private void mostrarEstado(String operacao) {
		System.out.printf("%-40s%d\t\t%b\n\n", operacao, bufferCompartilhado,
				ocupado);
	}

}
