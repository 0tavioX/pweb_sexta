package br.unisul.web.sexta.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.unisul.web.sexta.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")

public class CategouriaResource {	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar(){
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(new Categoria(1, "Informática"));
		lista.add(new Categoria(2, "Camper"));
		
		return lista;
	}
}
