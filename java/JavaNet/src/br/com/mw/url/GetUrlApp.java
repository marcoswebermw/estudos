package br.com.mw.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class GetUrlApp {
	public static void main(String[] args) {
		buscarPagina();
	}

	private static void error(String msg) {
		System.out.println(msg);
		System.exit(1);
	}

	private static void buscarPagina() {
		try {
			URL url = new URL("http://legendas.tv");
			BufferedReader entrada = new BufferedReader(new InputStreamReader(
					url.openStream()));
			String linha;
			while ((linha = entrada.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (MalformedURLException e) {
			error("Url Errada");
		} catch (IOException e) {
			error("Ocorreu uma Exceção de IO");
		}
	}
}
