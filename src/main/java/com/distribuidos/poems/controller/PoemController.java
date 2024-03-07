package com.distribuidos.poems.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.distribuidos.poems.models.entity.Poem;
import com.distribuidos.poems.models.service.IPoemService;

@RestController
public class PoemController {
	
	private IPoemService poemService;
	
	@GetMapping("/listar")
	public List<Poem> listar(){
		return poemService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Poem detalle(@PathVariable Long id) {
		return poemService.findById(id);
	}

}
