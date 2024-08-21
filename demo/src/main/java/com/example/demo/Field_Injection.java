package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class Field_Injection {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Field_Injection.class);
        Car3 car = context.getBean(Car3.class);
        car.drive();
    }
}
