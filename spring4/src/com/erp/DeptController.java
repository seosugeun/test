package com.erp;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class DeptController extends MultiActionController {
	Logger logger = Logger.getLogger(DeptController.class);
	public DeptLogic deptLogic = null;
	public void setDeptLogic(DeptLogic deptLogic) {
		this.deptLogic = deptLogic;
	}
	
	public void deptInsert(HttpServletRequest req, HttpServletResponse res) {
		logger.info("deptUpdate 호출 성공");
		int deptInsert = 0;
		//deptLogic.deptInsert();
		//req.setAttribute("deptUpdate", deptInsert);
		RequestDispatcher view = req.getRequestDispatcher("./deptList.jsp");
		try {
			view.forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
