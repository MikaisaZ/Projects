package com.mikaisa.springboot.controller;

import com.mikaisa.springboot.entity.Student;
import com.mikaisa.springboot.repository.StudentRepository;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;

import static org.apache.ibatis.io.ResolverUtil.*;


//注意启动类的层级一定要大于等于业务层的类，否则会出错
@RestController
@RequestMapping("/hello")
public class HelloHandler {

    @GetMapping(value = "/index")
    public String sayHello(){
        Student student = new Student();
        student.setCid(2);
        student.setName("刘康");
        student.setId(1);
        String s = "姓名："+student.getName()+"班级"+student.getCid();
        return s;
    }
}
