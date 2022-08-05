package com.neimeng.zgl.boot02.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
/**
 * @author Liyufei
 * @version 1.0
 * @Date 2022/8/3 18:05
 */
@Configuration
@MapperScan(basePackages = {"com.neimeng.zgl.boot02.mapper"})
public class MybatisConfig {

}
