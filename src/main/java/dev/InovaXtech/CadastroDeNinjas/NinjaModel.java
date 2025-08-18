package dev.InovaXtech.CadastroDeNinjas;

public class NinjaModel {
	
	private long id;
	private String Nome;
	private String email;
	private int idade;
	
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
