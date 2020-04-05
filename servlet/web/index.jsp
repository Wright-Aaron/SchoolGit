<%--
  Created by IntelliJ IDEA.
  User: aaron
  Date: 4/2/2020
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home</title>
    <link rel="stylesheet" href="style.css">
    <link href="https://fonts.googleapis.com/css?family=Baskervville&display=swap" rel="stylesheet">
  </head>
  <body>
    <main>
      <h2>Welcome to the calculator web app</h2>

      <div>
        <p>To get a random number <a href="${pageContext.request.contextPath}/Servlet">click here</a></p>
        <p>To go to the calculator <a href="${pageContext.request.contextPath}/calculator.html">click here</a></p>
      </div>
    </main>
  </body>
</html>
