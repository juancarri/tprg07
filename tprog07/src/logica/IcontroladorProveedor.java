/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Set;
import java.util.Date;
/**
 *
 * @author Juan
 */
public interface IcontroladorProveedor {
    
    public void ingresarImagen(String imagen);
    public void ingresarDestino(String destino);
    public Set<DataCiudad> listarCiudades();
    public void ingresarCategoria(String Categoria);
    public Set<DataCategorias> listarCategorias();
    public void altaServicio(String nombre, String descripcion, int precio, String origen, String proveedor);
    public Set<DataProveedor> listarProveedores();
    public Set<DataServicio> listarServiciosXCategoria(String nomCategoria);
    public void ingresarNombreCategoria(String nombre);
    public void seleccionarPadre(String nombre);
    public void altaCategoria(/*sin parametros?*/);
    public Set<DataServicio> listarServiciosXProveedor(String nomProveedor);
    public void altaPromocion(String nomProveedor, Set<String> ser, String nombre);
    public void actualizarEstadoReserva(int idReserva,String nomCliente,Estado estado);
    public void ingresarDescripcionServicio(String desc);
    public void ingresarImagenServicio(String imagen);
    public void ingresarPrecioServicio(int precio);
    public void ingresarOrigenServicio(String origen);
    public void ingresarDestinoServicio(String destino);
    public void ingresarCategoriaServicio(String categoria);
    public void modificarServicio();
    public Set<DataEmpresa> listarEmpresas();
    public void altaProveedor(String nick, String nombre, String apellido, String email, Date fechaNac, String imagen, String nombreEmp);
    public Set<DataPromocion> listarPromocionesXProveedor(String nomProveedor);
    public DataInfoPromocion verInfoPromocion(String nomPromocion);
    public DataInfoServicio verInfoServicio(String nomServicio);
    public DataInfoProveedor verInfoProveedor(String nomProveedor);
}
