package com.distribuidos.poems.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.distribuidos.poems.models.entity.Poem;

public interface PoemDao extends CrudRepository<Poem, Long>{
 
}
