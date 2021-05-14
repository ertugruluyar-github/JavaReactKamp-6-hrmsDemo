package com.kodlamaio.hrmsDemo.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
	Employer get(int id);
	void add(Employer employer);
	void delete(Employer employer);
	void update(Employer employer);
	boolean existsEmployerByEmail(String email);
}
