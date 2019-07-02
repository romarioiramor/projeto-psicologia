package br.com.vimedeiros.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private static final String USUARIO = "root";
	private static final String SENHA = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/vimedeiros";
	
	public static Connection conectar() throws SQLException{
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}

	public static void main(String[] args) {
		try {
		Connection conexao = ConexaoFactory.conectar();
		System.out.println("Conexão realizada com sucesso!!!");
		} catch (SQLException ex) {
			System.out.println("Não foi possivel realizar conexão!!!");
		}

	}

}
