/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;
import java.util.*;
/**
 *
 * @author matias.heredia
 */
public class Usuario {
    private String nombre;
    private String nickname;
    private String apellido;
    private String email  ;
    private Date fechaNac;
    private String imagen;
    
    
    public Usuario(String nickname, String nombre, String apellido,String email, Date fechaNac, String url){
        this.nickname= nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
        this.imagen=url;
     }
    public void set_nombre(String nom){
        this.nombre = nom;
    }
    public void set_nickname(String nom){
        this.nickname= nom;
    }
    public void set_apellido(String nom){
        this.apellido = nom;
    }
    public void set_email(String nom){
        this.email =nom;
    }
    public void set_fechanac(Date fec){
        this.fechaNac = fec;
    }
    public void set_imagen(String url){
        this.imagen=url;
    }
    
    public String get_nombre(String nom){
        return this.nombre = nom;
    }
    public String get_nickname(String nom){
        return this.nickname= nom;
    }
    public String get_apellido(String nom){
        return this.apellido = nom;
    }
    public String get_email(String nom){
        return this.email =nom;
    }
    public Date get_fechanac(Date fec){
        return this.fechaNac = fec;
    }
    public String get_imagen(String url){
        return this.imagen=url;
    }
    
}
