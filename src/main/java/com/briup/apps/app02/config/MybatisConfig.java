package com.briup.apps.app02.config;


import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan("com.briup.apps.app02.dao")
public class MybatisConfig {

}
