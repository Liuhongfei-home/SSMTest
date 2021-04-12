package com.fc.bean;

import javafx.scene.text.Text;
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
        private int age;
        private String gender;
        private Date birthday;
        private String info;
}
