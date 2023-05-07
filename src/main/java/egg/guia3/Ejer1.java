/*
Crear un programa que dado un número determine si es par o impar.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es Par o Impar: ");
        int num = leer.nextInt();
        
        if(num%2 ==0){
            System.out.println("El numero es Par!");
        }else{
            System.out.println("El numero es Impar");
        }
        
    }
    
}
