package dev.InovaXtech.CadastroDeNinjas;

public class NinjaModel {
	
	long id;
	String Nome;
	String email;
	int idade;
	
	public NinjaModel() {
		
	}

	public NinjaModel(String nome, String email, int idade) {
		
		this.Nome = nome;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return Nome;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
