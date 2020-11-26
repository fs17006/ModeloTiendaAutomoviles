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
public class ColaAtencion implements Cola{
    private Nodo cabecera;
   private Nodo cola;
   private int longitud;
   
   public ColaAtencion(){
       cabecera=cola=null;
       longitud=0;
   }
   
   public int longitud(){
       return longitud;
   }
   
   public boolean esVacia(){
       return (cabecera==null);
   }
   
   public void encolar(Object o){
       Nodo n=new Nodo(o,null);
       if(longitud==0)cabecera=n;
       else cola.cambiarSiguiente(n);
       cola=n;
       longitud++;
   }
   
   public Object desencolar(){
       Object aux;
       if(esVacia())return null;
       aux=cabecera.element();
       cabecera=(Nodo) cabecera.siguiente();
       longitud--;
       if(longitud==0)cola=null;
       return aux;
   }
   
   public Object cabecera(){
       if(esVacia())return null;
       else return cabecera.element();
   }
    
}
