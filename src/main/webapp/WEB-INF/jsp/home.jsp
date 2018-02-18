<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title>User </title>
   </head>
   <body>
   	<a href="${request.context}/greet">Greet</a> <br>
   	
      <c:forEach items="${users}" var = "user">
      	${user.id } : ${user.name} <br> 
      </c:forEach>
   </body>
</html>
