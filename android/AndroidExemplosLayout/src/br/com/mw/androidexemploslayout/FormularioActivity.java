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

// Classe que representa a tela do formul�rio.
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
		// Classe aux�liar com opera��es pertencentes a esta classe.
		// O construtor recebe a inst�ncia desta pr�pria classe.
		helper = new FormularioHelper(this);
		btnGravar = (Button) findViewById(R.id.btnGravar);
		// Se houver aluno para alterar muda o texto do bot�o.
		// E coloca as informa��es do aluno no formul�rio para edi��o.
		if (alunoAlt != null) {
			btnGravar.setText("Alterar");
			helper.colocaAlunoNoFormularioParaAlterar(alunoAlt);
		}
		criarListeners();
	}

	// M�todo invocado sempre que houver uma resposta de uma outra activity.
	// No caso a activity da foto retorna se a foto deve ser gravada ou n�o.
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
				// Define uma intent com inten��o de abrir
				// a captura de imagem.
				Intent irParaCamera = new Intent(
						MediaStore.ACTION_IMAGE_CAPTURE);
				// Define o caminho no cart�o SD onde ser� gravada a imagem.
				// Define que ser� um arquivo e o indica para o android em
				// forma de URI.
				caminhoArquivo = Environment.getExternalStorageDirectory()
						.toString() + "/" + System.currentTimeMillis() + ".png";
				File arquivo = new File(caminhoArquivo);
				Uri localImagem = Uri.fromFile(arquivo);
				// Vai para activity da camera e indica onde a foto deve ser
				// gravada. E chama a activity passando um c�digo para a
				// identifica��o da requisi��o, de forma que ela devolva um
				// resultado e saibamos de que requisi��o �, sendo tratada
				// pelo m�todo da activity onActivityResult().
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
				// Depois cria um DAO para realiza��o de opera��es no banco.
				Aluno alunoDoFormulario = helper.pegaAlunoDoFormulario();
				AlunoDAO dao = new AlunoDAO(FormularioActivity.this);
				// Verifica se o aluno ser� salvo ou alterado.
				if (alunoAlt == null) {
					dao.salva(alunoDoFormulario);
				} else {
					alunoDoFormulario.setId(alunoAlt.getId());
					dao.altera(alunoDoFormulario);
				}
				// Libera recursos.
				dao.close();
				finish(); // Bot�o voltar.
			}
		});
	}

}
