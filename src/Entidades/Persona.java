/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Persona {
    private String nombre;
    private Date fecNac;
    private int atributo_nuevo;
    
    public Persona() {
    }

    public Persona(String nombre, Date fecNac) {
        this.nombre = nombre;
        this.fecNac = fecNac;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fecNac=" + fecNac.toLocaleString() + '}';
    }
    
    
}
