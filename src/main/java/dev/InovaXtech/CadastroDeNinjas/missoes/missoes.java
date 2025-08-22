package dev.InovaXtech.CadastroDeNinjas.missoes;

import java.util.List;

import dev.InovaXtech.CadastroDeNinjas.Ninja.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
@Table (name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data 
public class missoes {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long Id;
	private String missao; 
	private String Dificuldade;
	
	//uma missao pode ter varios ninjas
	@OneToMany(mappedBy = "missoes")
	private List<NinjaModel> Ninja;
	public missoes() {
		
	}


	public missoes(Long id, String missao, String dificuldade, List<NinjaModel> Ninja) {
		this.Id = id;
		this.missao = missao;
		this.Dificuldade = dificuldade;
		this.Ninja = Ninja;
	}


	public Long getId() {
		return Id;
	}


	public String getMissao() {
		return missao;
	}


	public String getDificuldade() {
		return Dificuldade;
	}

	

	public List<NinjaModel> getNinja() {
		return Ninja;
	}


	public void setNinja(List<NinjaModel> ninja) {
		Ninja = ninja;
	}


	public void setId(Long id) {
		Id = id;
	}


	public void setMissao(String missao) {
		this.missao = missao;
	}


	public void setDificuldade(String dificuldade) {
		Dificuldade = dificuldade;
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
