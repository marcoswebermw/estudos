package br.com.mw.androidexemploslayout.task;

import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.Toast;
import br.com.mw.androidexemploslayout.dao.AlunoDAO;
import br.com.mw.androidexemploslayout.modelo.Aluno;
import br.com.mw.androidexemploslayout.util.AlunoConverter;
import br.com.mw.androidexemploslayout.util.ClienteWeb;

// Classe para facilitar o trabalho com threads sem encher o código
// da classe com a UIThread principal com classes anônimas.
public class EnviarAlunosTask extends AsyncTask<Integer, Double, String> {

	private final Activity contexto;
	private ProgressDialog progress;

	public EnviarAlunosTask(Activity contexto) {
		this.contexto = contexto;
	}

	// Executado antes do doInBackground().
	// Código executado pela thread da UI.

	@Override
	protected void onPreExecute() {
		// Contexto, título, mensagem, tempo indeterminado e pode ser cancelado.
		progress = ProgressDialog.show(contexto, "Aguarde...", "Enviando dados para web...", true, true);
	}

	// Executar tarefas na thread.
	// Executa a tarefa pesada em background.
	@Override
	protected String doInBackground(Integer... params) {
		String urlServer = "http://servidordeexemplo.com.br";
		AlunoDAO dao = new AlunoDAO(contexto);
		List<Aluno> alunos = dao.getLista();
		dao.close();

		String dadosJson = AlunoConverter.toJSON(alunos);

		ClienteWeb client = new ClienteWeb(urlServer);
		String respostaJSON = client.postar(dadosJson);

		return respostaJSON;
	}

	// Executado pela thread da UI.
	// Executado depois do metodo doInBackground().
	// A String "resultado" equivale ao retorno do método doInBackground,
	// no caso, a respostaJSON.
	// Libera o progress que comecou a rodar no onPreExecute().
	@Override
	protected void onPostExecute(String resultado) {
		progress.dismiss();
		Toast.makeText(contexto, resultado, Toast.LENGTH_LONG).show();
	}
}
