package com.jusec.feign.config;



import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.FULL;
    }

//    @Bean
//    public UserClientFallbackFactory userClientFallbackFactory(){
//        return new UserClientFallbackFactory();
//    }
}
