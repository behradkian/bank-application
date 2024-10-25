package com.industry.bank.service;

import com.industry.bank.service.api.UserService;
import com.industry.bank.service.repository.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserStorage userStorage;
    @Autowired
    public void setUserRepository(UserStorage userStorage){
        this.userStorage = userStorage;
    }
}