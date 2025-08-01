package com.spring.Spring_Practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Airtel air = ctx.getBean("air", Airtel.class);
		air.calling(96161);
		air.data("5G");

	}

}
