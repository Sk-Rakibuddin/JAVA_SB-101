package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
      Tourist tourist=  ac.getBean("tourist", Tourist.class);
      System.out.println(tourist);
      HolidayPackage holidayPackage=ac.getBean("holidaypackage", HolidayPackage.class);
      holidayPackage.setPackage_name("Puri Travel");
      holidayPackage.setPackage_price(3000);
      holidayPackage.setPackage_expiry(new Date(2023,01,20));
      holidayPackage.showDetails();

    }
}
