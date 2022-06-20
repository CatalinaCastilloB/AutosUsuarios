<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 13-06-2022
  Time: 12:45
  To change this template use File | Settings | File Templates.

  Este documento es el que crea frontend
--%>
<%-- <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%-- //este tag deja ocupar obj de java, usando el prefijo --%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Catalina del Carmen Castillo Belmar</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<br>
<div class="container">
    <table class="table table-striped" >
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Edad</th>
        </tr>
        </thead>

        <c:forEach var="usuario" items ="${usuariosCapturados}">
            <tbody>
            <tr>
                <th scope="row">${usuario.getId()}</th>
                <td>${usuario.getNombre()}</td>
                <td>${usuario.getApellido()}</td>
                <td>${usuario.edad}</td>
            </tr>

            </tbody>
        </c:forEach>
    </table>
</div>

</body>
</html>

