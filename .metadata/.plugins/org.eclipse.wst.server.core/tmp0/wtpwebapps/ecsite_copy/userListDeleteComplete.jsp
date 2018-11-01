<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />


<title>UserListDeleteComplete画面</title>

<style type="text/css">

	body {
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
	}

	table {
	text-align:center;
	margin:0 auto;
	}

	/* ========ecsite LAYOUT======== */
	#top {
	width:780px;
	margin:30px auto;
	border:1px solid #333;
	text-align: center;
	}

	#header {
	width: 100%;
	height: 80px;
	background-color: black;
	}

	#main {
	width: 100%;
	height: 500px;
	text-align: center;
	}

	#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear:both;
	}

	#text-center {
	border:1px solid gray;
	display: inline-block;
	text-align: center;
	padding: 0px 15px 5px 15px;
	margin: 0px 10px ;
	}

</style>
</head>
<body>

	<div id="header">
		<div id="pr"></div>
	</div>

	<div id="main">
		<div id="top">
			<p>UserListDeleteComplete</p>
		</div>
		<s:if test="userInfoDTOList == null">
			<h3>ユーザー情報はありません。</h3>
		</s:if>
		<s:elseif test="message == null">
			<h3>すべてのユーザーを削除しました。</h3>
		</s:elseif>
		<s:if test="message != null">
			<h3><s:property value="message"/></h3>
		</s:if>
		<div id="text-right">
					<p>管理者TOP画面へ戻る場合は<a href='<s:url action="AdminAction" />'>こちら</a></p>
		</div>


	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>



</body>
</html>