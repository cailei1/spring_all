package com.cl.service;

import com.cl.pojo.Emp;

import java.util.List;

public interface EmpService {

    // 查询员工个数的方法

    int findEmpCount();

    Emp findEmpByNo(int empno);

    List<Emp> findEmpBydeptno(int deptno);
}
