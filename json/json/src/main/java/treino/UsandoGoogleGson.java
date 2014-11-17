package treino;

import java.util.ArrayList;
import java.util.List;

public class UsandoGoogleGson {

	public static void main(String args[]) {
		jsonParaObjPessoa();
		objPessoaParaJson();
		jsonParaListaObjPessoas();
		String json = listaObjPessoasParaJson();
		System.out.println("\nLista de Pessoas em JSON: \n" + json);
	}

	private static String listaObjPessoasParaJson() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa("Tony Stark", 35, "Starks City",
				"iron@email.com");
		Pessoa p2 = new Pessoa("Bruce Banner", 42, "Planet Hulk",
				"hulk_smash@email.com");
		pessoas.add(p1);
		pessoas.add(p2);
		String json = new GoogleGson().listaPessoasParaJson(pessoas);
		return json;
	}

	private static void jsonParaListaObjPessoas() {
		GoogleGson googleGson = new GoogleGson();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		String json = listaObjPessoasParaJson();
		pessoas = googleGson.jsonParaListaPessoas(json);
		System.out.println("\nLista pessoas: ");
		for (Pessoa p : pessoas) {
			System.out.print("Nome: " + p.getNome());
			System.out.print(" - Idade: " + p.getIdade());
			System.out.print(" - Cidade de Nascimento: "
					+ p.getCidadeNascimento());
			System.out.print(" - Email: " + p.getEmail());
			System.out.print("\n");
		}
	}

	private static void jsonParaObjPessoa() {
		String p = gerarString();
		GoogleGson googleGson = new GoogleGson();
		Pessoa pessoa = googleGson.jsonParaPessoa(p);
		StringBuilder sb = new StringBuilder();
		sb.append("Pessoa: ");
		sb.append("Nome: " + pessoa.getNome());
		sb.append(", Idade: " + pessoa.getIdade());
		sb.append(", Cidade de Nascimento: " + pessoa.getCidadeNascimento());
		sb.append(", Email: " + pessoa.getEmail());

		System.out.println(sb.toString());
	}

	private static void objPessoaParaJson() {
		GoogleGson googleGson = new GoogleGson();
		Pessoa p2 = new Pessoa();
		p2.setNome("Feiticeira Escarlate");
		p2.setIdade(20);
		p2.setCidadeNascimento("Washington");
		p2.setEmail("wanda@email.com");
		String pessoa2 = googleGson.pessoaParaJson(p2);
		System.out.println("\nSegunda Pessoa: " + pessoa2);
	}

	private static String gerarString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\"nome\":\"Natasha Romanov\", ");
		sb.append("\"idade\":27, ");
		sb.append("\"cidadeNascimento\":\"New York\", ");
		sb.append("\"email\":\"natashar@email.com\"");
		sb.append("}");
		String json = sb.toString();
		return json;
	}

}
