<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 23-06-2022
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="dorm" uri="http://www.springframework.org/tags/form" %>

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

    <%--@elvariable id="licencia" type="Licencia"--%>
    <form:form action="/licencia/guardar" method="post" modelAttribute="licencia">
        <form:label class="form-control" path="numero">Numero:</form:label>
        <form:input class="form-control" path="numero"></form:input>
        <br>
        <form:label class="form-control" path="fechaVencimiento">Fecha de vencimiento:</form:label>
        <form:input type="date" class="form-control" path="fechaVencimiento"></form:input>
        <br>
        <form:label class="form-control" path="clase">Clase:</form:label>
        <form:input class="form-control" path="clase"></form:input>
        <br>
        <form:label class="form-control" path="estado">Estado:</form:label>
        <form:input class="form-control" path="estado"></form:input>
        <br>
        <br>
        <form:select path="usuario" class="form-select">

            <form:option value="0">Seleccione un usuario</form:option>

            <c:forEach  var="usuario" items="${listaUsuarios}">
            <c:if test="${usuario.licencia.id == null}">
                <form:option value="${usuario.id}">${usuario.nombre} ${usuario.apellido} </form:option>
            </c:if>
            </c:forEach>

        </form:select>


        <input type="submit" class="btn btn-outline-primary" value ="Agregar Auto">


    </form:form>

    <c:if test="${msgError!=null}">
        <c:out value="${msgError}"></c:out>
    </c:if>

</div>
</body>
</html>
