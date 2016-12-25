package com.demo.spring;

public class BeanC {

	private String myProperty;

	public String getMyProperty() {
		return myProperty;
	}

	public void setMyProperty(String myProperty) {
		System.out.println("BeanC::setMyProperty setting myProperty:"+myProperty);
		this.myProperty = myProperty;
	}
	
}
