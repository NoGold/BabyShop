<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginSuccess</title>
</head>
<body>
	<form action="user/infoChange" method="post">
		<table>

			<tr>
				<td>用户头像</td>
				<td><input type="text" name="userHeadImg" value="${requestScope.user.userHeadImg}" /></td>
			</tr>
			<tr>
				<td>用户Id</td>
				<td>${requestScope.user.userId}</td>
			</tr>
			<tr>
				<td>用户真实姓名</td>
				<td>${requestScope.user.userRealName}</td>
			</tr>
			<tr>
				<td>用户昵称</td>
				<td><input type="text" name="userNickName"
					value="${requestScope.user.userNickName}" /></td>
			</tr>
			<tr>
				<td>用户性别</td>
				<td><input type="text" name="userGender"
					value="${requestScope.user.userGender}" /></td>
			</tr>
			<tr>
				<td>用户生日</td>
				<td><input type="text" name="userBirth"
					value="${requestScope.user.userBirth}" /></td>
			</tr>
			<tr>
				<td>用户邮箱</td>
				<td>${requestScope.user.userMail}"</td>
			</tr>
			<tr>
				<td>用户电话</td>
				<td>${requestScope.user.userPhone}"</td>
			</tr>
			<tr>
				<td>用户积分</td>
				<td>${requestScope.user.userPoints}</td>
			</tr>
			<tr>
				<td>用户住址</td>
				<td><input type="text" name="userResidence"
					value="${requestScope.user.userResidence}" /></td>
			</tr>
			<tr>
				<td>-----</td>
				<td><input type="submit" value="修改" /></td>
			</tr>
		</table>
	</form>
</body>
</html>