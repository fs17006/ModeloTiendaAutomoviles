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
public class Prueba {
    
    public static void main(String[] args){
        //crear 2 objetos del tipo Automovil con sus datos
        //En el diagrama solo aparece nombre en el contructor por eso usare setCantidadDispobile
        Automovil a1=new Automovil("Honda");
        a1.setCantidadDisponible(8);
        Automovil a2=new Automovil("Toyota");
        a2.setCantidadDisponible(4);
        
         //vendedores
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo("001");
        vendedor.setNombre("Fernando Flores");
        Vendedor vendedor1 = new Vendedor("010", "Diego Armando");
        
        //ventas para cada vendedor
        vendedor.registrarVenta(1, a1, 5);
        vendedor1.registrarVenta(2, a2, 2);
        
        //impresion de ventas
        System.out.println("---------------------");
        System.out.println(vendedor.mostrarAuto());
        System.out.println(vendedor1.mostrarAuto()+"\n");
        
         //registrando devolucion de auto
        vendedor1.registrarDevolucion(1, a1, 1);
        
        //datos del automovil devuelto
        System.out.println(a1.toString());
        
        //datos vendedor
        System.out.println(vendedor1.toString());
        
    }
    
}
