package com.erp;


import org.apache.log4j.Logger;


public class DeptLogic {
	Logger logger = Logger.getLogger(DeptLogic.class);
	public DeptDao deptDao = null; 
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	public void deptInsert() {
		logger.info("deptInsert 호출 성공");
		//deptDao.deptInsert();
	}
}
