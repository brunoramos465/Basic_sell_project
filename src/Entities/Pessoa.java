package Entities;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cidade;
	
	
	public Pessoa(String nome, String endereco, String telefone, String cidade) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\n" + 
				"Endereço: " + getEndereco() + "\n" + 
				"Telefone: " + getTelefone() + "\n" + 
				"Cidade: " + getCidade();
	}
	
	

}
