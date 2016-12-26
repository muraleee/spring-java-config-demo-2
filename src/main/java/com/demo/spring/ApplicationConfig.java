package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.demo.spring")
public class ApplicationConfig {

	/*
	@Bean
	@Scope("prototype")
	public BeanA beanA()
	{
		BeanA beanA = new BeanA(beanB());
		return beanA;
	}
	
	@Bean
	@Scope("prototype")
	public BeanB beanB()
	{
		BeanB beanB = new BeanB();
		beanB.setBeanC(beanC());
		return beanB;
	}
	
	@Bean
	public BeanC beanC()
	{
		BeanC beanC = new BeanC();
		beanC.setMyProperty("Java Configuration");
		return beanC;
	}
	*/
}
