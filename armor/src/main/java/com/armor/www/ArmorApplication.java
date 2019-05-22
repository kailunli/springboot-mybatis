package com.armor.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages = "com.armor.www")
@MapperScan( basePackages = "com.armor.www")
public class ArmorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArmorApplication.class, args);
    }

}
