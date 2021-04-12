package com.fc.service.impl;

import com.fc.dao.AccountDao;
import com.fc.service.AccountService;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public void transfer(Integer from, Integer to, BigDecimal money) {
        //减钱
        accountDao.decreaseMoney(from,money);

        //系统崩溃了
//        System.out.println("系统崩溃了");
//        int num=1 / 0;


        //加钱
        accountDao.increaseMoney(to,money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
