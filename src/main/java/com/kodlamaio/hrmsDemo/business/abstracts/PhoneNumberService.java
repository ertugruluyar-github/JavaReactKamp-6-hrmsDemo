package com.kodlamaio.hrmsDemo.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo.entities.concretes.PhoneNumber;

public interface PhoneNumberService {
	List<PhoneNumber> getAll();
	PhoneNumber get(int id);
	void add(PhoneNumber phoneNumber);
	void delete(PhoneNumber phoneNumber);
	void update(PhoneNumber phoneNumber);
	boolean existsPhoneNumberByPhoneNumber(String phoneNumber);
}
