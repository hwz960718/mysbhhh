package com.hwz.mysbhhh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hwz.mysbhhh.mapper")
public class MysbhhhApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysbhhhApplication.class, args);
    }

}
