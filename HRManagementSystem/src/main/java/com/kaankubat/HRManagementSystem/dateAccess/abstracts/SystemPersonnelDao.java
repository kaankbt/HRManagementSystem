package com.kaankubat.HRManagementSystem.dateAccess.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.concretes.SystemPersonnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel, Integer> {
}
