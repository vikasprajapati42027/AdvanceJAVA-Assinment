<!--  Controller JSP -->
<jsp:useBean id="ob" class="com.phoenix.web.models.LoginBean" scope="request">
</jsp:useBean>

<jsp:setProperty  property="username" name="ob"/>
<jsp:setProperty  property="password" name="ob" param="passwd"/>

<%
   if(ob.isValid()) { %>
    <jsp:forward page="/welcome.jsp">
    <jsp:param value="java" name="book1"/>
     <jsp:param value="jsp" name="book2"/>
     </jsp:forward>
     <%  }else{  %>
     <h2  style="color:red;">Invalid Login</h2>
     <jsp:include page="/login.html"/>
     <% } %>
     

