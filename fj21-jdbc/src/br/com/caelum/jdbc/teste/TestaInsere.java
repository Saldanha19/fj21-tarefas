package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Icaro");
		contato.setEmail("icaro@icaro.com.br");
		contato.setEndereco("Rua nao sei, 320");
		contato.setDataNascimento(Calendar.getInstance());
		
		// grave nessa conexao
		ContatoDao dao = new ContatoDao();
		
		//metodo elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!!");
	}
}
