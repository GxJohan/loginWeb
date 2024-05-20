
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controlador;
import logica.usuario;


@WebServlet(name = "SvActualizar", urlPatterns = {"/SvActualizar"})
public class SvActualizar extends HttpServlet {
Controlador control = new Controlador();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        int id_usuario=Integer.parseInt(request.getParameter("id_usuario"));
        String dni= request.getParameter("dni");
        String nombres=request.getParameter("nombres");
        String apellidos=request.getParameter("apellidos");
        String telefono=request.getParameter("telefono");
        
        usuario usuarioActualizado = new usuario(id_usuario,dni,  nombres,apellidos,telefono );
        control.actualizarUsuario(usuarioActualizado);
        response.sendRedirect("index.jsp");
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
