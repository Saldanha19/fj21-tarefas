package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {

	public static void main(String[] args) {
		
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Caelum5");
		contato.setEmail("contato5@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 1);
		
		// grave nessa conexao
		ContatoDao dao = new ContatoDao();
		
		//metodo elegante
		dao.altera(contato);
		
		System.out.println("alterado!!");
	}
}
