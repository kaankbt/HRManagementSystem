package com.kaankubat.HRManagementSystem.business.concretes;

import com.kaankubat.HRManagementSystem.business.abstracts.UserService;
import com.kaankubat.HRManagementSystem.dateAccess.abstracts.UserDao;
import com.kaankubat.HRManagementSystem.entitiy.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
