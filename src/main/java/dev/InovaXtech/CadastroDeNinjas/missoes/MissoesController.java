package dev.InovaXtech.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("missoes")
public class MissoesController {
	
	//get - criar uma missao para listar os metodos
	@GetMapping("/listar")
	public String Listar() {
		
		return "missoes listadas com sucesso";
	}
	//get - criar uma requisição para criar missoes
		@PostMapping("/criar")
		public String criarmission() {
			
			return "missao criada com sucesso";
		}
	//put -- mandar uma requisição para alterar as missoes	
		
		@PutMapping("/alterar")
		public String Alterar() {
			
			return "missao alterada com sucesso";
		}
		// delete -- criar uma requisição para deletar as missoes 
		@DeleteMapping("/deletar")
		public String Delete() {
			
			return "missao deletada com sucesso";
		}
		
}
