
package simulacionaerolinea;

import java.util.concurrent.ThreadLocalRandom;

public class Prueba {
    
    public static void main(String[] args){
           for(int j=0;j<6000000;j++){
            int mayor=0,menor=0;
            ColaAtencion atencion=new ColaAtencion();
            System.out.println("--------");
            int numero = ThreadLocalRandom.current().nextInt(1, 10 + 1);
                try {
                Thread.sleep(numero);
                } catch (InterruptedException ex) {
                // aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
                }
                System.out.println("Llego el cliente numero:"+j);
                int atender = ThreadLocalRandom.current().nextInt(1, 2 + 1);
                
                if(atender==1){
                int asignarTiempo=ThreadLocalRandom.current().nextInt(1000, 10000 + 1);
                int guardar=0;
                guardar=guardar+asignarTiempo;
                menor=min(guardar);
                mayor=may(guardar);
                try {
                Thread.sleep(asignarTiempo);
                } catch (InterruptedException ex) {
                // aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
                }   
                System.out.println("\nEl Cliente sera atendido");
                Cliente cliente=new Cliente(j,asignarTiempo);
                atencion.encolar(cliente);
                System.out.println("La cola es:"+atencion.longitud());
                System.out.println("\nCliente atendido");
                atencion.desencolar();
                if(atencion.longitud()<=5){
                    System.out.println("\nLa cola es:"+atencion.longitud());
                    System.out.println("\ncola larga se atendera a los clientes.:");
                    for(int i=0;i<atencion.longitud();i++){
                        System.out.println("Cliente:"+atencion.cabecera());
                        atencion.desencolar();
                        
                    }
                }
               }else if(atender==2){
                  System.out.println("\nEl Cliente debe esperar para ser atendido");
                  Cliente cliente=new Cliente();
                  cliente.setLlegada(j);
                  atencion.encolar(cliente);
               }
                   System.out.println("Cola mas larga:"+mayor+"\ncola mas corta"+menor);
                
        }
         
    }
    
         public static int may(int x){
           int auxMayor=0;
            if(x>auxMayor){
                auxMayor=x;
            }
           return auxMayor; 
        }
       
        
        public static int min(int x){
            int auxMenor=10000;
            if(x<auxMenor){
                auxMenor=x;
            }
            return auxMenor;
        }
}