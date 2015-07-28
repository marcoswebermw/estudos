package br.com.mw.androidexemploslayout;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import br.com.mw.androidexemploslayout.dao.AlunoDAO;
import br.com.mw.androidexemploslayout.modelo.Aluno;

// Classe que representa a tela do formulário.
public class FormularioActivity extends Activity {
	private FormularioHelper helper;
	private Button btnGravar;
	private Aluno alunoAlt; // Aluno para ser Alterado.
	private String caminhoArquivo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_formulario);
		// Pega o objeto aluno que foi enviado de forma serializada.
		Intent intent = getIntent();
		alunoAlt = (Aluno) intent.getSerializableExtra("alunoClicado");
		// Classe auxíliar com operações pertencentes a esta classe.
		// O construtor recebe a instância desta própria classe.
		helper = new FormularioHelper(this);
		btnGravar = (Button) findViewById(R.id.btnGravar);
		// Se houver aluno para alterar muda o texto do botão.
		// E coloca as informações do aluno no formulário para edição.
		if (alunoAlt != null) {
			btnGravar.setText("Alterar");
			helper.colocaAlunoNoFormularioParaAlterar(alunoAlt);
		}
		criarListeners();
	}

	// Método invocado sempre que houver uma resposta de uma outra activity.
	// No caso a activity da foto retorna se a foto deve ser gravada ou não.
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 123) {
			if (resultCode == Activity.RESULT_OK) {
				helper.carregaImagem(caminhoArquivo);
			} else {
				caminhoArquivo = null;
			}
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	private void criarListeners() {
		criarListenerDoBtnGravar();
		criarListenarDaImageViewFoto();
	}

	private void criarListenarDaImageViewFoto() {
		// Pegar foto da camera.
		ImageView foto = helper.getFoto();
		foto.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// Define uma intent com intenção de abrir
				// a captura de imagem.
				Intent irParaCamera = new Intent(
						MediaStore.ACTION_IMAGE_CAPTURE);
				// Define o caminho no cartão SD onde será gravada a imagem.
				// Define que será um arquivo e o indica para o android em
				// forma de URI.
				caminhoArquivo = Environment.getExternalStorageDirectory()
						.toString() + "/" + System.currentTimeMillis() + ".png";
				File arquivo = new File(caminhoArquivo);
				Uri localImagem = Uri.fromFile(arquivo);
				// Vai para activity da camera e indica onde a foto deve ser
				// gravada. E chama a activity passando um código para a
				// identificação da requisição, de forma que ela devolva um
				// resultado e saibamos de que requisição é, sendo tratada
				// pelo método da activity onActivityResult().
				irParaCamera.putExtra(MediaStore.EXTRA_OUTPUT, localImagem);
				startActivityForResult(irParaCamera, 123);
			}
		});
	}

	private void criarListenerDoBtnGravar() {
		btnGravar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// Pega os dados do formulario e coloca em um objeto Aluno.
				// Depois cria um DAO para realização de operações no banco.
				Aluno alunoDoFormulario = helper.pegaAlunoDoFormulario();
				AlunoDAO dao = new AlunoDAO(FormularioActivity.this);
				// Verifica se o aluno será salvo ou alterado.
				if (alunoAlt == null) {
					dao.salva(alunoDoFormulario);
				} else {
					alunoDoFormulario.setId(alunoAlt.getId());
					dao.altera(alunoDoFormulario);
				}
				// Libera recursos.
				dao.close();
				finish(); // Botão voltar.
			}
		});
	}

}
