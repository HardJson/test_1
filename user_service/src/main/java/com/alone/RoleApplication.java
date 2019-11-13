package com.alone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.alone.mapper")
public class RoleApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoleApplication.class,args);
    }
}
