package com.kaankubat.HRManagementSystem.business.concretes;

import com.kaankubat.HRManagementSystem.business.abstracts.SystemPersonnelService;
import com.kaankubat.HRManagementSystem.dateAccess.abstracts.SystemPersonnelDao;
import com.kaankubat.HRManagementSystem.entitiy.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemPersonnelManager implements SystemPersonnelService {

    private SystemPersonnelDao systemPersonnelDao;

    @Autowired
    public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
        super();
        this.systemPersonnelDao = systemPersonnelDao;
    }

    @Override
    public List<SystemPersonnel> getAll() {
        return null;
    }
}
