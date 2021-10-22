package com.cl.service.Impl;


import com.cl.dao.EmpDao;
import com.cl.pojo.Emp;
import com.cl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    public int findEmpCount() {
        return empDao.findEmpCount();
    }

    public Emp findEmpByNo(int empno) {
        return empDao.findEmpByNo(empno);
    }

    public List<Emp> findEmpBydeptno(int deptno) {
        return empDao.findEmpByDeptno(deptno);
    }
}
