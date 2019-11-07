package com.alone.happy_Config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @apiNote 配置类
 * 替代spring中的xml文件
 */
//@Configuration
////@PropertySource("classpath:application.properties")
//@EnableConfigurationProperties(JdbcPro.class)
//public class JdbcConfig {
//
//   /* @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//    @Value("${jdbc.uesrname}")
//    String uesrname;
//    @Value("${jdbc.password}")
//    String password;*/
//   //方法1 引入JdbcPro
//    /*@Autowired
//    JdbcPro pro;*/
//
//    /*public JdbcConfig (JdbcPro pro){
//        this.pro = pro;
//    }*/
//
//    //数据库信息
//    //spring容器进行调用此方法
//    /*@Bean
//    public DataSource getDataSource(JdbcPro pro){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(pro.driverClassName);
//        dataSource.setUrl(pro.url);
//        dataSource.setUsername(pro.uesrname);
//        dataSource.setPassword(pro.password);
//        return dataSource;
//    }*/
//}
