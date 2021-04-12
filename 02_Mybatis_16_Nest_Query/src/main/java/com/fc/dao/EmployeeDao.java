package com.fc.dao;

import com.fc.bean.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeDao {

    Employee findByid(@Param("id") int id);
}
