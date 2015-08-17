/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Set;

/**
 *
 * @author Juan
 */


public class Categoria {
    
    private String nombre;
    private Set<Categoria> hijos;
    private Set<Servicio> servicios;   
    
    public Categoria(String nombre){
        this.nombre = nombre;
        this.hijos = null;
        this.servicios = null;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Set<Categoria> getHijos(){
        return this.hijos;
    }
    
    public void setHijo(Categoria hijo){
        this.hijos.add(hijo);
    }
    
    public Set<Servicio> getServicios(){
        return this.servicios;
    }
    
    public void setServicio(Servicio servicio){
        this.servicios.add(servicio);
    }
    
    /**
     *
     * @param serv agrega este servicio a la coleccion de servicios de la categoria 
     */
    public void asociarServicioCategoria(Servicio serv){
    
    }
    
    /**
     *
     * @param cat es la categoria padre a la cual hay que agregarlo a sus hijos.
     */
    public void asociarPadre(Categoria cat){
    
    }
}
