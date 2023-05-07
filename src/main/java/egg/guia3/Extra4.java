/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.

 */
package egg.guia3;

import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       String[] romanos = {"", "I","II","III","IV","V","VI","VII","VIII","IX","X"};
       
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        
        
        System.out.println("Su equivalente en romano es: " + romanos[num]);
    }
    
}
