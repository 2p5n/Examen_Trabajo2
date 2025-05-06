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
public class Celular implements Serializable {
    @Id
    int idCel;
    @Basic
    int estado;
    double saldo;
    double megas;
    String numero;

    public Celular() {
    }

    public Celular(int idCel, int estado, String numero) {
        this.idCel = idCel;
        this.estado = estado;
        this.numero = numero;
    }

    public Celular(int idCel, int estado, double saldo, double megas, String numero) {
        this.idCel = idCel;
        this.estado = estado;
        this.saldo = saldo;
        this.megas = megas;
        this.numero = numero;
    }

    public int getIdCel() {
        return idCel;
    }

    public void setIdCel(int idCel) {
        this.idCel = idCel;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMegas() {
        return megas;
    }

    public void setMegas(double megas) {
        this.megas = megas;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    
}
