package com.fc.dao;

import com.fc.bean.Department;
import com.fc.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentDao {
    List<Department> findById(@Param("id") int id);
}
