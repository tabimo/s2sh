<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>Spring MVC</title>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript"
	src="http://jquery-json.googlecode.com/files/jquery.json-2.2.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resource/js/index.js"></script>
</head>
<body>
	<h1>出现错误！！！</h1>
</body>
</html>
