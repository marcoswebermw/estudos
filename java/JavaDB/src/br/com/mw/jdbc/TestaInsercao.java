package br.com.mw.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = Database.getConexao();

		String sql = "insert into Produto (nome, descricao) values(?,?)";
		
		// Informa o sql e pede para retornar os ids inseridos automaticamente.
		PreparedStatement statement = conexao.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);
		statement.setString(1, "Notebook");
		statement.setString(2, "Notebook i5");
		boolean resultado = statement.execute(sql);
		
		// Imprimirá false, pois não retorna valores em inserção.
		System.out.println(resultado);
		// Ids retornados.
		ResultSet resultSet = statement.getGeneratedKeys();
		
		while (resultSet.next()) {
			String id = resultSet.getString("id");
			System.out.println(id + " gerado");
		}
		// Libera recursos.
		resultSet.close();
		statement.close();
		conexao.close();
	}

}
