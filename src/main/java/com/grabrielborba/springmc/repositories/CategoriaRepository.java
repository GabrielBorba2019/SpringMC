package com.grabrielborba.springmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grabrielborba.springmc.domain.Categoria;

@Repository //Realia operação de acesso a dados devido a Interface do JPA
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
}
