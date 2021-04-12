package com.fc.dao.impl;

import com.fc.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.math.BigDecimal;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void increaseMoney(Integer id, BigDecimal money) {
        //获取JdbcTemplate
        JdbcTemplate jdbcTemplate = getJdbcTemplate();

        //受影响的行数
        int affectedRows = jdbcTemplate.update("update account set money=money+? where id=?", money, id);

        System.out.println("加钱"+affectedRows);
    }

    @Override
    public void decreaseMoney(Integer id, BigDecimal money) {
        //获取JdbcTemplate
        JdbcTemplate jdbcTemplate = getJdbcTemplate();

        //受影响的行数
        int affectedRows = jdbcTemplate.update("update account set money=money-? where id=?", money, id);

        System.out.println("减钱"+affectedRows);
    }
}
