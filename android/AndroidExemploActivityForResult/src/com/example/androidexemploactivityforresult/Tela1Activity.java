package com.example.androidexemploactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);

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

	public void aceitou(View view){
		Intent intent = new Intent();
		intent.putExtra("msg", "Aceitou");
		setResult(RESULT_OK, intent);
		finish();
	}
	
	public void rejeitou(View view){
		Intent intent = new Intent();
		intent.putExtra("msg", "Rejeitou");
		setResult(RESULT_CANCELED, intent);
		finish();
	}
	
}
