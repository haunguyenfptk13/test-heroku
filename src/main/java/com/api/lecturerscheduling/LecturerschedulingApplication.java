package com.api.lecturerscheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LecturerschedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LecturerschedulingApplication.class, args);
    }

}
