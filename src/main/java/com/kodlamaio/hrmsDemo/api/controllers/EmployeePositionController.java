package com.kodlamaio.hrmsDemo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrmsDemo.business.abstracts.EmployeePositionService;
import com.kodlamaio.hrmsDemo.entities.concretes.EmployeePosition;

@RestController
@RequestMapping("/api/employeepositions")
public class EmployeePositionController {
	
	private EmployeePositionService employeePositionService;
	
	@Autowired
	public EmployeePositionController(EmployeePositionService employeePositionService) {
		this.employeePositionService = employeePositionService;
	}
	
	@GetMapping("/getall")
	public List<EmployeePosition> getAll() {
		return this.employeePositionService.getAll();
	}
	
	@GetMapping("/{id}")
	public EmployeePosition get(@PathVariable int id) {
		return this.employeePositionService.get(id);
	}

	//POSTMAN GEREKLİ OLDUĞUNDAN BURAYI ATLIYORUM.
//	@PostMapping("/getall1")
//	public void add(EmployeePosition employeePosition) {
//		this.employeePositionService.add(employeePosition);
//	}
//
//	@GetMapping("/getall2")
//	public void delete(EmployeePosition employeePosition) {
//		this.employeePositionService.delete(employeePosition);
//	}
//
//	@GetMapping("/getall3")
//	public void update(EmployeePosition employeePosition) {
//		this.employeePositionService.update(employeePosition);
//	}
//
//	@GetMapping("/getall4")
//	public boolean existsEmployeePositionByPositionName(String positionName) {
//		return this.employeePositionService.existsEmployeePositionByPositionName(positionName);
//	}
	
}
