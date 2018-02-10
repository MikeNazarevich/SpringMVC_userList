<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mikhail
  Date: 9.2.18
  Time: 23.51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <link rel="stylesheet" href="../../resources/css/users-page.css">
        <title>Title</title>
    </head>
    <body>
        <table>
            <thead>
                <td>id</td>
                <td>Name</td>
                <td>Surname</td>
                <td></td>
            </thead>

            <c:forEach var="u" items="${users}">
                <tr>
                    <td><c:out value="${u.id} "/></td>
                    <td><c:out value="${u.name}"/></td>
                    <td><c:out value="${u.surname}"/></td>
                    <td><a href='<c:url value='/users/${u.id}/delete'/>'> Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
