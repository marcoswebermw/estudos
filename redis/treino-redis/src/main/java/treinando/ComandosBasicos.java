package treinando;

import redis.clients.jedis.Jedis;

public class ComandosBasicos {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		mostrarEcho(jedis);
		definirUltimoUsuarioLogado(jedis, "Tony Stark");
		pegarUltimoUsuarioLogado(jedis);
		excluirUltimoUsuarioLogado(jedis);
		jedis.close();
	}

	private static void excluirUltimoUsuarioLogado(Jedis jedis) {
		Long resultado = jedis.del("ultimo_usuario_logado");
		System.out.println(resultado);
	}

	private static void pegarUltimoUsuarioLogado(Jedis jedis) {
		String valor = jedis.get("ultimo_usuario_logado");
		System.out.println(valor);
	}

	private static void definirUltimoUsuarioLogado(Jedis jedis, String usuario) {
		String resultado = jedis.set("ultimo_usuario_logado", usuario);
		System.out.println(resultado);
	}

	private static void mostrarEcho(Jedis jedis) {
		String resultado = jedis.echo("ola redis!");
		System.out.println(resultado);
	}

}
