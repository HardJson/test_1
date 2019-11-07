package com.alone.happy_Config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(prefix = "jdbc")
//自动生成get、set方法，pojo类的方法，编译时运行
@Data
public class JdbcPro {
    String url;
    String driverClassName;
    String uesrname;
    String password;
}
