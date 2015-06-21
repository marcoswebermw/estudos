package br.com.mw.produtor_consumidor_sem_sincronizacao;

import java.util.Random;

public class Produtor implements Runnable {
	private final static Random gerador = new Random();
	private final Buffer lugarCompartilhado; // Referencia para objeto
												// compartilhado.

	public Produtor(Buffer compartilhado) {
		this.lugarCompartilhado = compartilhado;
	}

	// Armazena valores de 1 a 10 no lugarCompartilhado.
	@Override
	public void run() {
		int soma = 0;
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(gerador.nextInt(3000));
				lugarCompartilhado.set(i);
				soma += i;
				System.out.printf("\t\t\t\t%2d\n", soma);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out
				.println("O produtor terminou de produzir\nTerminando produtor");
	}

}
