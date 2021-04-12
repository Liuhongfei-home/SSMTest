package com.fc.service.impl;

import com.fc.dao.AccountDao;
import com.fc.service.AccountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class AnnotationServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public void transfer(Integer form, Integer to, BigDecimal money) {

        //减钱
        accountDao.decreaseMoney(form,money);

        //加钱
        accountDao.increaseMoney(to,money);

    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
