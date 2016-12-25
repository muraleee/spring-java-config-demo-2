package com.demo.spring;

public class BeanA {

	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanA(BeanB beanB) {
		super();
		this.beanB = beanB;
	}

}
