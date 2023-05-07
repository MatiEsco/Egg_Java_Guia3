/*
Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta.
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar 
su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

 */
package egg.guia3;

import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,aleatorio;
        boolean bandera = false;
        
        aleatorio = (int) (Math.random()*10);
        
        do{
            System.out.println("Se ha generado un numero aleatorio entre 0 y 10...");
            System.out.print("Ingrese un numero para ver si lo adivina!: ");
            num = leer.nextInt();
            System.out.println();
            
            if(num == aleatorio){
                System.out.println("Correcto!! El numero generado era " + aleatorio);
                bandera = true;
               // break;
            }else{
                System.out.println("Incorrecto!....Intente nuevamente..");
            }
            
        }while(bandera == false);
    }
    
}
