package br.com.mw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoJDBC {
	public static void main(String[] args) throws SQLException {
		// Pegando uma conexão com o DriverManager.
		// É necessário adicionar o hsqldb no classpath para o exemplo funcionar.
		Connection conexao = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/meubd", "SA", "");
		// Cria uma nova statement a partir da conexão criada.
		Statement statement = conexao.createStatement();
		// Executa uma statement sql que rertornará um resultado booleano
		// indicando se a operação foi realizada.
		boolean resultado = statement.execute("Select * from Clientes");
		// Os resultados da statement são armazenados dentro do objeto da classe
		// ResultSet.
		ResultSet resultSet = statement.getResultSet();
		// Verifica se tem novos resultados e os imprime.
		// o "resultSet" inicia sem apontar para nenhum valor, então é 
		// necessário iniciá-lo para pegar resultados através do método ".next()".
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			System.out.println(id);
			System.out.println(nome);
		}
		// Liberando recursos.
		resultSet.close();
		statement.close();
		conexao.close();
	}
}
