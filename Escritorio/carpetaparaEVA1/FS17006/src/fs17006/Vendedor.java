/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs17006;

import java.util.ArrayList;

/**
 *
 * @author fer
 */
public class Vendedor extends Persona{
    private ArrayList<Transaccion> listaTransaccion = new ArrayList<Transaccion>();
    public Vendedor(){
        super("","");
    }
    
    public Vendedor(String cod, String nom){
        super(cod,nom);
    }
    
    public void registrarVenta(int numero, Automovil automovil, int cantidad){
        Transaccion transaccion = new Transaccion(numero,"registrar venta",automovil,cantidad);
        agregarTransaccion(transaccion);
    }
    
    public void registrarDevolucion(int numero, Automovil automovil, int cantidad){
        Transaccion transaccion = new Transaccion(numero,"registrar devolucion",automovil,cantidad);
        agregarTransaccion(transaccion);
        System.out.println("  Vendedor que registro esta devolución: "+toString());
    }
    
     
    public int cantidadTransaccion(){
        return listaTransaccion.size();
    }
    
    public boolean listaVacia(){
        return listaTransaccion.isEmpty();
    }
    
    public void agregarTransaccion(Transaccion transaccion){
        listaTransaccion.add(transaccion);
    }
    
    public String mostrarAuto(){
        String salida="";
        if(listaVacia()==false){
            for (Transaccion transaccion : listaTransaccion) {
                salida="  "+salida+transaccion.getAutomovil().toString();
            }            
        }else{
            salida="No hay automoviles almacenados";
        }
        return salida;
    }
    
    public String toString(){
        return super.toString();
    }
}
