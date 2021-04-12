package com.fc.service.impl;

import com.fc.dao.AccountDao;
import com.fc.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

/**
 * 编程式事务
 */
public class ProgrammingServiceImpl implements AccountService {
    // dao层接口，用来连接数据库
    private AccountDao accountDao;
    // 声明一个事务模板对象
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(Integer form, Integer to, BigDecimal money) {
        // 执行事务模板对象的方法，需要传入一个匿名内部类对象，内容重写对应的方法
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                // 减钱
                accountDao.decreaseMoney(form, money);

//                System.out.println("系统又崩溃了，比如刚刚201又停电");
//                int num = 1 / 0;

                // 加钱
                accountDao.increaseMoney(to, money);
            }
        });
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
