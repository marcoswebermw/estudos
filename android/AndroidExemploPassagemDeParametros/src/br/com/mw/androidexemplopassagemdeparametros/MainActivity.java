package br.com.mw.androidexemplopassagemdeparametros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void passarParametro(View view) {
		EditText edtNome = (EditText) findViewById(R.id.edtNome);
		EditText edtEmail = (EditText) findViewById(R.id.edtEmail);
		Bundle parametros = new Bundle();
		parametros.putString("nome", edtNome.getText().toString());
		parametros.putString("email", edtEmail.getText().toString());
		Intent intent = new Intent(this, RecebeParametrosActivity.class);
		intent.putExtras(parametros);
		startActivity(intent);
	}

}
