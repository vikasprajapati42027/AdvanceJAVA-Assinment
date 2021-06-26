<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor:"green">

  <h3>Dear  <jsp:getProperty property="username" name="ob"/>welcome to this page</h3>
   <% 
   String username=request.getParameter("username");
   session.setAttribute("user",username);
   String encodeProductUrl=response.encodeURL("products.jsp");
   %>
   <p>To enjoy shopping <a href="<%=encodeProductUrl%>">Click Here</a></p>
   
</body>
</html>