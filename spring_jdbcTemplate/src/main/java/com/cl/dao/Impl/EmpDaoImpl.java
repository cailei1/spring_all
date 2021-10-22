package com.cl.dao.Impl;

import com.cl.dao.EmpDao;
import com.cl.pojo.Emp;
import com.cl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int findEmpCount() {

        String sql = "select count(1) from emp";


        /**
         * sql
         * Integer 返回值类型
         */

        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);



        return count;
    }

    public Emp findEmpByNo(int empno) {

        String sql = "select * from emp where empno = ?";

        BeanPropertyRowMapper<Emp> beanPropertyRowMapper = new BeanPropertyRowMapper<Emp>(Emp.class);


        Emp emp = jdbcTemplate.queryForObject(sql, beanPropertyRowMapper, empno);
        return emp;
    }

    public List<Emp> findEmpByDeptno(int deptno) {
        String sql = "select * from emp where deptno = ?";

        BeanPropertyRowMapper<Emp> beanPropertyRowMapper = new BeanPropertyRowMapper<Emp>(Emp.class);

        List<Emp> query = jdbcTemplate.query(sql, beanPropertyRowMapper, deptno);


        return query;
    }
}
