package com.kaankubat.HRManagementSystem.business.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.concretes.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
}
