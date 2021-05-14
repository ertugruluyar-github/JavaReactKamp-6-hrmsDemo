package com.kodlamaio.hrmsDemo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="phone_numbers")
public class PhoneNumber {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="country_code")
	private String countryCode;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public PhoneNumber() {}
	
	public PhoneNumber(int id, int userId, String countryCode, String phoneNumber) {
		super();
		this.id = id;
		this.userId = userId;
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber(int userId, String countryCode, String phoneNumber) {
		super();
		this.userId = userId;
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
	}
	
}
