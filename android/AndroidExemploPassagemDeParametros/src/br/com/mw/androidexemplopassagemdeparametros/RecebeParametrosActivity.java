package br.com.mw.androidexemplopassagemdeparametros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecebeParametrosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recebe_parametros);
		receberParametros();
	}

	private void receberParametros() {
		Intent intent = getIntent();
		if (intent != null) {
			Bundle parametros = intent.getExtras();
			if (parametros != null) {
				TextView tvNome = (TextView) findViewById(R.id.tvNome);
				TextView tvEmail = (TextView) findViewById(R.id.tvEmail);
				tvNome.setText(parametros.getString("nome"));
				tvEmail.setText(parametros.getString("email"));
			}
		}
	}

}
