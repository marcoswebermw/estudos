package br.com.mw.androidexemploslayout;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import br.com.mw.androidexemploslayout.modelo.Aluno;

// Classe criada para simplificar as opera��es dentro
// da classe Formulario.
public class FormularioHelper {

	private EditText edtNome;
	private EditText edtEmail;
	private EditText edtTelefone;
	private RatingBar ratingNota;
	private ImageView foto;
	private Aluno aluno;

	// Construtor que recebe o objeto que representa a tela de formul�rio.
	// Associa os dados dos xml com o c�digo java.
	public FormularioHelper(FormularioActivity form) {
		edtNome = (EditText) form.findViewById(R.id.edtNome);
		edtEmail = (EditText) form.findViewById(R.id.edtEmail);
		edtTelefone = (EditText) form.findViewById(R.id.edtTelefone);
		ratingNota = (RatingBar) form.findViewById(R.id.ratingBarNota);
		foto = (ImageView) form.findViewById(R.id.foto);
		aluno = new Aluno(); // Inicializa o objeto.
	}

	// Retorna um objeto aluno com os valores contidos no formul�rio.
	public Aluno pegaAlunoDoFormulario() {
		Aluno a = new Aluno();
		a.setNome(edtNome.getText().toString());
		a.setEmail(edtEmail.getText().toString());
		a.setTelefone(edtTelefone.getText().toString());
		a.setNota(Double.valueOf(ratingNota.getRating()));
		a.setFoto(this.aluno.getFoto());
		return a;
	}

	// Pega informa��es de um objeto Aluno e os coloca no formul�rio para
	// edi��o.
	public void colocaAlunoNoFormularioParaAlterar(Aluno alunoParaSerAlterado) {
		// aluno � uma inst�ncia de classe(um atributo).
		aluno = alunoParaSerAlterado;
		edtNome.setText(alunoParaSerAlterado.getNome());
		edtEmail.setText(alunoParaSerAlterado.getEmail());
		edtTelefone.setText(alunoParaSerAlterado.getTelefone());
		ratingNota.setRating(alunoParaSerAlterado.getNota().floatValue());
		// Carrega a foto do aluno na tela se houver.
		if (alunoParaSerAlterado.getFoto() != null) {
			carregaImagem(alunoParaSerAlterado.getFoto());
		}
	}

	public ImageView getFoto() {
		return foto;
	}

	// Coloca a imagem no ImageView da tela e define o caminho da imagem
	// para o atributo foto do objeto aluno.
	// A foto apenas teve seu caminho definido no objeto aluno mas ainda
	// n�o foi gravada no banco.
	public void carregaImagem(String caminhoArquivo) {
		aluno.setFoto(caminhoArquivo);
		// Pega a foto definida no caminho e a transforma em Bitmap.
		// Depois reduz a imagem. Em seguida carrega a imagemReduzida na
		// ImageView.
		Bitmap imagem = BitmapFactory.decodeFile(caminhoArquivo);
		Bitmap imagemReduzida = Bitmap.createScaledBitmap(imagem, 100, 100,
				true);

		foto.setImageBitmap(imagemReduzida);
	}

}
