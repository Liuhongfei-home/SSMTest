package com.fc.dao;

import com.fc.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    Employee  findById(@Param("id") int id);
}
