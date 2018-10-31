<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="./CSS/style.css">
<title>Login</title>
</head>
<body>
	<jsp:include page="header.jsp"/>

	<div id="contents">
		<h1>Login画面</h1>
		<s:form id="form" action="LoginAction">
		<table>
			<tr>
				<th>ログインID:</th><td><s:textfield name="loginId" class="txt"/></td>
			</tr>
			<tr>
				<th>パスワード:</th><td><s:textfield name="password" class="txt"/></td>
			</tr>

		</table>



		</s:form>
	</div>

	<jsp:include page="footer.jsp"/>
</body>
</html>