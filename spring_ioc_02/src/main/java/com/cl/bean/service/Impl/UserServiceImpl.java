package com.cl.bean.service.Impl;

import com.cl.bean.dao.UserDao;
import com.cl.bean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDaoImpl")
    public UserDao userDao;

    public void addUser() {
        userDao.addUser();
    }
}
