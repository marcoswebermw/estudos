package treino;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GoogleGson {

	public Pessoa jsonParaPessoa(String json) {
		Gson gson = new Gson();
		Pessoa pessoa = gson.fromJson(json, Pessoa.class);
		return pessoa;
	}

	public String pessoaParaJson(Pessoa p) {
		Gson gson = new Gson();
		return gson.toJson(p);
	}

	public List<Pessoa> jsonParaListaPessoas(String json) {
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<Pessoa>>(){}.getType();
		List<Pessoa> listaPessoas = gson.fromJson(json, collectionType);

		return listaPessoas;
	}

	public String listaPessoasParaJson(List<Pessoa> listaPessoas) {
		Gson gson = new Gson();
		String pessoas = gson.toJson(listaPessoas);
		return pessoas;
	}

}
