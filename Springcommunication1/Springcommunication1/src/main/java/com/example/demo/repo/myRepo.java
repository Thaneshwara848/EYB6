package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.model2;
public interface myRepo extends JpaRepository<model2,Integer>{
	
}