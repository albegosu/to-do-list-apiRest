package com.example.first.api;

import org.aspectj.apache.bcel.classfile.ModuleMainClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class mainClass {
    public static void main(String[] args) {
        SpringApplication.run(ModuleMainClass.class, args);
    }
}
