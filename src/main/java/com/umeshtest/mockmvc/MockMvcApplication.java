package com.umeshtest.mockmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.umeshtest.mockmvc")
public class MockMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockMvcApplication.class, args);
    }

}
