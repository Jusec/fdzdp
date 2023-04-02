package com.jusec.shop;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ShopApplication
 * @description:
 * @Author: Mo
 * @Date: 2023/03/31 20:38
 * @Version 17.0.1
 **/
@MapperScan("com.jusec.shop.mapper")
@SpringBootApplication
public class ShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }
}
