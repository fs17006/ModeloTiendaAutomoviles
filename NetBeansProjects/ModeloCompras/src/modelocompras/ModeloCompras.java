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
public class ModeloCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulo articulo1=new Articulo("mesa",9);
        Articulo articulo2=new Articulo("silla",6);
        
        Proveedor provedor=new Proveedor();
        provedor.setCodigo("002");
        provedor.setNombre("ZeroTwo");
        Proveedor provedor2=new Proveedor("016","Hiro");
        
        provedor.registrarCompra(1,articulo1,5);
        provedor2.registrarCompra(2,articulo2,3);
        
        System.out.println("\nLista de articulos: ");
        System.out.println(provedor.mostrarProductos());
        System.out.println(provedor2.mostrarProductos()+"\n");
        
         provedor.registrarDevolucion(1, articulo2, 1);
         System.out.println("\nDatos de Provedor y articulo devuelto:");
         System.out.println(articulo2.toString());
         System.out.println(provedor.toString());
        // TODO code application logic here
    }
    
}
