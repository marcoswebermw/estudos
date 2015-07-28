package br.com.mw.androidexemploslayout;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import br.com.mw.androidexemploslayout.adapter.ListaAlunosAdapter;
import br.com.mw.androidexemploslayout.dao.AlunoDAO;
import br.com.mw.androidexemploslayout.modelo.Aluno;
import br.com.mw.androidexemploslayout.task.EnviarAlunosTask;

public class ListaAlunosActivity extends Activity {

	private ListView lista;
	private Aluno alunoSelecionado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_lista_alunos);

		lista = (ListView) findViewById(R.id.lista);
		registerForContextMenu(lista);
		criarListenersDaLista();
	}

	private void criarListenersDaLista() {
		// Um toque no item.
		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adaptador, View view,
					int posicao, long id) {
				Aluno alunoClicado = (Aluno) adaptador
						.getItemAtPosition(posicao);
				Intent irParaFormulario = new Intent(ListaAlunosActivity.this,
						FormularioActivity.class);
				// Tem que serializar a classe aluno para poder passar o objeto
				// para outra activity. Pois cada aplicação android roda em
				// maquina virtual diferente e por isso o objeto precisa
				// ser gravado para poder ser lido em outra vm.
				irParaFormulario.putExtra("alunoClicado", alunoClicado);
				startActivity(irParaFormulario);
			}

		});

		// Um toque longo no item.
		lista.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> adaptador, View view,
					int posicao, long id) {
				// O adaptador é o responsável pela comunicação com a ListView.
				// No caso abaixo ele devolve o objeto clicado na lista.
				alunoSelecionado = (Aluno) adaptador.getItemAtPosition(posicao);
				// return true; // Não permite a execução do menu de contexto.
				return false; // Permite a execução do menu de contexto.
			}
		});

	}

	// Vai executar quando a tela for atualizada.
	@Override
	protected void onResume() {
		super.onResume();
		carregarLista();
	}

	private void carregarLista() {
		// Classe responsável pelo acesso ao banco de dados.
		// Obtem a lista de alunos do banco e o fecha em seguida.
		AlunoDAO dao = new AlunoDAO(this);
		List<Aluno> alunos = dao.getLista();
		dao.close();
		// Pega o valor referente a um layout predefinido pelo android.
		// int layoutPredefinido = android.R.layout.simple_list_item_1;
		// Classe Especialista em preencher a ListView com valores de um array.
		// O tipo de objeto a ser tratado por ele é o Aluno.
		// E também é informado a lista que será exibida na ListView.
		// ArrayAdapter<Aluno> adapter = new ArrayAdapter<Aluno>(this,
		// layoutPredefinido, alunos);

		// int layout = R.layout.linha_listagem;
		ListaAlunosAdapter adapter = new ListaAlunosAdapter(alunos, this);

		lista.setAdapter(adapter);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		MenuItem ligar = menu.add("Ligar");
		ligar.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem arg0) {
				// Uma intent implicita que convida alguma activicty que
				// for capaz de executar uma discagem.
				// É necessária a permissão de CALL para funcionar.
				// Um dado é enviado para a intent de discagem contendo um
				// prefixo 'tel' avisando que se trata de um telefone.
				Intent irParaTelaDeDiscagem = new Intent(Intent.ACTION_CALL);
				Uri discarPara = Uri.parse("tel:"
						+ alunoSelecionado.getTelefone());
				irParaTelaDeDiscagem.setData(discarPara);
				startActivity(irParaTelaDeDiscagem);
				return false;
			}
		});
		menu.add("Enviar SMS");
		MenuItem site = menu.add("Navegar no site");
		site.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				// Uma intent implicita que convida alguma activicty que
				// for capaz de exibir algum conteúdo.
				// Um dado é enviado para a intent de exibição contendo um
				// prefixo 'http://' avisando que se trata de um site.
				Intent irParaSite = new Intent(Intent.ACTION_VIEW);
				String endereco_site = "google.com";
				Uri localSite = Uri.parse("http://" + endereco_site);
				irParaSite.setData(localSite);
				startActivity(irParaSite);
				return false;
			}
		});

		MenuItem deletar = menu.add("Deletar");
		deletar.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				AlunoDAO dao = new AlunoDAO(ListaAlunosActivity.this);
				dao.deletar(alunoSelecionado);
				dao.close();
				carregarLista();
				return false;
			}
		});

		menu.add("Ver no mapa");
		menu.add("Enviar e-mail");
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	// Método responsável pela criação dos menus de opção.
	// Executado de acordo com o ciclo de vida do android.
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Classe especialista em criar os menus.
		// Método inflate() indica o arquivo xml de menus
		// a ser usado.
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.menu_lista_alunos, menu);

		return super.onCreateOptionsMenu(menu);
	}

	// Método responsável por indicar o item de menu clicado.
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Pega o id do item selecionado.
		int itemId = item.getItemId();
		switch (itemId) {
		case R.id.novo:
			Intent intencaoFormulario = new Intent(this,
					FormularioActivity.class);
			startActivity(intencaoFormulario);
			break;
		case R.id.enviar_alunos:
			// Chamar uma classe que trabalha com threads.
			EnviarAlunosTask tarefa = new EnviarAlunosTask(this);
			tarefa.execute();
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
