/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author JOHAN
 */
public class Controlador {
    //crear instancia para interatuar con la capa de persostencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //método psra crear la clase usuarioJpa a traves de la clase ControladoraPersis de la BD
    public void crearUsuario (usuario usu){
    controlPersis.crearUsuario(usu);
    }
    
    //método psra recuperar/traer (findusuarios) la clase usuarioJpa a traves de la clase ControladoraPersis de la BD
    public List<usuario> traerUsuarios (){
    return controlPersis.traerUsuarios();
    }
    
    

    public void borrarUsuario(int id_usu) {
        controlPersis.borrarUsuario(id_usu);
    }

    public usuario obtenerUsuario(int id_usuario) {
        return controlPersis.obtenerUsuario(id_usuario);
    }

    public void actualizarUsuario(usuario usu) {
        controlPersis.actualizarUsuario(usu);
    }
}
