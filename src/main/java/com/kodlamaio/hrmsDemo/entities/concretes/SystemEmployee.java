package com.kodlamaio.hrmsDemo.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.kodlamaio.hrmsDemo.entities.abstracts.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name="system_employees")
public class SystemEmployee extends User {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="gender")
	private String gender;
	
	public SystemEmployee() {}

	public SystemEmployee(int id, String email, String password, String firstName, String lastName,
			String nationalityId, Date dateOfBirth, String gender) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public SystemEmployee(String email, String password, String firstName, String lastName, String nationalityId,
			Date dateOfBirth, String gender) {
		super(email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
	
}
