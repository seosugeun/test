package com.test;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class MemberLogic {
	Logger logger = Logger.getLogger(MemberLogic.class);
	public MemberDao memberdao = null;
	public void setMemberdao(MemberDao memberdao) {
		this.memberdao = memberdao;
	}
	public List<Map<String,Object>> MemberList(){
		logger.info("MemberList 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memberdao.memberList();
		return memList;	
	}
}
