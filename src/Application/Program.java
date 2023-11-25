package Application;

import Entities.CPF;
import Entities.Pessoa;
import Entities.PessoaFisica;


public class Program {
	public static void main (String[] args) {
		
		Pessoa pessoa = new Pessoa("Bruno", "av. 1", "3112345678", "Contagem");
		PessoaFisica pessoa3 = new PessoaFisica("Bruno", "av. 1", "3112345678", "Contagem", "12345678911");
		
		System.out.println(pessoa3.toString());
		
	
	}

}
