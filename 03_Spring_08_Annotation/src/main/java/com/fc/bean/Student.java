package com.fc.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component//相当于通过<bean id='student' class='com.fc.bean.Student'/>
public class Student {

    @Value("天才在左疯子在右")
    private String name;
    @Value("202")
    private Integer age;

}
