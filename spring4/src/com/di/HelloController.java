package com.di;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{
	Logger logger = Logger.getLogger(HelloController.class);
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.info("handleRequestInternal 호출성공");
		/*
		 * ModelAndView의 scope는 request이다.
		 * ModelAndView에는 forward처리이다.
		 * 꺼낼때는 어떻게 꺼내지?
		 */
		ModelAndView  mav = new ModelAndView();
		// ==> WEB-INF/view/ 접두어 - page
		// ==> 접미어.jsp
		// 완결편 ==> /WEB-INF/view/?.jsp
		mav.setViewName("di/helloResult");
		List<String> nameList = new ArrayList<>();
		nameList.add("이성계");
		mav.addObject("nameList", nameList);
//		ModelAndView  mav = new ModelAndView("index");
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext
//								("\\com\\di\\listBean.xml");
//		
//		InsaList test = (InsaList)context.getBean("insa");
//		mav.addObject("list",test.listBean);
//		
//		logger.info(test.listBean);
		return mav;
	}
	
}
