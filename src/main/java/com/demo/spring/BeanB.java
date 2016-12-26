package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanB {
	private BeanC beanC;

	public BeanC getBeanC() {
		return beanC;
	}

	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
	
}
