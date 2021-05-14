package com.kodlamaio.hrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo.business.abstracts.SystemEmployeeService;
import com.kodlamaio.hrmsDemo.dataAccess.abstracts.SystemEmployeeDao;
import com.kodlamaio.hrmsDemo.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {
	
	private SystemEmployeeDao systemEmployeeDao;
	
	@Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		this.systemEmployeeDao = systemEmployeeDao;
	}

	@Override
	public List<SystemEmployee> getAll() {
		return this.systemEmployeeDao.findAll();
	}

	@Override
	public SystemEmployee get(int id) {
		return this.systemEmployeeDao.findById(id).orElse(null);
	}

	@Override
	public void add(SystemEmployee systemEmployee) {
		this.systemEmployeeDao.saveAndFlush(systemEmployee);
	}

	@Override
	public void delete(SystemEmployee systemEmployee) {
		this.systemEmployeeDao.delete(systemEmployee);
	}

	@Override
	public void update(SystemEmployee systemEmployee) {
		this.systemEmployeeDao.saveAndFlush(systemEmployee);
	}

	@Override
	public boolean existsSystemEmployeeByNationalityId(String nationalityId) {
		return this.systemEmployeeDao.existsSystemEmployeeByNationalityId(nationalityId);
	}

	@Override
	public boolean existsSystemEmployeeByEmail(String email) {
		return this.systemEmployeeDao.existsSystemEmployeeByEmail(email);
	}

}
