package br.com.mw.androidexemploslayout.util;

import java.util.List;

import org.json.JSONException;
import org.json.JSONStringer;

import br.com.mw.androidexemploslayout.modelo.Aluno;

public class AlunoConverter {

	public static String toJSON(List<Aluno> alunos) {
		try {
			// {"list" : [{"aluno" : [{"nome" : "Mara", "nota": 9},
			// {"nome" : "Maria", "nota" : 10}]}]}

			// Ajuda a criar uma string JSON.
			JSONStringer js = new JSONStringer();

			js.object().key("list").array();
			js.object().key("aluno").array();

			for (Aluno aluno : alunos) {
				js.object();
				js.key("nome").value(aluno.getNome());
				js.key("nota").value(aluno.getNota());
				js.endObject();
			}

			js.endArray().endObject(); // Finaliza 'aluno'.
			js.endArray().endObject(); // Finaliza 'list'.
			return js.toString();
		} catch (JSONException e) {
			throw new RuntimeException(e);
		}
	}

}
