/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelocompras;

import java.util.ArrayList;

/**
 *
 * @author fer
 */
public class Proveedor extends Persona{
    private ArrayList<Transaccion> listaTransaccion=new ArrayList<Transaccion>();

    public Proveedor() {
        super("","");
    }
    
    public Proveedor(String cod,String nom){
        super(cod,nom);
    }
    
    public void agregarTransaccion(Transaccion transaccion){
        listaTransaccion.add(transaccion);
    }
    
    public void registrarCompra(int numero, Articulo articulo, int cantidad){
        Transaccion transaccion = new Transaccion(numero,"registrar compra",articulo, cantidad);
        agregarTransaccion(transaccion);
    }
   
    public void registrarDevolucion(int numero, Articulo articulo, int cantidad){
        Transaccion transaccion = new Transaccion(numero,"registrar devolucion",articulo,cantidad);
        agregarTransaccion(transaccion);
        System.out.println("  Proveedor registro esta devolución: "+toString());
    }
    
      public int cantidadTransaccion(){
        return listaTransaccion.size();
    }
    
    public boolean listaVacia(){
        return listaTransaccion.isEmpty();
    }
    
     public String mostrarProductos(){
        String salida="";
        if(listaVacia()==false){
            for (Transaccion transaccion : listaTransaccion) {
                salida="  "+salida+transaccion.getArticulo().toString();
            }            
        }else{
            salida="No hay articulos almacenados";
        }
        return salida;
    }
    
    public String toString(){
        return super.toString();
    }
}
