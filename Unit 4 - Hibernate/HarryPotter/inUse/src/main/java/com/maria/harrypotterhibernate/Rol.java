package com.maria.harrypotterhibernate;
// Generated 27-ene-2020 16:20:30 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private int id;
     private String nombre;
     private Set<Personajes> personajeses = new HashSet(0);

    public Rol() {
    }
    
    public Rol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Rol(int id, String nombre, Set personajeses) {
       this.id = id;
       this.nombre = nombre;
       this.personajeses = personajeses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getPersonajeses() {
        return this.personajeses;
    }
    
    public void setPersonajeses(Set personajeses) {
        this.personajeses = personajeses;
    }
}


