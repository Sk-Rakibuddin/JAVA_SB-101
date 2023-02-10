package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo1 = ctx.getBean("demo", Demo.class);
		demo1.showDetails();
		demo1.cleanUp();
	}

}
