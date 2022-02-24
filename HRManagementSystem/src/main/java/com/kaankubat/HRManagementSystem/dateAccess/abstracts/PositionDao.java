package com.kaankubat.HRManagementSystem.dateAccess.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.concretes.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDao extends JpaRepository<Position, Integer> {
}
