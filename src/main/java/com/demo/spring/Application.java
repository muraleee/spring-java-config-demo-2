package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BeanA beanA = ctx.getBean("beanA", BeanA.class);
		BeanA beanA2 = ctx.getBean("beanA", BeanA.class);
		System.out.println(beanA == beanA2 ? "Identical" : "Different");
		
		System.out.println(beanA.getBeanB() == beanA2.getBeanB() ? "Identical " : "Different");
		System.out.println(beanA.getBeanB().getBeanC().getMyProperty());
		
		

	}

}
