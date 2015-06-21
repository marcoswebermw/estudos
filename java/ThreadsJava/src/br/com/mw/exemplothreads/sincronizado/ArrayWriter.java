package br.com.mw.exemplothreads.sincronizado;

public class ArrayWriter implements Runnable {
	private final SimpleArray arraySimplesCompartilhado;
	private final int valorInicial;

	public ArrayWriter(int valor, SimpleArray array) {
		arraySimplesCompartilhado = array;
		valorInicial = valor;
	}

	@Override
	public void run() {
		for (int i = valorInicial; i < valorInicial + 3; i++) {
			arraySimplesCompartilhado.add(i);
		}
	}

}
