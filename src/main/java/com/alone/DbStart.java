package com.alone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 一个springboot项目的demo
 */

@SpringBootApplication
@MapperScan("com.alone.mapper")
public class DbStart {
    public static void main(String[] args) {
        //将类名与main函数的args传入（args在，命令行时，会使用到）
        SpringApplication.run(DbStart.class,args);
    }
}

/**
 * 一个springcloud项目原理的demo,用于监听上面的demo但是要是两个项目启动
 * RestTemplate 默认使用HttpUrlConnection
 */
/*public class DbStart {
    public static void main(String[] args) {
        SpringApplication.run(DbStart.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}*/
