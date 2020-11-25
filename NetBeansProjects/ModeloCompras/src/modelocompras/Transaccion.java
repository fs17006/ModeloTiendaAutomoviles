/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelocompras;

/**
 *
 * @author fer
 */
public class Transaccion {
    private int numero;
    private int cantidad;
    private String tipo; 
    private Articulo articulo;
    
    public Transaccion(int num,String tip,Articulo articulo, int cant){
        setNumero(num);
        setTipo(tip);
        setCantidad(cant);
        setArticulo(articulo);
        actualizarDisponibilidad();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
    public void actualizarDisponibilidad(){
        if(getTipo()=="registrar devolucion"){
            articulo.incrementarDisponibilidad(getCantidad());
            System.out.println("Se ha realizado la devolución de "+getCantidad()+" articulos del producto: \n  "+getArticulo().toString());
            
        }else{
            if(getTipo()=="registrar venta"){
                articulo.reducirDisponibilidad(getCantidad());
                System.out.println("Se ha realizado la venta de "+getCantidad()+" articulos del producto: \n  "+getArticulo().toString());
            }
        }       
    }

    @Override
    public String toString() {
        return "Transaccion{" + "numero=" + numero + ", cantidad=" + cantidad + ", tipo=" + tipo + ", articulo=" + articulo + '}';
    }
    
}
