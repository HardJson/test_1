package com.alone.happy_web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
@RequestMapping("/test")
public class Test {

    @Autowired
    private DataSource dataSource;

    /**
     * 测试类，验证项目是否启动
     * @return
     */
    @RequestMapping("hello")
    @ResponseBody
    public String getSpringId(){
        return "123";
    }

    /**
     * 测试连接数据库
     */
}
