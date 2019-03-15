<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
  <head>
    <title>Completely Unsafe webpages inc</title>
  </head>
  <body>
  Hello <b><%= request.getParameter("name") %></b>!

  <c:forEach items="${requestScope.comments}" var="item">
      ${item}<br>
  </c:forEach>
  <form title="make a comment" method="post">
      <input type="text" name="title">
      <input type="text" name="content">
      <input type="submit">
  </form>
  </body>
</html>
