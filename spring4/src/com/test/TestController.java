package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TestController extends MultiActionController {
	Logger logger = Logger.getLogger(TestController.class);
	public TestLogic testLogic = null;
	public void setTestLogic(TestLogic testLogic) {
		this.testLogic = testLogic;
	}
//	public ModelAndView testList(HttpServletRequest req, HttpServletResponse res) {
//		logger.info("testList 호출 성공");
//		ModelAndView mav = new ModelAndView();
//		return mav;
//	}
	public void testList(HttpServletRequest req, HttpServletResponse res) {
		logger.info("testList 호출 성공");
	}
	public void testAdd(HttpServletRequest req, HttpServletResponse res) {
		logger.info("testAdd 호출 성공");
	}
	public void testUdp(HttpServletRequest req, HttpServletResponse res) {
		logger.info("testUdp 호출 성공");
	}
	public void testDel(HttpServletRequest req, HttpServletResponse res) {
		logger.info("testDel 호출 성공");
	}
}
