package com.kodlamaio.hrmsDemo.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();
	JobSeeker get(int id);
	void add(JobSeeker jobSeeker);
	void delete(JobSeeker jobSeeker);
	void update(JobSeeker jobSeeker);
	boolean existsJobSeekerByNationalityId(String nationalityId);
	boolean existsJobSeekerByEmail(String email);
}
