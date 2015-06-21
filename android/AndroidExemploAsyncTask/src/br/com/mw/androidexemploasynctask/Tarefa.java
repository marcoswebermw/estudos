package br.com.mw.androidexemploasynctask;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

public class Tarefa extends AsyncTask<String, String, Bitmap> {
	private Context contexto;
	private TarefaInterface tarefaInterface;
	private ProgressDialog progresso;

	public Tarefa(Context contexto, TarefaInterface tarefaInterface) {
		this.contexto = contexto;
		this.tarefaInterface = tarefaInterface;
	}

	@Override
	protected void onPreExecute() {
		// Executa antes de entrar na thread de internet.
		progresso = new ProgressDialog(contexto);
		progresso.setMessage("Carregando Imagem...");
		progresso.show();
	}

	@Override
	protected Bitmap doInBackground(String... urlImagem) {
		Log.i("Url", "URL da imagem: " + urlImagem[0]);
		// Thread de internet.
		Bitmap img = null;
		try {
			publishProgress("Ainda carregando...");
			URL url = new URL(urlImagem[0]);
			HttpURLConnection conexao = (HttpURLConnection) url
					.openConnection();
			InputStream stream = conexao.getInputStream();
			img = BitmapFactory.decodeStream(stream);
			publishProgress("Imagem Carregada!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}

	@Override
	protected void onProgressUpdate(String... values) {
		progresso.setMessage(values[0]);
	}

	@Override
	protected void onPostExecute(Bitmap resultDoInBackground) {
		// Thread principal.
		tarefaInterface.depoisDownload(resultDoInBackground);
		progresso.dismiss();
	}

}
