package com.maria.sistemaincidencias;
// Generated 28-ene-2020 0:45:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Personas generated by hbm2java
 */
public class Personas  implements java.io.Serializable {


     private int codigo;
     private String nombre;
     private String password;
     private String email;
     private Set<Avisos> avisoses = new HashSet(0);

    public Personas() {
    }

	
    public Personas(int codigo, String nombre, String password, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }
    public Personas(int codigo, String nombre, String password, String email, Set avisoses) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.password = password;
       this.email = email;
       this.avisoses = avisoses;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getAvisoses() {
        return this.avisoses;
    }
    
    public void setAvisoses(Set avisoses) {
        this.avisoses = avisoses;
    }




}


