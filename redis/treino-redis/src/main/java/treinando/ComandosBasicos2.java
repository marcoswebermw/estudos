package treinando;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class ComandosBasicos2 {

	public static void main(String[] args) {
		armazenarValores();
		filtrarValores();
		obterMultiplosValores();
		mostrarTamanhoValor();
		obterSubstring(4,8);
		anexarValor("1414");
	}

	private static void armazenarValores() {
		String dataDoSorteio1 = "04-09-2013";
		String numerosDoSorteio1 = "10, 11, 18, 42, 55, 56";
		String chave1 = String.format("resultado:%s:megasena", dataDoSorteio1);
		String dataDoSorteio2 = "07-09-2013";
		String numerosDoSorteio2 = "2, 21, 30, 35, 45, 50";
		String chave2 = String.format("resultado:%s:megasena", dataDoSorteio2);
		String dataDoSorteio3 = "21-09-2013";
		String numerosDoSorteio3 = "2, 13, 24, 41, 42, 44";
		String chave3 = String.format("resultado:%s:megasena", dataDoSorteio3);
		String dataDoSorteio4 = "02-10-2013";
		String numerosDoSorteio4 = "7, 15, 20, 23, 30, 41";
		String chave4 = String.format("resultado:%s:megasena", dataDoSorteio4);
		Jedis jedis = new Jedis("localhost");
		String resultado = jedis.mset(chave1, numerosDoSorteio1, chave2,
				numerosDoSorteio2, chave3, numerosDoSorteio3, chave4,
				numerosDoSorteio4);
		System.out.println(resultado);
		jedis.close();
	}

	private static Set<String> filtrarResultados(int mes, int ano) {
		String chave = "resultado:*-%02d-%04d:megasena";
		Jedis jedis = new Jedis("localhost");
		Set<String> valores = jedis.keys(String.format(chave, mes, ano));
		jedis.close();
		return valores;
	}

	private static void filtrarValores() {
		int mes = 10;
		int ano = 2013;
		Set<String> chaves = filtrarResultados(mes, ano);
		System.out.println("O(s) resultado(s) filtrado(s) é(são): " + chaves);
	}

	private static void obterMultiplosValores() {
		Jedis jedis = new Jedis("localhost");
		List<String> resultado = jedis.mget("resultado:15-11-2014:megasena",
				"resultado:16-12-2014:megasena");
		System.out.println("Os multiplos valores escolhidos são: " + resultado);
		jedis.close();
	}

	private static void mostrarTamanhoValor() {
		Jedis jedis = new Jedis("localhost");
		Long tamanho = jedis.strlen("resultado:15-11-2014:megasena");
		System.out.println("O tamanho do campo é: " + tamanho);
		jedis.close();
	}

	private static void obterSubstring(int inicio, int fim) {
		String chave = "resultado:15-11-2014:megasena";
		Jedis jedis = new Jedis("localhost");
		String substring = jedis.getrange(chave, inicio, fim);
		jedis.close();
		System.out.println("A substring obtida foi: " + substring);
	}

	private static void anexarValor(String valor_anexar) {
		String chave = "resultado:15-11-2014:megasena";
		Jedis jedis = new Jedis("localhost");
		Long resultado = jedis.append(chave, valor_anexar);
		System.out.println("O tamanho do campo com valor anexado ficou: " + resultado);
		jedis.close();
	}	
	
}
