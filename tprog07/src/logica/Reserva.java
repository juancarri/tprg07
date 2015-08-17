/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author giovani
 */
public class Reserva {
    private int id; 
    private Date fechaCreacion;
    private Date fechaInicio;
    private Date fechaFin;
    private float precio;
    private Estado estado;
    
    public Reserva(int id, Date fechaCreacion, Date fechaInicio, Date fechaFin, float precio, Estado estado){
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
        this.estado = estado;
    }
    
    public int getId(){
        return id;
    }
    public Date getFechaCreacion(){
        return fechaCreacion;
    }
    public Date getFechaInicio(){
        return fechaInicio;
    }
    public Date getFechaFin(){
        return fechaFin;
    }
    public float getPrecio(){
        return precio;
    }
    public Estado getEstado(){
        return estado;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setFechaCreacion(Date fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFin(Date fechaFin){
        this.fechaFin = fechaFin;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }
}
