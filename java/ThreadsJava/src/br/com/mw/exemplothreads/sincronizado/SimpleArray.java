package br.com.mw.exemplothreads.sincronizado;

import java.util.Arrays;
import java.util.Random;

public class SimpleArray {
	private final int[] array; // Array que sera comportilhado com varias
								// threads.
	private int escreveIndice = 0; // Indice do proximo elemento a ser escrito
									// no array.
	private final static Random generator = new Random();

	public SimpleArray(int size) {
		array = new int[size];
	}

	// Adiciona um valor ao array compartilhado pelas threads.
	public synchronized void add(int valor) {
		int posicao = escreveIndice;
		try {
			// Exemplo para estudo. Totalmente desnecessario o sleep.
			Thread.sleep(generator.nextInt(5000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		array[posicao] = valor;
		System.out.printf("%s escreveu %2d para elemento %s.\n", Thread
				.currentThread().getName(), valor, posicao);
		++escreveIndice;
		System.out.printf("Próximo indice a ser escrito %d.\n", escreveIndice);
	}

	public String toString() {
		return "\nConteúdo do SimpleArray:\n " + Arrays.toString(array);
	}
}
