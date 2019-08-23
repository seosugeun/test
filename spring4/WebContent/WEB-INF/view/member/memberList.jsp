<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>

<%
	//ModelAndView에 담긴 정보 꺼내 오기
	List<Map<String,Object>> memList = (List<Map<String,Object>>)request.getAttribute("memList");
	out.print(memList);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록[WEB-INF]</title>
</head>  
<body>

<%
	List<Map<String,Object>> nameList = (List<Map<String,Object>>)request.getAttribute("memList");
	out.print(nameList);
%> 

${memList}

</body>
</html>