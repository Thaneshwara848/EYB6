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

import com.example.demo.model.model;
import com.example.demo.service.service2;


@RestController
public class controller2 {
	
	@Autowired
	private service2 serv;
	
	@GetMapping("/getProductS2")
	public List<model> FindAllModel() {
		
		List<model> model = new ArrayList<model>();
		model = serv.findAllMyModel();
		
		return model;
	}
	@GetMapping("/getProductS2/{id}")
	public model FindModelbyId(@PathVariable int id) {
		return serv.FindModelbyId(id);
	}
	@PostMapping("/setProdS2")
	public void setProd(@RequestBody model m)
	{
		serv.setProd(m);
	}
	@DeleteMapping("/deleteProdS2/{id}")
	public void deleteProd(@PathVariable int id)
	{
		serv.deleteProd(id);
	}
	@PutMapping("updateProdS2/{id}")
	public void updateProd(@PathVariable int id, @RequestBody model m)
	{
		serv.update(id,m);
	}
}
