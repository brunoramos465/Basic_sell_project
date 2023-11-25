package Entities;

public class PessoaFisica extends Pessoa{
	
	private String numeroCPF;

	public PessoaFisica(String nome, String endereco, String telefone, String cidade, String numeroCPF) {
		super(nome, endereco, telefone, cidade);
		this.numeroCPF = numeroCPF;
		
	}
	
	public String getNumeroCPF() {
		return numeroCPF;
	}

	public Long parseCPF() {
		return Long.parseLong(getNumeroCPF());
	}
	
	
	
	public boolean isValidoCPF() {
		Long cpf = parseCPF();
		return cpf != null && cpf.toString().length() == 11;	
	}
	
	@Override
	public String toString() {
		if(isValidoCPF() == true) {
				return "" + parseCPF();
		} else {
				return PessoaException();
		} 
		//fazer um Try em program
	}
	


}
