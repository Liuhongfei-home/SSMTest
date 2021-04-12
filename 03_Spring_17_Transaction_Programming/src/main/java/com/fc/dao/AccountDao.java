package com.fc.dao;

import java.math.BigDecimal;

public interface AccountDao {
    //加钱方法
    void increaseMoney(Integer id, BigDecimal money);

    //减钱方法
    void decreaseMoney(Integer id,BigDecimal money);
}
