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
public interface Cola {
    public int longitud();
    public boolean esVacia();
    public void encolar(Object o);
    public Object desencolar();
    public Object cabecera();
    
}
