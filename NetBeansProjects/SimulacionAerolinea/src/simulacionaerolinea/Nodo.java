/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionaerolinea;

/**
 *
 * @author fer
 */
public class Nodo {
    private Object elemento;
    private Nodo siguiente;
    
    public Nodo(Object e,Nodo n){
        elemento=e;siguiente =n;
    }
    
    void cambiarElemento(Object e){
        elemento=e;
    }
    
    void cambiarSiguiente(Nodo n){
        siguiente=n;
    }
    
    Object element(){
        return elemento;
    }
    
    Object siguiente(){
        return siguiente;
    }
}
