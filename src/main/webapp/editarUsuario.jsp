<%-- 
    Document   : editarUsuario
    Created on : 1 may. 2024, 20:06:04
    Author     : JOHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <h1>Editar Formulario</h1>
            <%@ page import="logica.usuario" %>
    <%
        usuario usuarioEditar = (usuario) request.getAttribute("usuarioEditar");
    %>

    <form action="SvActualizar" method="POST">
        <input type="hidden" name="id_usuario" value="<%= usuarioEditar.getId() %>">
        <p><label>DNI: </label> <input type="text" name="dni" value="<%= usuarioEditar.getDni() %>"> </p>
        <p><label>Nombres: </label> <input type="text" name="nombres" value="<%= usuarioEditar.getNombres() %>"> </p>
        <p><label>Apellidos: </label> <input type="text" name="apellidos" value="<%= usuarioEditar.getApellidos() %>"> </p>
        <p><label>Teléfono: </label> <input type="text" name="telefono" value="<%= usuarioEditar.getTelefono() %>"> </p>
        <button type="submit">Actualizar</button>
    </form>
    </body>
</html>
