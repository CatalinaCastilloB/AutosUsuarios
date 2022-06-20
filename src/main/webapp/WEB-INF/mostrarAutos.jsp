<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 16-06-2022
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">

</head>
<body>
    <div>
        <c:if test="${msgError!=null}">
            <c:out value="${msgError}"></c:out>
        </c:if>
        <c:forEach var="auto" items = "${autosCapturados}">
            <p>
                    ${auto.marca} ${auto.modelo} ${auto.anio}

            </p>

        </c:forEach>
    </div>
</body>
</html>
