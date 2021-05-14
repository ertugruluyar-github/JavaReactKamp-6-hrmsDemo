package com.kodlamaio.hrmsDemo.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo.entities.concretes.EmployeePosition;

public interface EmployeePositionService {
	List<EmployeePosition> getAll();
	EmployeePosition get(int id);
	void add(EmployeePosition employeePosition);
	void delete(EmployeePosition employeePosition);
	void update(EmployeePosition employeePosition);
	boolean existsEmployeePositionByPositionName(String positionName);
}
