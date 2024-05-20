<%-- 
    Document   : mostrarUsuarios
    Created on : 21 abr. 2024, 19:20:28
    Author     : JOHAN
--%>

<%@page import="logica.usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        
        <h1>Lista de Usuarios Registrados</h1>
        <%
        List<usuario> listUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
        if (listUsuarios != null) {
            int cont = 1;
            for (usuario usu : listUsuarios) {
        %>
        <P><b>Usuario N°<%=cont%></b></P>
        <p>ID: <%=usu.getId()%></p>
        <p>Dni: <%=usu.getDni() %></p>
        <p>Nombres: <%=usu.getNombres() %> </p>
        <p>Apellidos: <%=usu.getApellidos() %></p>
        <p>Teléfono: <%=usu.getTelefono() %></p>
        <form action="SvEditar" method="GET">
        <input type="hidden" name="id_usuario" value="<%= usu.getId() %>">
        <button type="submit">Editar</button>
        </form>
        <p>------------------------------------</p>
        <% cont = cont + 1; %>
        <%
            }
        } else {
        %>
        <p>No hay usuarios registrados.</p>
        <%
        }
        %>
            
             <p>Cantidad de usuarios registrados: <%= listUsuarios.size() %></p>
             <form action="index.jsp" method="GET">
                <button type="submit">Agregar más usuarios</button>
             </form>
    </body>
</html>
