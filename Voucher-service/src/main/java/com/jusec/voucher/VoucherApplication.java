package com.jusec.voucher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName VoucherApplication
 * @description:
 * @Author: Mo
 * @Date: 2023/03/31 17:15
 * @Version 17.0.1
 **/

@MapperScan("com.jusec.voucher.mapper")
@SpringBootApplication
public class VoucherApplication {
    public static void main(String[] args) {
        SpringApplication.run(VoucherApplication.class, args);
    }
}
