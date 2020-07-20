package com.example.springbootdemo;

import com.example.consumingrest.ConsumingRestApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootDemoApplication.class, args);
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

}
