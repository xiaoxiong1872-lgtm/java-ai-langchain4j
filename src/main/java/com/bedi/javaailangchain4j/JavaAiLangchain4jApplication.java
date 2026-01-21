package com.bedi.javaailangchain4j;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bedi")
@MapperScan("com.bedi.mapper")
public class JavaAiLangchain4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAiLangchain4jApplication.class, args);
    }

}
