package com.distribuidos.poems.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuidos.poems.models.dao.PoemDao;
import com.distribuidos.poems.models.entity.Poem;

@Service
public class PoemServiceImpl implements IPoemService{

	@Autowired
	private PoemDao poemDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Poem> findAll() {
		return (List<Poem>)poemDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Poem findById(Long id) {
	
		return poemDao.findById(id).orElse(null);
	}

}
