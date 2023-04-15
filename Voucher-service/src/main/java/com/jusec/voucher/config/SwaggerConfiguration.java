package com.jusec.voucher.config;





import io.swagger.annotations.ApiOperation;

import springfox.documentation.service.Contact;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfiguration
 * @description:
 * @Author: Mo
 * @Date: 2023/04/13 22:14
 * @Version 17.0.1
 **/

@Configuration
//@EnableOpenApi
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket buildDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jusec.voucher.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInfo(){
        Contact contact = new Contact("Jusec", ""," ");
        return new ApiInfoBuilder()
                .title("Voucher")
                .description("")
                .contact(contact)
                .version("1.0.0")
                .build();
    }




}
