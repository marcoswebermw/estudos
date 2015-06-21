package br.com.mw.produtor_consumidor_com_sincronizacao_array_blocking_queue;

import java.util.Random;

public class Consumidor implements Runnable {
	private final static Random gerador = new Random();
	private final Buffer lugarCompartilhado;

	public Consumidor(Buffer compartilhado) {
		this.lugarCompartilhado = compartilhado;
	}

	@Override
	public void run() {
		int soma = 0;
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(gerador.nextInt(3000));
				soma += lugarCompartilhado.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("\n%s %d\n%s\n", "Consumidor lê o total dos valores",
				soma, "Terminando o consumidor");
	}

}
