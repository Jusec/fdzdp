package com.jusec.blog;

import com.jusec.feign.client.FollowClient;
import com.jusec.feign.client.UserClient;
import com.jusec.feign.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @ClassName BlogApplication
 * @description:
 * @Author: Mo
 * @Date: 2023/04/02 16:40
 * @Version 17.0.1
 **/

@MapperScan("com.jusec.blog.mapper")
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class, clients = {UserClient.class, FollowClient.class})
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
