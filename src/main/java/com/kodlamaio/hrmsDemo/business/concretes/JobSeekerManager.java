package com.kodlamaio.hrmsDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo.business.abstracts.JobSeekerService;
import com.kodlamaio.hrmsDemo.dataAccess.abstracts.JobSeekerDao;
import com.kodlamaio.hrmsDemo.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public List<JobSeeker> getAll() {
		return this.jobSeekerDao.findAll();
	}

	@Override
	public JobSeeker get(int id) {
		return this.jobSeekerDao.findById(id).orElse(null);
	}

	@Override
	public void add(JobSeeker jobSeeker) {
		this.jobSeekerDao.saveAndFlush(jobSeeker);
	}

	@Override
	public void delete(JobSeeker jobSeeker) {
		this.jobSeekerDao.delete(jobSeeker);
	}

	@Override
	public void update(JobSeeker jobSeeker) {
		this.jobSeekerDao.saveAndFlush(jobSeeker);
	}

	@Override
	public boolean existsJobSeekerByNationalityId(String nationalityId) {
		return this.jobSeekerDao.existsJobSeekerByNationalityId(nationalityId);
	}

	@Override
	public boolean existsJobSeekerByEmail(String email) {
		return this.jobSeekerDao.existsJobSeekerByEmail(email);
	}

}
