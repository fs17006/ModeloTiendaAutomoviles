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
public class Cliente {
    private int llegada;
    private int horaAtencion;

    public Cliente(int llegada, int horaAtencion) {
        setLlegada(llegada);
        setHoraAtencion(horaAtencion);
    }

    public int getLlegada() {
        return llegada;
    }

    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }

    public int getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(int horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "llegada=" + llegada + ", horaAtencion=" + horaAtencion + '}';
    }
    
}
