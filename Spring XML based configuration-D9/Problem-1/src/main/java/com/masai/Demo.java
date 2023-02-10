package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Tourist tourist= ctx.getBean("tr",Tourist.class);
		//System.out.println(tourist);
		
		//Register HolidayPackage class with the Spring Container and configure all its
		//dependencies using setter injection.
		HolidayPackage holidayPackage = ctx.getBean("hp", HolidayPackage.class);
		holidayPackage.showDetails();

	}

}
