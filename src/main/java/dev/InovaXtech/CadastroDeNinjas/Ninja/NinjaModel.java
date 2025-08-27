package dev.InovaXtech.CadastroDeNinjas.Ninja;

import java.util.List;
import dev.InovaXtech.CadastroDeNinjas.missoes.missoes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_cadastro")

public class NinjaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name ="id")
	private long id;
	
	@Column(name = "Nome")
	private String Nome;
	
	@Column(unique = true)
	private String email;
	
	@Column(name = "id")
	private int idade;
	
	//manytoone um ninja tem uma unica missao
	@ManyToOne
	@JoinColumn(name = "missoes_id")
	
	private missoes Missoes;
	
	
	
	
}
