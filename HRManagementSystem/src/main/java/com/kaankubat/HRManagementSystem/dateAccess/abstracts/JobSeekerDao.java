package com.kaankubat.HRManagementSystem.dateAccess.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
}
