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
public class Promocion {
    private String nombre;
    private int descuento;
    private int precioTotal;
    
    public Promocion(String nombre, int descuento, int precioTotal){
        this.nombre = nombre;
        this.descuento = descuento;
        this.precioTotal = precioTotal;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDescuento(){
        return descuento;
    }
    public int getPrecioTotal(){
        return precioTotal;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDescuento(int descuento){
        this.descuento = descuento;
    }
    public void setPrecioTotal(int precioTotal){
        this.precioTotal = precioTotal;
    }
    public void agregarServicio(Servicio servicio){
        
    }
}
