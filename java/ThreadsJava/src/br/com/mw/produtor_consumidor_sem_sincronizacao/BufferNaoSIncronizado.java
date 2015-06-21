package br.com.mw.produtor_consumidor_sem_sincronizacao;

public class BufferNaoSIncronizado implements Buffer {
	private int bufferCompartilhado = -1; // Valor compartilhado entre o consumidor e o produtor.
	
	@Override
	public void set(int valor) throws InterruptedException {
		System.out.printf("Produtor escreve \t\t%2d", valor);
		bufferCompartilhado = valor;
	}

	@Override
	public int get() throws InterruptedException {
		System.out.printf("Consumidor lê \t\t\t%2d", bufferCompartilhado);
		return bufferCompartilhado;
	}

}
