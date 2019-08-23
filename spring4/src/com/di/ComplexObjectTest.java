package com.di;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexObjectTest {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
								("com\\di\\mapBean.xml");
		ComplexObject co = (ComplexObject)context.getBean("moreComplexObject");
		Map<String,Object> rMap = co.someMap;
		Object keys[] = rMap.keySet().toArray();
		for(int i=0;i<keys.length;i++) {
			System.out.print(keys[i]);
			System.out.println(" " + rMap.get(keys[i]));
		}
		System.out.println(co.someMap);
	}
}
