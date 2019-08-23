package com.test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MemberController extends MultiActionController {
	Logger logger = Logger.getLogger(MemberController.class);
	public MemberLogic memberLogic = null;
	public void setMemberLogic(MemberLogic memberLogic) {
		this.memberLogic = memberLogic;
	}
	
	public void memberList3(HttpServletRequest req, HttpServletResponse res) {
		logger.info("memberLsit3 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memberLogic.MemberList();
		req.setAttribute("memberList", memList);
		try {
			res.sendRedirect("./memberList.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void memberList2(HttpServletRequest req, HttpServletResponse res) {
		logger.info("memberLsit2 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memberLogic.MemberList();
		req.setAttribute("memberList", memList);
		RequestDispatcher view = req.getRequestDispatcher("./memberList.jsp");
		try {
			view.forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	public ModelAndView memberList(HttpServletRequest req, HttpServletResponse res) {
		logger.info("memberLsit 호출 성공");
		List<Map<String,Object>> memList = null;
		ModelAndView mav = new ModelAndView();
		memList = memberLogic.MemberList();
		mav.addObject("memList", memList);
		//만일 setViewName메소드에서 페이지 이름을 생략하면 url요청 이름이 페이지 이름이됨.
		mav.setViewName("member/memberList");
		
		return mav;
	}

}
