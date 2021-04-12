package com.fc.dao;

import java.math.BigDecimal;

// dao层接口
public interface AccountDao {
    // 加钱方法
    void increaseMoney(Integer id, BigDecimal money);

    // 减少方法
    void decreaseMoney(Integer id, BigDecimal money);
}
