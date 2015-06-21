package br.com.mw.androidexemploasynctask;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements TarefaInterface {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void baixarImagem(View view) {
		Tarefa tarefa = new Tarefa(this, this);
		tarefa.execute("http://tux.crystalxp.net/png/opensec-tux-mario-1732.png");
	}

	@Override
	public void depoisDownload(Bitmap bitmap) {
		ImageView imgView = (ImageView) findViewById(R.id.imageView1);
		imgView.setImageBitmap(bitmap);
	}

}
