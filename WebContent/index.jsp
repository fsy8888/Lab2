
 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
  <%@ taglib prefix="s" uri="/struts-tags" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <title>图书查询系统</title>
<style type="text/css">
 body{
 background-image:url(wlcome/welcome.jpg);
  
 }
 body{
 color:#32CD32 ;
 }
 </style>
 </head>
 
<body>
<center>
 <s:form action="login" method="post">
     <s:textfield name="Name" label="作者的名字："></s:textfield>
     <s:submit value="查询"></s:submit>
     
</s:form>
<s:form action="xinzeng" method="post">
     <s:textfield name="ISBN" label="ISBN："></s:textfield>
      <s:textfield name="Title" label="Title："></s:textfield>
       <s:textfield name="AuthorID" label="AuthorID："></s:textfield>
        <s:textfield name="Publisher" label="Publisher："></s:textfield>
         <s:textfield name="PublishDate" label="PublishDate："></s:textfield>
          <s:textfield name="Price" label="Price："></s:textfield>
     <s:submit value="添加"></s:submit>
 </s:form>
 
 <s:form action="gengxin" method="post">
     <s:textfield name="ISBN" label="ISBN："></s:textfield>
      <s:textfield name="Title" label="Title："></s:textfield>
       <s:textfield name="AuthorID" label="AuthorID："></s:textfield>
        <s:textfield name="Publisher" label="Publisher："></s:textfield>
         <s:textfield name="PublishDate" label="PublishDate："></s:textfield>
          <s:textfield name="Price" label="Price："></s:textfield>
     <s:submit value="更新"></s:submit>
 </s:form>
</center>

 </body>
 </html>