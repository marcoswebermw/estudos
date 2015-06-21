package br.com.exemplosoma;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SomaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_soma);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.soma, menu);
		return true;
	}

	public void somar(View view) {
		EditText edtPrimeiroValor = (EditText) findViewById(R.id.edt_prim_valor);
		EditText edtSegundoValor = (EditText) findViewById(R.id.edt_segun_valor);
		int soma = Integer.parseInt(edtPrimeiroValor.getText().toString())
				+ Integer.parseInt(edtSegundoValor.getText().toString());
		Toast.makeText(getBaseContext(), "A soma é: " + soma, Toast.LENGTH_LONG)
				.show();
		;
	}
}
