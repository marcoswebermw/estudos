package br.com.mw.exemplothreadprincipalandroid;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	private Handler handler = new Handler(); // Para manipular thread principal.

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void baixarImagem(View view) {
		new Thread() { // Criando nova thread.
			public void run() {
				try {

					URL url = new URL(
							"http://www.system-linux.net/image/tux/tux-samourai_overlord59-tux.png");
					HttpURLConnection conexao = (HttpURLConnection) url
							.openConnection();
					// Define que a conexao aceitará entradas.
					conexao.setDoInput(true);
					// Abra a conexao com a url passada.
					conexao.connect();
					// Recebe o conteúdo da url.
					InputStream input = conexao.getInputStream();
					// Transforma o conteúdo em bitmap.
					final Bitmap imagem = BitmapFactory.decodeStream(input);

					Log.i("Download", "baixou imagem.");

					// Tem que ser final para modificar a imagem na thread da
					// activity principal.
					final ImageView iv = (ImageView) findViewById(R.id.imagemBaixada);
					// Acessando a thread principal da activity.
					handler.post(new Runnable() {
						public void run() {
							iv.setImageBitmap(imagem);
						}
					});
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

}
