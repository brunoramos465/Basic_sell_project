package Entities;

public class CPF extends Pessoa{
	private String numCPF;

	public CPF(String nome, String endereco, String telefone, String cidade, String numCPF) {
		super(nome, endereco, telefone, cidade);
		this.numCPF = numCPF;
	}

	public String getNumCPF() {
		return numCPF;
	}


}
