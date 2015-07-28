package br.com.mw.androidexemploslayout.adapter;

import java.util.List;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.mw.androidexemploslayout.R;
import br.com.mw.androidexemploslayout.modelo.Aluno;

public class ListaAlunosAdapter extends BaseAdapter {

	private List<Aluno> alunos;
	private Activity activity;

	public ListaAlunosAdapter(List<Aluno> alunos, Activity activity) {
		this.alunos = alunos;
		this.activity = activity;
	}

	@Override
	public int getCount() {
		return alunos.size();
	}

	@Override
	public Object getItem(int posicao) {
		return alunos.get(posicao);
	}

	@Override
	public long getItemId(int posicao) {
		Aluno aluno = alunos.get(posicao);
		return aluno.getId();
	}

	@Override
	public View getView(int posicao, View convertView, ViewGroup parent) {

		Aluno aluno = alunos.get(posicao);

		LayoutInflater inflater = activity.getLayoutInflater();
		View linha = inflater.inflate(R.layout.linha_listagem, null);
		View fundo = linha.findViewById(R.id.fundo);

		mudarLinhasdoFundo(fundo, posicao);
		colocarValoresNaLinhaEmLandscape(linha, aluno);

		TextView nome = (TextView) linha.findViewById(R.id.nome);
		nome.setText(aluno.getNome());

		mostrarFoto(linha, aluno);

		return linha;
	}

	private void mostrarFoto(View linha, Aluno aluno) {
		ImageView foto = (ImageView) linha.findViewById(R.id.foto);

		if (aluno.getFoto() != null) {
			Bitmap fotoAluno = BitmapFactory.decodeFile(aluno.getFoto());
			Bitmap fotoReduzida = Bitmap.createScaledBitmap(fotoAluno, 50, 50,
					true);
			foto.setImageBitmap(fotoReduzida);
		} else {
			Drawable semFoto = activity.getResources().getDrawable(
					R.drawable.ic_insert_photo_black_24dp);
			foto.setImageDrawable(semFoto);
		}
	}

	private void colocarValoresNaLinhaEmLandscape(View linha, Aluno aluno) {

		TextView telefone = (TextView) linha.findViewById(R.id.telefone);
		TextView email = (TextView) linha.findViewById(R.id.email);
		if (telefone != null) {
			telefone.setText(aluno.getTelefone());
		}
		if (email != null) {
			email.setText(aluno.getEmail());
		}
	}

	private void mudarLinhasdoFundo(View fundo, int posicao) {
		if (posicao % 2 == 0) {
			fundo.setBackgroundColor(activity.getResources().getColor(
					R.color.linha_par));
		} else {
			fundo.setBackgroundColor(activity.getResources().getColor(
					R.color.linha_impar));
		}
	}

}
