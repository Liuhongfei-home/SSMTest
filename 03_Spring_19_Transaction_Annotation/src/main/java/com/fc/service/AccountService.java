package com.fc.service;

import java.math.BigDecimal;

// 业务层接口
public interface AccountService {
    /**
     * 转账方法
     *
     * @param form 从哪里转
     * @param to 转到哪里去
     * @param money 转多少钱
     */
    void transfer(Integer form, Integer to, BigDecimal money);
}
