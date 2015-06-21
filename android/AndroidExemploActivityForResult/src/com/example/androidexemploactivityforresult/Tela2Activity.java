package com.example.androidexemploactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela2);

		receberDados();
	}

	private void receberDados() {
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

	public void aceitou(View view) {
		Intent intent = new Intent();
		intent.putExtra("msg", "Aceitou");
		setResult(1, intent);
		finish();
	}

	public void rejeitou(View view) {
		Intent intent = new Intent();
		intent.putExtra("msg", "Rejeitou");
		setResult(2, intent);
		finish();
	}
}
