package com.kaankubat.HRManagementSystem.business.abstracts;

import com.kaankubat.HRManagementSystem.entitiy.abstracts.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
