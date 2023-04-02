package com.jusec.follow;

import com.jusec.feign.client.UserClient;
import com.jusec.feign.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName FollowApplication
 * @description:
 * @Author: Mo
 * @Date: 2023/04/01 17:09
 * @Version 17.0.1
 **/

@MapperScan("com.jusec.follow.mapper")
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class, clients = {UserClient.class})
public class FollowApplication {
    public static void main(String[] args) {
        SpringApplication.run(FollowApplication.class, args);
    }
}
