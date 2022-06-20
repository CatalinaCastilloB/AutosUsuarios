<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 16-06-2022
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Automovil</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<div class =  container>
    <h1 class="fw-lighter">
        Ingrese datos de auto
    </h1>
</div>

<div class = container>

    <%--@elvariable id="auto" type="Auto"--%>
    <form:form action="/ingresoAutomovil/Auto" method="post" modelAttribute="auto">
        <form:label class="form-control" path="anio">Anio:</form:label>
        <form:input class="form-control" path="anio"></form:input>
        <br>
        <form:label class="form-control" path="marca">Marca:</form:label>
        <form:input class="form-control" path="marca"></form:input>
        <br>
        <form:label class="form-control" path="modelo">Modelo:</form:label>
        <form:input class="form-control" path="modelo"></form:input>
        <br>
        <br>
        <input type="submit" class="btn btn-outline-primary" value ="Agregar Auto">


    </form:form>

    <c:if test="${msgError!=null}">
        <c:out value="${msgError}"></c:out>
    </c:if>

</div>
</body>
</html>

