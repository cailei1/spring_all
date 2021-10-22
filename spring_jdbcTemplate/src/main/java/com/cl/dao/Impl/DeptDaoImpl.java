package com.cl.dao.Impl;

import com.cl.dao.DeptDao;
import com.cl.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




@Repository
public class DeptDaoImpl implements DeptDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    public int addDept(Dept dept) {

        String sql = "insert into dept value(DEFAULT,?,?)";

        Object[] params = new Object[]{
                dept.getDname(),dept.getLoc()
        };

        int update = jdbcTemplate.update(sql, params);


        return update;
    }

    public int updateDept(Dept dept) {
        String sql = "update dept set dname = ?,loc = ? where deptno = ?";
        Object[] args = new Object[]{
                dept.getDname(),dept.getLoc(),dept.getDeptno()
        };
        return jdbcTemplate.update(sql,args);
    }
}
