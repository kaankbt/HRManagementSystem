package com.kaankubat.HRManagementSystem.business.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelService {
    List<SystemPersonnel> getAll();
}
