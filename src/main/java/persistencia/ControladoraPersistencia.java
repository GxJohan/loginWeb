/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.usuario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author JOHAN
 */
public class ControladoraPersistencia {
    
    //instancia de la clase usuarioJpaController para interactuar con la entidad usuario a través de JPA.
    usuarioJpaController usuJpa = new usuarioJpaController();
    
    
    //método para llamar al mpetidi create de la clase usuarioJpaController para guardar nuevo usuario en la BD
    public void crearUsuario(usuario usu){
    usuJpa.create(usu);
    
    }
    
    //Método para llamar a otro método(findusuarioentities) de la clase usuarioJpaController para obtener la lista de los usuarios de la BD
    //Operación READ
    public List<usuario> traerUsuarios(){
        return usuJpa.findusuarioEntities();
    }

    public void borrarUsuario(int id_usu) {
        try {
            usuJpa.destroy(id_usu);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public usuario obtenerUsuario(int id_usuario) {
        return usuJpa.findusuario(id_usuario);
    }

    public void actualizarUsuario(usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
