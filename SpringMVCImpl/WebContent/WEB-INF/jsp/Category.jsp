<%@ page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="InsertCategory" method="post" align="center">
<table align="center">
<tr bgcolor="orange">
<td colspan="2"><center>Login Dialog</center></td>
</tr>
<tr bgcolor="pink">
<td>Category Id</td>
<td><input type="text" name="categoryId"/></td>
</tr>
<tr bgcolor="pink">
<td>Category Name</td>
<td><input type="text" name="categoryName"/></td>
</tr>
<tr bgcolor="pink">
<td>Category Description</td>
<td><textarea rows="5" cols="20" name="categoryDesc"></textarea></td>
</tr>
<tr>
<td colspan="2">
<center>
<input type ="submit" value="SUBMIT"/>
</center>
</td>
</tr>
</table>
</form>
<table align="center">
<tr>
<td>Category Id</td>
<td>Category Name</td>
<td>Category Desc</td>
</tr>
<c:forEach items="${categoryList}" var="category">
<tr>
<td>${category.categoryId}</td>
<td>${category.categoryName}</td>
<td>${category.categoryDesc}</td>
<td><a href="deleteCategory/${category.categoryId}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>