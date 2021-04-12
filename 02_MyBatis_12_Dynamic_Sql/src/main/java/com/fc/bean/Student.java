package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//必须符合javabean规范
//Alt+insert 添加get 、set、toString方法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
        private Integer id;
private String name;
private Integer age;
private String gender;
private Date birthday;
private String info;

public Integer getId() {
        return id;
}

public void setId(Integer id) {
        this.id = id;
}

public String getName() {
        return name;
}

public void setName(String name) {
        this.name = name;
}

public Integer getAge() {
        return age;
}

public void setAge(Integer age) {
        this.age = age;
}

public String getGender() {
        return gender;
}

public void setGender(String gender) {
        this.gender = gender;
}

public Date getBirthday() {
        return birthday;
}

public void setBirthday(Date birthday) {
        this.birthday = birthday;
}

public String getInfo() {
        return info;
}

public void setInfo(String info) {
        this.info = info;
}

@Override
public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", info='" + info + '\'' +
                '}';
}
}
