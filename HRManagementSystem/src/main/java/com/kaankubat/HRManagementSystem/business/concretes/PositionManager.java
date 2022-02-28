package com.kaankubat.HRManagementSystem.business.concretes;

import com.kaankubat.HRManagementSystem.business.abstracts.PositionService;
import com.kaankubat.HRManagementSystem.dateAccess.abstracts.PositionDao;
import com.kaankubat.HRManagementSystem.entitiy.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PositionManager implements PositionService {

    private PositionDao positionDao;

    @Autowired
    public PositionManager(PositionDao positionDao) {
        super();
        this.positionDao = positionDao;
    }

    @Override
    public List<Position> getAll() {
        return null;
    }
}
