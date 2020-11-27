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
public abstract class Persona {
    private String codigo;
    private String nombre;
    
    public Persona(String codigo,String nombre){
        setCodigo(codigo);
        setNombre(nombre);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
