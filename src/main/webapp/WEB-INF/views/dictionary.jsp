<%--
  Created by IntelliJ IDEA.
  User: Nghia B
  Date: 03/01/21
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home Dictionary</title>
</head>
<body>
<form action="/dictionary" method="post">
  <div>
    <label for="english">English</label>
    <input type="text" name="english" id="english">
    <button type="submit">Submit</button>
  </div>
  <c:if test="${requestScope['result'] != null}">
    <div>
      Vietnamese: <c:out value="${requestScope['result']}"></c:out>
    </div>
  </c:if>
</form>
</body>
</html>
