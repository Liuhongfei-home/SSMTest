package com.fc.dao;


import com.fc.bean.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    //主键回填
    int getKey(Student student);

}
