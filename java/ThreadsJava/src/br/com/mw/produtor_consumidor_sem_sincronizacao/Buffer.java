package br.com.mw.produtor_consumidor_sem_sincronizacao;

// Buffer servirá para armezanar valores compartilhados entre as threads.
public interface Buffer {

	// Será usada pela classe produtora.
	public void set(int valor) throws InterruptedException;
	
	// Será usada pela classe consumidora.
	public int get() throws InterruptedException;
}
