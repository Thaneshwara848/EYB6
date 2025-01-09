package com.example.demo.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.model;
@Service
public class service2 {
	
	@Autowired
	RestTemplate restTemplate;
	
	final String ROOT_URI = "EUREKACLIENTDEMO1/getProductS1";
	final String ROOT_URI2 = "http://localhost:9999/setProdS1";
	final String ROOT_URI3 = "http://localhost:9999/deleteProdS1";
	final String ROOT_URI4 = "http://localhost:9999/updateProdS1";
	public List<model> findAllMyModel() {
	
		ResponseEntity<model[]> response = restTemplate.getForEntity(ROOT_URI, model[].class);
		System.out.println(response);
		return Arrays.asList(response.getBody());
	}
	
public model FindModelbyId(int id) {
		
		ResponseEntity<model> response = restTemplate.getForEntity(ROOT_URI+"/"+id, model.class);
		
		return response.getBody();
	}
public URI setProd(model m)
{
	return restTemplate.postForLocation(ROOT_URI2,m);
	
}
public void deleteProd(int id)
{
	restTemplate.delete(ROOT_URI3+"/"+id);
}
public void update(int id, model m) {
	  restTemplate.put(ROOT_URI4+"/"+id,m);
	
}

}
