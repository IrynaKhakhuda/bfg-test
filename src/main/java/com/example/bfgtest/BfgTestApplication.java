package com.example.bfgtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BfgTestApplication {

    public static void main(String[] args) {


        System.out.printf("test");
        SpringApplication.run(BfgTestApplication.class, args);
    }

}
