package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class listSimulation {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
								("\\com\\di\\listBean.xml");
		
		InsaList il = (InsaList)context.getBean("insa");
		
		System.out.println(il.listBean);
		
		for(String a:il.listBean)
			System.out.println(a);
		
	}
}
