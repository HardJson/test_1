package com.alone.happy_web;

import com.alone.pojo.Role;
import com.alone.servive.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("test")
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);


    @Autowired
    private RoleService roleService;
    //@Autowired
    //private DataSource dataSource;

    /**
     * 测试类，验证项目是否启动
     * @return
     */
    @RequestMapping("hello")
    @ResponseBody
    public String getSpringId(){
        logger.info("123");
        return "123";
    }

    @GetMapping("{id}")
    public Role getRoleById(@PathVariable("id") Integer id){
        Role role = roleService.getRole(id);
        return role;
    }

    /**
     * 测试连接数据库
     */
}
