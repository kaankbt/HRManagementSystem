package com.kaankubat.HRManagementSystem.business.concretes;


import com.kaankubat.HRManagementSystem.business.abstracts.EmployerService;
import com.kaankubat.HRManagementSystem.dateAccess.abstracts.EmployerDao;
import com.kaankubat.HRManagementSystem.entitiy.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {

        return this.employerDao.findAll();
    }

}