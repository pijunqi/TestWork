package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program:
 * @description: 项目启动类
 * @author: pijunqi
 * @create: 2019-12-05 14:35
 **/

@SpringBootApplication
//@EnableTransactionManagement
//@MapperScan(basePackages = "com")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
