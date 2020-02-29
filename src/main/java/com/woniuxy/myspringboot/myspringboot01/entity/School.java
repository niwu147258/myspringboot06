package com.woniuxy.myspringboot.myspringboot01.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;


@Data
public class School {
	
	private Integer schid;
	private String schname;
}
