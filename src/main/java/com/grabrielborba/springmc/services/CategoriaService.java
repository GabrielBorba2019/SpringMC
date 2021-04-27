package com.grabrielborba.springmc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grabrielborba.springmc.domain.Categoria;
import com.grabrielborba.springmc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//Dependencia
	@Autowired //Automaticamente instanciada pelo Spring
	private CategoriaRepository repo;
	
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
}
