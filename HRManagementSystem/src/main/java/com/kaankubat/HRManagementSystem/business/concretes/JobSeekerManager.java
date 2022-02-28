package com.kaankubat.HRManagementSystem.business.concretes;

import com.kaankubat.HRManagementSystem.business.abstracts.JobSeekerService;
import com.kaankubat.HRManagementSystem.dateAccess.abstracts.JobSeekerDao;
import com.kaankubat.HRManagementSystem.entitiy.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        super();
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public List<JobSeeker> getAll() {

        return this.jobSeekerDao.findAll();
    }

}