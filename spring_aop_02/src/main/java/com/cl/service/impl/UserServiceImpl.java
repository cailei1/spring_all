package com.cl.service.impl;

import com.cl.dao.UserDao;
import com.cl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserDao userDao;


    public int addUser(int userId, String userName) {

       int result = userDao.addUser(userId,userName);
        return result;
    }
}
