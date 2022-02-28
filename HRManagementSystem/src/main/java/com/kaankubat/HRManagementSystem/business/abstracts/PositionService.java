package com.kaankubat.HRManagementSystem.business.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.concretes.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAll();
}
