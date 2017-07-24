package br.com.mercadoria.sql;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

	private Connection con;
	private Statement smt;
	public ResultSet msql;
	static final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String databaseUrl = "jdbc:sqlserver://localhost:1433;databaseName=Mercadoria";
	static final String user = "sa";
	static final String password = "rafael@123";

	public Connection conecta() {
		try {
			Class.forName(jdbcDriver);
			System.out.println("Driver carregado");
			try {
				con = java.sql.DriverManager.getConnection(databaseUrl, user,
						password);
				System.out.println("Connectado!!!");

			} catch (SQLException ex) {
				Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE,
						null, ex);
				System.out.println("Problema com SQL!");
				ex.printStackTrace();
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,
					ex);
			ex.printStackTrace();
			System.out.println("Não carregou o Driver!");
		}
		return con;
	}

}
