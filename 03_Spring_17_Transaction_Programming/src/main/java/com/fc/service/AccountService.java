package com.fc.service;


import java.math.BigDecimal;

//业务层接口
public interface AccountService {
    /**
     * 转账方法
     *
     * @param from 转出对象
     * @param to 转入对象
     * @param money 交易金额
     */
    void transfer(Integer from, Integer to, BigDecimal money);
}
