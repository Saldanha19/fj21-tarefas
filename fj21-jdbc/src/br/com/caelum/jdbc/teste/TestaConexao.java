package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws Exception {

		Connection connection = new ConnectionFactory().getConnetion();
		System.out.println("Conexao aberta!");
		connection.close();
	}

}
