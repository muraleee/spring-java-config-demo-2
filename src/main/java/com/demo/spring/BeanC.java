package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanC {

	private String myProperty;

	public String getMyProperty() {
		return myProperty;
	}

	@Autowired
	public void setMyProperty(@Value("Java Configuration using Autowiring")String myProperty) {
		System.out.println("BeanC::setMyProperty setting myProperty:"+myProperty);
		this.myProperty = myProperty;
	}
	
}
