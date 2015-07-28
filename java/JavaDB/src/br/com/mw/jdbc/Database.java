package br.com.mw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	static Connection getConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/meubd", "SA", "");
	}
}
