package com.blogs;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude={DruidDataSourceAutoConfigure.class})
@MapperScan("com.blogs.dao")
@EnableFeignClients
public class MyBlogsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBlogsServiceApplication.class, args);
    }

}
