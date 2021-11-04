package com.example.mymall.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.mymall.mbg.mapper")
public class MyBatisConfig {
}
