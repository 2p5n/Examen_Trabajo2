/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author jdgue
 */
@Entity
public class Cliente implements Serializable {
    @Id
    int idClie;
    @Basic
    int cedula;
    String nombre;
    String apellido;

    public Cliente() {
    }

    public Cliente(int idClie, int cedula, String nombre, String apellido) {
        this.idClie = idClie;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdClie() {
        return idClie;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}
