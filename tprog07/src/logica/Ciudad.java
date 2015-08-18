/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author giovani
 */
public class Ciudad {
    
    private String nombre;
    private Pais pais;
    
    public Ciudad(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Pais getPais(){
        return this.pais;
    }
    
    public void setPais(Pais pais){
        this.pais = pais;
    }
}
