package com.woniuxy.myspringboot.myspringboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource("classpath:spring.xml")
@SpringBootApplication
public class Myspringboot01Application {

	public static void main(String[] args) {
		System.out.println("aaa");
		SpringApplication.run(Myspringboot01Application.class, args);
	}

}
