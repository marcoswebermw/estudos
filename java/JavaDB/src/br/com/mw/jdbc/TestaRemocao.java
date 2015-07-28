package br.com.mw.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = Database.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute("delete from Produto where id > 3");
		int count = stmt.getUpdateCount();
		System.out.println(count + " linhas atualizadas");
		conexao.close();
	}
}
