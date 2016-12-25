package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//<bean id="beanA" class="com.demo.spring.BeanA">
//<constructor-arg type="com.demo.spring.BeanB" ref="beanB"></constructor-arg>
//</bean>
//
//<bean id="beanB" class="com.demo.spring.BeanB">
//<property name="beanC" ref="beanC"></property>
//</bean>
//
//<bean id="beanC" class="com.demo.spring.BeanC">
//<property name="myProperty" value="XML Configuration"></property>
//</bean>

@Configuration
public class ApplicationConfig {

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
}
