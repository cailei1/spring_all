package com.cl.bean.service.Impl;

import com.cl.bean.dao.UserDao;
import com.cl.bean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDaoImpl")
    public UserDao userDao;

    @Value("${userName}")
    private String userName;

    @Value("${userAge}")
    private String userAge;

    public void addUser() {
        userDao.addUser();
    }


    @Override
    public String toString() {
        return userName + userAge;
    }
}
