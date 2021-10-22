package com.cl.service.Impl;

import com.cl.dao.DeptDao;
import com.cl.pojo.Dept;
import com.cl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;


    public int addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public int updateDept(Dept dept) {
        return deptDao.updateDept(dept);
    }
}
