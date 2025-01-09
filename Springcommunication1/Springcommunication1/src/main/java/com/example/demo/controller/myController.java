package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model2;
import com.example.demo.service.services;

@RestController
public class myController {
	@Autowired
	private services serv;
	@GetMapping("/getProduct")
	public List<model2> FindAllModel() {
		List<model2> model = new ArrayList<model2>();
		model = serv.findAllMyModel();
		return model;
	}
	
	@GetMapping("/getProduct/{id}")
	public model2 findById(@PathVariable int id)
	{
		return serv.findById(id);
		
	}
	@PostMapping("/setProd")
	public  void setProd(@RequestBody model2 m) 
	{
		serv.save(m);
	}
	@DeleteMapping("/deleteProd")
	public void deleteProd(@PathVariable int id)
	{
		serv.delete(id);
	}
	@PutMapping("/updateProd/{id}")
	public void updateProd(@PathVariable int id, @RequestBody model2 model2)
	{
		serv.update(id, model2);
	}
}
