<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./CSS/style.css">

<title>header</title>
</head>
<body>
	<div id="header">
		<div id="header-title">BookStore</div>
		<div id="header-menu">
		<ul>
			<li><s:textfield name="keywords" placeholder="検索ワード"/></li>
			<li><select name="age">
     	<option value="a">選択してください</option>
        <script>
        for(var i=18;i<=65;i++){
            document.write("<option value='z'>");
            document.write(i);
            document.write("</option>");
        }
        </script>
    </select></li>
			<s:form action="MypageAction">
			<li><s:submit value="マイページ" name="button" class="botan"/></li>
			</s:form>
			<s:form action="LoginAction">
			<li><s:submit value="ログイン" name="button" class="botan" /></li>
			</s:form>
			<s:form action="CartAction">
			<li><s:submit value="カート" name="button" class="botan"/></li>
			</s:form>
		</ul>
		</div>
	</div>

</body>
</html>