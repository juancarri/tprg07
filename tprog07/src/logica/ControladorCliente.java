/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author Juan
 */
public class ControladorCliente {
    public void actualizarEstadoReserva(String nomReserva, String nomCliente){}
    public void reservarPromocion(String proveedor, String promo, int cantidad, Date fechaIni, Date fechaFin){}
    public void altaCliente(String nick, String nombre, String apellido, String email, Date fechaNac, String imagen){}
    public Set<DataCliente> listarClientes(){
        return null;
    }
    public void reservarServicio(String proveedor, String promo, int cantidad, Date fechaIni, Date fechaFin){}
    public void cancelarReserva(String nomCliente, int id){}
    public Set<DataReserva> listarReservasXCliente(String nomCliente){
        return null;
    }
    public DataInfoReserva verInfoReserva(int id){
        return null;
    }
    public DataInfoCliente verInfoCliente(String nomCliente){
        return null;
    }
}
