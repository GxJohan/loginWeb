/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author JOHAN
 */

//La clase logica.usuario es la clase de entidad que representa a los usuarios en la aplicación. 
//Esta clase se integra con JPA (Java Persistence API) para realizar el mapeo objeto-relacional con la tabla "USUARIO" en la base de datos.

@Entity
//La clase usuario está anotada con @Entity, lo que indica a JPA que esta clase es una entidad que debe ser mapeada a una tabla en la base de datos.
public class usuario {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private int id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;

    public usuario(int id, String dni, String nombres, String apellidos, String telefono) {
        
       
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public usuario() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
    
}
