package br.com.mw.androidexemplointentfilter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void dispararAcaoTela(View view) {
		// Intenção de executar uma ação,
		// através de uma mensagem para o
		// sistema operacional por broadcast.
		Intent intent = new Intent("ACAO_TELA");
		startActivity(intent);

	}

	public void dispararAcaoTelaCategoriaTela(View view) {
		// Intenção de executar uma ação,
		// através de uma mensagem para o
		// sistema operacional por broadcast.
		Intent intent = new Intent("ACAO_TELA");
		intent.addCategory("CATEGORIA_TELA");
		startActivity(intent);

	}

	public void abrirNavegador(View view) {
		Uri uri = Uri.parse("http://www.google.com");
		Intent intent = new Intent(Intent.ACTION_VIEW);
		startActivity(intent);
	}
}
