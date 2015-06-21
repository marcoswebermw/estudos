package br.com.mw.androidexemplorunonuithread;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;

public class BaixarImagemWeb {
	private static Bitmap bitmap;

	public void baixarImagem(final Activity atividade, final ImageView imgView) {
		Log.i("Classe BaixarImagemWeb", "Entrou no método baixarImagem()");

		final ProgressDialog progresso = new ProgressDialog(atividade);
		progresso.setMessage("Carregando Imagem...");
		progresso.show();

		new Thread() {
			public void run() {
				try {
					URL url = new URL(
							"http://www.picgifs.com/graphics/t/tux/graphics-tux-510908.gif");
					HttpURLConnection conexao = (HttpURLConnection) url
							.openConnection();
					InputStream stream = conexao.getInputStream();
					bitmap = BitmapFactory.decodeStream(stream);
				} catch (IOException e) {
					e.printStackTrace();
				}

				atividade.runOnUiThread(new Runnable() {
					@Override
					public void run() {
						progresso.setMessage("Imagem Carregada");
						imgView.setImageBitmap(bitmap);
						progresso.dismiss();
					}
				});
			}
		}.start();

	}
}
