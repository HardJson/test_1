package com.alone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DbStart {
    public static void main(String[] args) {
        //将类名与main函数的args传入（args在，命令行时，会使用到）
        SpringApplication.run(DbStart.class,args);
    }
}
