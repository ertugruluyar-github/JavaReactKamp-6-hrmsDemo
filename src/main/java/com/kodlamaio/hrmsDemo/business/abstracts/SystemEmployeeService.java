package com.kodlamaio.hrmsDemo.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo.entities.concretes.SystemEmployee;

public interface SystemEmployeeService {
	List<SystemEmployee> getAll();
	SystemEmployee get(int id);
	void add(SystemEmployee systemEmployee);
	void delete(SystemEmployee systemEmployee);
	void update(SystemEmployee systemEmployee);
	boolean existsSystemEmployeeByNationalityId(String nationalityId);
	boolean existsSystemEmployeeByEmail(String email);
}
