package com.cl.dao;

import com.cl.pojo.Emp;

import java.util.List;

public interface EmpDao {
    int findEmpCount();

    Emp findEmpByNo(int empno);


    List<Emp> findEmpByDeptno(int deptno);
}
