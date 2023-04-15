package com.jusec.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName UserApplication
 * @description:
 * @Author: Mo
 * @Date: 2023/03/31 17:59
 * @Version 17.0.1
 **/
@MapperScan("com.jusec.user.mapper")
@SpringBootApplication
@EnableWebMvc
@EnableSwagger2
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
