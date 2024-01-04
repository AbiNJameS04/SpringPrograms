package com.ust.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Emp;
import com.ust.demo.repository.ERepository;


@RestController
@RequestMapping("emp")
public class EmpController{
	@Autowired
	private ERepository er;
	
	
	@GetMapping
	public List<Emp> retrieveAllEmployees()
	{
		return er.findAll();
	}
	
	
	
	
	
	@PostMapping
	public Emp addProduct(@RequestBody Emp p)
	{
		return er.save(p);
	}
	
	
	
	
	
}
