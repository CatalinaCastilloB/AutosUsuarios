<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 23-06-2022
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>

    </title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">

</head>
<body>

<div class =  container>
    <h1 class="fw-lighter">Captura de licencias</h1>
</div>

<div class="container">
    <table class="table table-striped" >
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Numero</th>
            <th scope="col">Fecha vencimiento</th>
            <th scope="col">Clase</th>
            <th scope="col">Estado</th>
        </tr>
        </thead>

        <c:forEach var="licencia" items ="${listaLicencias}">
            <tbody>
            <tr>
                <th scope="row">${licencia.getId()}</th>
                <td>${licencia.numero}</td>
                <td>${licencia.fechaVencimiento}</td>
                <td>${licencia.clase}</td>
                <td>${licencia.estado}</td>
                <th><a href="/licencia/editar/${licencia.id }" class="btn btn-success">editar</a></th>
                <th><a href="/licencia/delete/${licencia.id}" class="btn btn-danger">elimiar</a></th>


            </tr>

            </tbody>
        </c:forEach>
    </table>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

</body>
</html>