package com.kodlamaio.hrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo.business.abstracts.PhoneNumberService;
import com.kodlamaio.hrmsDemo.dataAccess.abstracts.PhoneNumberDao;
import com.kodlamaio.hrmsDemo.entities.concretes.PhoneNumber;

@Service
public class PhoneNumberManager implements PhoneNumberService {
	
	private PhoneNumberDao phoneNumberDao;
	
	@Autowired
	public PhoneNumberManager(PhoneNumberDao phoneNumberDao) {
		this.phoneNumberDao = phoneNumberDao;
	}

	@Override
	public List<PhoneNumber> getAll() {
		return this.phoneNumberDao.findAll();
	}

	@Override
	public PhoneNumber get(int id) {
		return this.phoneNumberDao.findById(id).orElse(null);
	}

	@Override
	public void add(PhoneNumber phoneNumber) {
		this.phoneNumberDao.saveAndFlush(phoneNumber);
	}

	@Override
	public void delete(PhoneNumber phoneNumber) {
		this.phoneNumberDao.delete(phoneNumber);
	}

	@Override
	public void update(PhoneNumber phoneNumber) {
		this.phoneNumberDao.saveAndFlush(phoneNumber);
	}

	@Override
	public boolean existsPhoneNumberByPhoneNumber(String phoneNumber) {
		return this.phoneNumberDao.existsPhoneNumberByPhoneNumber(phoneNumber);
	}

}
