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
public class Empresa {
    private String nombre;
    private String url;
    
    public Empresa(String nombre, String url){
        this.nombre = nombre;
        this.url = url; 
    }
    
    public String getNombre (){
        return this.nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getUrl(){
        return this.url;
    }
    
    public void setUrl(String url){
        this.url = url;
    }
}
