package com.cl.dao.impl;

import com.cl.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {


    // addUser 之前 之后做一些事情  怎么办
    public int addUser(int userId, String userName) {
        System.out.println("add data into database");
        return 1;
    }
}
