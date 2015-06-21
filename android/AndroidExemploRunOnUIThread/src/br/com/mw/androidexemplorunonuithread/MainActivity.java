package br.com.mw.androidexemplorunonuithread;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void baixarImagem(View view) {
		new BaixarImagemWeb().baixarImagem(this,
				(ImageView) findViewById(R.id.imageView1));
		Log.i("baixarImagem", "Entrou no método baixarImagem()");
	}
}
