package com.spring.javaconfig;

public class HelloBean {
static {
	System.out.println("bean is loding...");
	
}

public HelloBean() {
	System.out.println("bean created...");
	
}
public String sayHello() {
	return "helo";
}
}
