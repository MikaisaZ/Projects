package com.mikaisa.springboot.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Class {
    @Value("1")
    private Integer id;
    @Value("hzj")
    private String name;
}
