package edu.central.central.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    
    @Id
    private int idPersona;
    @Column(name = "col_nombre", length = 50)
    private String nombre;


    public Persona() {
        this.idPersona=100;
        this.nombre="Cadena vacía";
    }
    
    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}