package com.woniuxy.myspringboot.myspringboot01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.woniuxy.myspringboot.myspringboot01.service.SomeService;

//配置类:当前类就是配置文件
@Configuration
public class MyConfig {
	
	//创建bean==<bean id="" class="" />
	@Bean
	public SomeService getSomeService() {
		return new SomeService();
	}
}
