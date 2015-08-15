/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;
import java.util.Date;

/**
 *
 * @author matias.heredia
 */
public class Proveedor extends Usuario{
    private String empresa;
    private String link_empresa;
    
    public Proveedor(String nickname, String nombre, String apellido,String email, Date fechaNac, String url){
        super(nickname,nombre,apellido,email,fechaNac,url);
    }
    
    public void set_empresa(String emp){
        this.empresa=emp;
    }
    public void set_link_empresa(String url){
        this.link_empresa=url;
    }
    
}

