<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 13-06-2022
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%-- pasar info desde vista a un url(action) method="get", este es por defaoult, pero se ve en la ruta, en camvio con posts no seran visibles para el usuario --%>
<%-- submit manda inmediatamnete la informacion al apretarlo, no hay que hacer nada mas
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<%-- el id se utiliza en el frontend, en name es el que "recoge" los datos. el id es unico, en esta  vista jsp--%>
<%-- <form action="/registro/usuario"  method = "post">
            <label for="Nombre"> Nombre:</label>
            <input type="text" id="Nombre" name="NombreIng">
            <br>
            <label for="Apellido"> Apellido:</label>
            <input type="text" id="Apellido" name="ApellidoIng">
            <br>
            <label for="Edad"> Edad:</label>
            <input type="number" id="Edad" name="EdadIng">
            <br>
            <input type="submit" value ="Registrar">
            <input type="button" value="enviar">
        </form>
        --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registro</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
    <div class = "container">
        <%--@elvariable id="usuario" type="Usuario"--%>
        <form:form class="form-control" action="/registro/usuario" method="post" modelAttribute="usuario">
            <form:label class="form-control" path="nombre">Nombre:</form:label>
            <form:input class="form-control" path="nombre"></form:input>
            <br>
            <form:label class="form-control" path="apellido">Apellido:</form:label>
            <form:input class="form-control" path="apellido"></form:input>
            <br>
            <form:label class="form-control" path="edad">Edad:</form:label>
            <form:input class="form-control" path="edad"></form:input>
            <br>
            <form:label class="form-control" path="password">contrasena:</form:label>
            <form:input class="form-control" type="password" path="password"></form:input>
            <br>
            <input type="submit" value ="Registrar">
            <input type="button" value="enviar">

        </form:form>

        <c:if test="${msgError!=null}">
            <c:out value="${msgError}"></c:out>
        </c:if>

    </div>
</body>
</html>
