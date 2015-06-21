package com.example.androidexemploactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	public static final int CONSTANTE_TELA_1 = 1;
	public static final int CONSTANTE_TELA_2 = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void enviarDadosTela1(View view) {
		EditText nome = (EditText) findViewById(R.id.edtNome);
		EditText email = (EditText) findViewById(R.id.edtEmail);
		Bundle parametros = new Bundle();
		parametros.putString("nome", nome.getText().toString());
		parametros.putString("email", email.getText().toString());
		Intent intent = new Intent(this, Tela1Activity.class);
		intent.putExtras(parametros);
		startActivityForResult(intent, CONSTANTE_TELA_1);
	}

	public void enviarDadosTela2(View view) {
		EditText nome = (EditText) findViewById(R.id.edtNome);
		EditText email = (EditText) findViewById(R.id.edtEmail);
		Bundle parametros = new Bundle();
		parametros.putString("nome", nome.getText().toString());
		parametros.putString("email", email.getText().toString());
		Intent intent = new Intent(this, Tela2Activity.class);
		intent.putExtras(parametros);
		/* Passa os dados para a outra tela e indica qual a tela que chamou a outra.
		 * O código (constante) será usado no metodo onActivityResult para identificar a tela
		 * de retorno.
		 */
		startActivityForResult(intent, CONSTANTE_TELA_2);
	}

	@Override
	protected void onActivityResult(int codigoTela, int codResultado,
			Intent intent) {
		if (codigoTela == CONSTANTE_TELA_1) {
			Bundle parametros = intent.getExtras();
			if (parametros != null) {
				String msg = parametros.getString("msg");
				Toast.makeText(
						this,
						"TELA 1 - RESULTADO: " + codResultado + " - MENSAGEM: "
								+ msg, Toast.LENGTH_LONG).show();
				;
			}
		} else if (codigoTela == CONSTANTE_TELA_2) {
			Bundle parametros = intent.getExtras();
			if (parametros != null) {
				String msg = parametros.getString("msg");
				Toast.makeText(
						this,
						"TELA 2 - RESULTADO: " + codResultado + " - MENSAGEM: "
								+ msg, Toast.LENGTH_LONG).show();
				;
			}
		}
	}
}
