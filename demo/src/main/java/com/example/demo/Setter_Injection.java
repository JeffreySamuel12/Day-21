package com.example.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages = "com.example")
@SpringBootApplication
public class Setter_Injection {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Setter_Injection.class);
        Car2 car = context.getBean(Car2.class);
        car.drive();
    }
}
