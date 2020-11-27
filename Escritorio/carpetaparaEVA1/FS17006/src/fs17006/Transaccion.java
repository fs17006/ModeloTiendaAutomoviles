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
public class Transaccion {
    private int numero;
    private String tipo;
    private int cantidad;
    private Automovil automovil;
    
    public Transaccion(int nmero,String tipo,Automovil automovil,int cantidad){
        setNumero(numero);
        setTipo(tipo);
        setCantidad(cantidad);
        setAutomovil(automovil);
        actualizarDisponibilidad();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    
    public void actualizarDisponibilidad(){
        if(getTipo()=="registrar devolucion"){
            automovil.incrementarDisponibilidad(getCantidad());
            System.out.println("Se ha realizado la devolución de "+getCantidad()+" del automovil: \n  "+getAutomovil().toString());
            
        }else{
            if(getTipo()=="registrar venta"){
                automovil.reducirDisponibilidad(getCantidad());
                System.out.println("Se ha realizado la venta de "+getCantidad()+" del automovil: \n  "+getAutomovil().toString());
            }
        }       
    }

    @Override
    public String toString() {
        return "Transaccion{" + "numero=" + numero + ", tipo=" + tipo + ", cantidad=" + cantidad + ", automovil=" + automovil + '}';
    }
    
}
