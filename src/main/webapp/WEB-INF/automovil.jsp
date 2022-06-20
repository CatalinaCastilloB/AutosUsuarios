<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 16-06-2022
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Automovil</title>
</head>
<body>
    <p><c:out value="${auto.anio} ${auto.modelo} ${auto.marca}"></c:out></p>



</body>
</html>
