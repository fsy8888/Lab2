
 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
  <%@ taglib prefix="s" uri="/struts-tags" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
 body{
 background-image:url(wlcome/welcome.jpg);
  
 }
 body{
 color:#E47833 ;
 }
 </style>
</head>
<body>
<center>
在数据库中找到该作者的书籍  如下所示：
<s:iterator  value="Reportlist">
<tr>
<td>
<a href=<s:url action="choose">
<s:param name="ISBN" value="ISBN"></s:param>
<s:param name="AuthorID" value="AuthorID"></s:param></s:url>>
<s:property value="Title"/>
</a>
<a href=<s:url action="delete">
 <s:param name="bookname" value="Title"></s:param>
</s:url>>删除</a>

</td>
</tr>

</s:iterator>


</center>
</body>
</html>