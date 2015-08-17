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
public class ItemReserva {
    private int cantidad;
    private Servicio servicio;
    private Promocion promocion;
    
    public ItemReserva(int cantidad){
        this.cantidad = cantidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public DataItem getDataItem(){
        return null;
    }
}
