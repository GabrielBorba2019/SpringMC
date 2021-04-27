package com.grabrielborba.springmc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grabrielborba.springmc.domain.Categoria;
import com.grabrielborba.springmc.services.CategoriaService;

@RestController //REST Transferência Representacional de Estado
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired//Acessar o serviço
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id); //Acessar o repository
		return ResponseEntity.ok().body(obj);
	}

}
