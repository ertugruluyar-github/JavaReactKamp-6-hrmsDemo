package com.kodlamaio.hrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo.business.abstracts.EmployerService;
import com.kodlamaio.hrmsDemo.dataAccess.abstracts.EmployerDao;
import com.kodlamaio.hrmsDemo.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

	@Override
	public Employer get(int id) {
		return this.employerDao.findById(id).orElse(null);
	}

	@Override
	public void add(Employer employer) {
		this.employerDao.saveAndFlush(employer);
	}

	@Override
	public void delete(Employer employer) {
		this.employerDao.delete(employer);
	}

	@Override
	public void update(Employer employer) {
		this.employerDao.saveAndFlush(employer);
	}

	@Override
	public boolean existsEmployerByEmail(String email) {
		return this.employerDao.existsEmployerByEmail(email);
	}

}
