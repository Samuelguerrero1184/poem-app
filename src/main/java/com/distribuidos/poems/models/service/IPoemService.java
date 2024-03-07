package com.distribuidos.poems.models.service;

import java.util.List;

import com.distribuidos.poems.models.entity.Poem;

public interface IPoemService {

	public List<Poem> findAll();
	public Poem findById(Long id);
	
}
