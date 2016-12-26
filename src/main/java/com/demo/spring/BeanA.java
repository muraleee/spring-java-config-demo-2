package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanA {

	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	@Autowired
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanA(BeanB beanB) {
		super();
		this.beanB = beanB;
	}

}
