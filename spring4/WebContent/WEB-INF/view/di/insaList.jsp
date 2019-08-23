<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<String> insalList = (List<String>)request.getAttribute("listBean");

	out.print("===================="+"<br>");
		out.print(insalList.get(0)+"<br>");
		out.print(insalList.get(0)+"<br>");
		out.print(insalList.get(2)+"<br>");
		out.print(insalList.get(0)+"<br>");
		out.print(insalList.get(2)+"<br>");
		out.print(insalList.get(0)+"<br>");
		out.print(insalList.get(0)+"<br>");

		out.print("===================="+"<br>");
		
	for(int i=0;i<insalList.size();i++){
		out.print(insalList.get(i)+"<br>");
	}
%>
</body>
</html>