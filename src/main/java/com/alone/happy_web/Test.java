package com.alone.happy_web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/test")
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);
    //@Autowired
    //private DataSource dataSource;

    /**
     * 测试类，验证项目是否启动
     * @return
     */
    @RequestMapping("hello.do")
    @ResponseBody
    public String getSpringId(){
        logger.info("123");
        return "123";
    }

    /**
     * 测试连接数据库
     */
}
