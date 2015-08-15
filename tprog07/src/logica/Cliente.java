/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.Date;
import java.util.List;


/**
 *
 * @author matias.heredia
 */
public class Cliente extends Usuario{
    private List<Usuario> Servicios;
    
    public Cliente(String nickname, String nombre, String apellido,String email, Date fechaNac, String url){
        super(nickname,nombre,apellido,email,fechaNac,url);
    }
    
}
