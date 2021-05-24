package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloBeanConfig.class);
			HelloBean bean=(HelloBean)ctx.getBean("helloBean");
			System.out.println(bean.sayHello());
	
	}

}
