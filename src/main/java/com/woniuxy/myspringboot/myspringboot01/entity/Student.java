package com.woniuxy.myspringboot.myspringboot01.entity;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

//这个注解告诉系统,创建Student对象时给属性赋值,到默认的配置文件中读取
@ConfigurationProperties(prefix="student")
@PropertySource("classpath:student.properties")
@Data
@Component
public class Student {
	
	//@Value("wwww")
	private String sname;
	//@Value("1111")
	private Integer age;
	private List<String> list;
	private Map<String,String> map;
	private School school;
}
