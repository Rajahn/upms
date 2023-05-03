package com.hr.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : kaifa
 * create at:  2019-10-22  10:03
 * @description: mybatis配置类
 */
@Configuration
@MapperScan("com.hr.mapper")
public class MybatisConfig {
}
