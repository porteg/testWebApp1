<%@ page import="com.ibm.test.webapp1.*" %>
<%
WebApp1 webapp = new WebApp1("nuevo dato 1", "nuevo dato 2");
%>

<html>
<body>
<h2>Hello World!</h2>
<h4><%=webapp.getDato1() %></h4>
<h4><%=webapp.getDato2() %></h4>
</body>
</html>
