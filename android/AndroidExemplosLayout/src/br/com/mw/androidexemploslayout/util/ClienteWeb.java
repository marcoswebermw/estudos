package br.com.mw.androidexemploslayout.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class ClienteWeb {

	private String urlServer;

	public ClienteWeb(String urlServer) {
		this.urlServer = urlServer;

	}

	public String postar(String dadosJson) {
		String respostaEmJSON = null;
		try {
			// Faz requisição ao servidor.
			HttpClient clienteHttp = new DefaultHttpClient();
			// Postar os dados.
			HttpPost postHttp = new HttpPost(urlServer);

			postHttp.setEntity(new StringEntity(dadosJson));
			// Avisando que será enviado um arquivo JSON.
			postHttp.setHeader("Content-type", "application/json");
			// Pedir o servidor para tambem responder em JSON.
			postHttp.setHeader("Accept", "application/json");

			// Resposta do servidor em JSON.
			HttpResponse respostaHttp = clienteHttp.execute(postHttp);
			HttpEntity resposta = respostaHttp.getEntity();			
			respostaEmJSON = EntityUtils.toString(resposta);

		} catch (Exception e) {
			new RuntimeException(e);
		}
		return respostaEmJSON;
	}

}
