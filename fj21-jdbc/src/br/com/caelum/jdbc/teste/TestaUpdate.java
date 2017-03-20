package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaUpdate {

	public static void main(String[] args) {
		
		//seta id
		Contato contato = new Contato();
		contato.setId((long) 1);
		
		// remova nessa conexao
		ContatoDao dao = new ContatoDao();
		
		//metodo elegante
		dao.remove(contato);
		
		System.out.println("Removido!!");
	}
}
