package com.fc.dao;

import com.fc.bean.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentDao {
    //根据部门id获取部门的信息（包括员工）
    Department findByDepartmentId(@Param("id") int id) ;
}
