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
public class Recargas implements Serializable {
    @Id
    int idReca;
    @Basic
    double saldo;
    int valor;
    double megas;

    public Recargas() {
    }

    public Recargas(int idReca, int valor) {
        this.idReca = idReca;
        this.valor = valor;
    }

    public Recargas(int idReca, double saldo, int valor, double megas) {
        this.idReca = idReca;
        this.saldo = saldo;
        this.valor = valor;
        this.megas = megas;
    }
    
    public int getIdReca() {
        return idReca;
    }

    public void setIdReca(int idReca) {
        this.idReca = idReca;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getMegas() {
        return megas;
    }

    public void setMegas(double megas) {
        this.megas = megas;
    }

    
}
