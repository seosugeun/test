package com.erp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class EmpController extends MultiActionController{
	Logger logger = Logger.getLogger(EmpController.class);
	public EmpLogic empLogic = null;
	//아래 메소드가 없으면 setter 메소드 부재 Exception.
	public void setEmpLogic(EmpLogic empLogic) {
		this.empLogic = empLogic;
	} 
	public String doEmp(HttpServletRequest req, HttpServletResponse res) {
		logger.info("deptUpdate 호출 성공");
		EmpVO eVO = new EmpVO();
		DeptVO dVO = new DeptVO();
		empLogic.doEmp(eVO,dVO);
		
		/*
		 * req.setAttribute("empInsert", eVO); RequestDispatcher view =
		 * req.getRequestDispatcher("./empList.jsp"); try { view.forward(req, res); }
		 * catch (ServletException | IOException e) { e.printStackTrace(); }
		 */
		return "redirect:empInsertOK.jsp";
	}
}
