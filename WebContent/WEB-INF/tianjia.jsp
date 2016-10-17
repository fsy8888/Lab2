<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- <%@taglib prefix="s" uri="/struts-tags" %>  -->
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 body{
 background-image:url(wlcome/welcome.jpg);
  
 }
 body{
 color:#FF1CAE ;
 }
 </style>
</head>
<body>
<center>
不好意思，您之前添加书籍的作者未找到，请添加作者信息！ 
<s:form action="tianjia" method="post">
     <s:textfield name="AuthorID" label="作者的ID："></s:textfield>
      <s:textfield name="Name" label="作者的名字："></s:textfield>
      <s:textfield name="Age" label="作者的年龄："></s:textfield>
       <s:textfield name="Country" label="作者的国家："></s:textfield>
     <s:submit value="添加"></s:submit>
     
</s:form>


</center>

</body>
</html>