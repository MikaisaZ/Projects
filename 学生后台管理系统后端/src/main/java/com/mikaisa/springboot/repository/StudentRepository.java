package com.mikaisa.springboot.repository;

import com.mikaisa.springboot.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
}
