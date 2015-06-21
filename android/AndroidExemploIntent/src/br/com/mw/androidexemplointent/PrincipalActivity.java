package br.com.mw.androidexemplointent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
	}

	public void chamarSegundaTela(View view) {
		Intent intent = new Intent(this, SegundaActivity.class);
		startActivity(intent);
	}

	public void chamarNavegador(View view){
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://filmeshunter.com"));
		startActivity(intent);
	}
}
