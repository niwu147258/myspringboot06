package com.woniuxy.myspringboot.myspringboot01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniuxy.myspringboot.myspringboot01.entity.Student;
import com.woniuxy.myspringboot.myspringboot01.service.SomeService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Myspringboot01ApplicationTests {
	
	@Autowired
	Student student;
	
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	SomeService someService;
	
	@Test
	public void contextLoads06() {
		
		log.trace("mytrace");
		log.debug("mytrace");
		log.info("myinfo");
		log.warn("mywarn");
	}
	
	@Test
	public void contextLoads05() {
		
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.trace("mytrace");
		logger.debug("mytrace");
		logger.info("myinfo");
		logger.warn("mywarn");
	}
	
	@Test
	public void contextLoads04() {
		System.out.println(someService);
		someService.doSome();
	}
	
	@Test
	public void contextLoads03() {
		
		someService.doSome();
	}
	
	@Test
	public void contextLoads02() {
		ApplicationContext myac=
				new ClassPathXmlApplicationContext("classpath:spring.xml");
		someService = 
				(SomeService) myac.getBean("someService");
		someService.doSome();
	}
	
	@Test
	public void contextLoads01() {
		someService.doSome();
	}
	
	@Test
	public void contextLoads() {
		System.out.println(ac);
		System.out.println(student);
	}

}
