package dev.InovaXtech.CadastroDeNinjas.Ninja;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController{
	
	@GetMapping("/boasvindas")
	
	public String boasVindas() { 
		
		return "Essa e a minha primeira mensagem";
	}
	
	// Adicionar Ninja(create)
	@PostMapping("/criar")
	public String addNinja() {
		
		return "Ninja criado";
		}
	//procurar ninja por id(create)
	@GetMapping("/todosid")
	public String MostrarTodososNinjasporid() {
		return "Mostrar ninja por id";
	}
 
	//mostrar todos os ninjas (read)
	@GetMapping("/todos")
	public String MostrarTodososNinjas() {
		return "Mostrar Ninja";
	}
	
	
	//Alterar dados dos ninjas (updates)
	
	@PutMapping("/alterarID")
	public String AlterarNinjaporid() {
		return "AlterarNinjaporid";
	}
	
	//deletar ninja (delete
	@DeleteMapping("/deletarID")
	public String deletePorId() {
		return "Ninja deletado por id";
		
	}
	
}
