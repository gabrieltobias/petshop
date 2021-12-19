package com.gabriel.petshop.service;

import org.springframework.stereotype.Service;
import com.gabriel.petshop.domain.Categoria;
import com.gabriel.petshop.repository.CategoriaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
