/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fs17006;

/**
 *
 * @author fer
 */
public class Automovil {
    private String nombre;
    private int cantidadDisponible;
    
    public Automovil(String nombre){
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public void incrementarDisponibilidad(int cantidad){
        setCantidadDisponible(getCantidadDisponible()+cantidad);
    }
    
    public void reducirDisponibilidad(int cantidad){
        setCantidadDisponible(getCantidadDisponible()-cantidad);
    }

    @Override
    public String toString() {
        return "Automovil{" + "nombre=" + nombre + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
  
}
