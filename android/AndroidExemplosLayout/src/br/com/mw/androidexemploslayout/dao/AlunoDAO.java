package br.com.mw.androidexemploslayout.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.com.mw.androidexemploslayout.modelo.Aluno;

// A classe SQLiteOpenHelper simplifica o trabalho com o Sqlite.
public class AlunoDAO extends SQLiteOpenHelper {

	private static final String DATABASE = "bdAgendaAndroid";
	private static final int VERSION = 4; // Primeira vers�o do Banco de dados.

	// No construtor s�o definidos o contexto a ser trabalhado,
	// no caso a ListAlunosActivity, o nome do banco de dados,
	// e vers�o do banco a ser trabalhada.
	public AlunoDAO(Context context) {
		super(context, DATABASE, null, VERSION);
	}

	public void salva(Aluno alunoDoFormulario) {
		// As informa��es do aluno que est�o no formul�rio
		// s�o inseridas em um objeto ContentValues.
		ContentValues values = new ContentValues();
		values.put("nome", alunoDoFormulario.getNome());
		values.put("email", alunoDoFormulario.getEmail());
		values.put("nota", alunoDoFormulario.getNota());
		values.put("foto", alunoDoFormulario.getFoto());
		values.put("telefone", alunoDoFormulario.getTelefone());
		// Os valores s�o inseridos na tabela Alunos.
		getWritableDatabase().insert("Alunos", null, values);
	}

	// � indicado o banco de dados 'db' que representa o 'bdAgendaAndroid',
	// e em seguida � criada a tabela 'Alunos' no banco.
	@Override
	public void onCreate(SQLiteDatabase db) {
		String ddl = "CREATE TABLE Alunos (" + "id INTEGER PRIMARY KEY, "
				+ "nome TEXT UNIQUE NOT NULL, " + "email TEXT, "
				+ "telefone TEXT, " + "foto TEXT, nota REAL);";
		db.execSQL(ddl);
	}

	// M�todo usado para zerar o banco se necess�rio, bastando mudar o valor
	// de VERSION para um indice subsequente.
	// Observe que depois de limpo � chamado o m�todo onCreate(db) para
	// recriar a tabela Alunos.
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		String ddl = "DROP TABLE IF EXISTS Alunos";
		db.execSQL(ddl);
		this.onCreate(db);
	}

	// M�todo que retorna a lista de alunos cadastrados no banco.
	public List<Aluno> getLista() {

		// Colunas a serem retornadas pela consulta.
		String[] colunas = { "id", "nome", "email", "telefone", "foto", "nota" };

		// O cursor � o equivalente a um ResultSet.
		// Faz uma consulta na tabela Alunos indicando as colunas a serem
		// retornadas.
		Cursor cursor = getWritableDatabase().query("Alunos", colunas, null,
				null, null, null, null);

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		// Enquanto houver aluno preenche o array.
		while (cursor.moveToNext()) {
			Aluno aluno = new Aluno();
			aluno.setId(cursor.getLong(0));
			aluno.setNome(cursor.getString(1));
			aluno.setEmail(cursor.getString(2));
			aluno.setTelefone(cursor.getString(3));
			aluno.setFoto(cursor.getString(4));
			aluno.setNota(cursor.getDouble(5));

			alunos.add(aluno);
		}

		return alunos;
	}

	public void deletar(Aluno alunoSelecionado) {
		String[] whereArgs = { alunoSelecionado.getId().toString() };
		getWritableDatabase().delete("Alunos", "id=?", whereArgs);
	}

	public void altera(Aluno alunoDoFormulario) {
		// As informa��es do aluno que est�o no formul�rio
		// s�o inseridas em um objeto ContentValues.
		ContentValues values = new ContentValues();
		values.put("nome", alunoDoFormulario.getNome());
		values.put("email", alunoDoFormulario.getEmail());
		values.put("nota", alunoDoFormulario.getNota());
		values.put("foto", alunoDoFormulario.getFoto());
		values.put("telefone", alunoDoFormulario.getTelefone());
		// Os valores s�o alterados na tabela Alunos.
		String[] whereArgs = { alunoDoFormulario.getId().toString() };
		getWritableDatabase().update("Alunos", values, "id=?", whereArgs);
	}

	public boolean isAluno(String telefone) {
		String[] args = {telefone};
		Cursor cursor = getWritableDatabase().rawQuery("SELECT id FROM Alunos WHERE telefone = ?", args);
		boolean existeUmPrimeiro = cursor.moveToFirst();
		return existeUmPrimeiro;
	}
}
