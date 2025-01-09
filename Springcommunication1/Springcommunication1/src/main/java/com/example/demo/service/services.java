package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.model2;
import com.example.demo.repo.myRepo;

@Service
public class services {
	@Autowired
	private myRepo repo;
	public List<model2> findAllMyModel(){
		return repo.findAll();
	}
	public model2 findById(int id)
	{
		return repo.findById(id).get();
	}
	public void save(model2 m)
	{
		repo.save(m);
	}
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	public void update(int id, model2 m)
	{
		model2 model2 = repo.getById(id);
		model2.setPname(m.getPname());
		repo.save(model2);
	}

}

