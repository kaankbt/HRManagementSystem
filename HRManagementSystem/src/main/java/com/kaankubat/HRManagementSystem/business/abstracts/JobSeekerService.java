package com.kaankubat.HRManagementSystem.business.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    List<JobSeeker> getAll();
}
