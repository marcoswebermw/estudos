package br.com.mw.androidexemplointent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class SegundaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.segunda, menu);
		return true;
	}

	public void voltar(View view) {
		finish();
	}
}
