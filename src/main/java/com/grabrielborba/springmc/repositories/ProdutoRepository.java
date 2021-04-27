package com.grabrielborba.springmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grabrielborba.springmc.domain.Produto;

@Repository //Realia operação de acesso a dados devido a Interface do JPA
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
