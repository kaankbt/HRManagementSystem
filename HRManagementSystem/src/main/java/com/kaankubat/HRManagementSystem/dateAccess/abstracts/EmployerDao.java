package com.kaankubat.HRManagementSystem.dateAccess.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
