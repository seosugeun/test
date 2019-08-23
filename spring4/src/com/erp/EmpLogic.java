package com.erp;

import org.apache.log4j.Logger;

import com.vo.DeptVO;
import com.vo.EmpVO;
//@Service
public class EmpLogic {
	Logger logger = Logger.getLogger(EmpLogic.class);
	//@Autowired
	public EmpDao empDao = null;
	public DeptDao deptDao = null;
	
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	public void doEmp(EmpVO eVO, DeptVO dVO) {
		logger.info("empInsert 호출 성공");
		try {
			deptDao.deptUpdate(dVO);
			empDao.empInsert(eVO);
		} catch (Exception e) {
			throw e;
		}
	}

}
