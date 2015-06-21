package br.com.mw.androidexemplointentfilter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Tela1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);
	}

	public void voltar(View view) {
		finish();
	}
}
