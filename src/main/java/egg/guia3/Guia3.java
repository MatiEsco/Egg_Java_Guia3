/*
 * Implementar un programa que le pida dos números enteros al usuario 
y determine si ambos o alguno de ellos es mayor a 25.

 */

package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Guia3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1, num2;
       
        System.out.println("Ingrese dos numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos son mayores que 25!");
        }else if (num1 > 25 && num2 <= 25){
            System.out.println("Solo el primer numero es mayor que 25..");
        }else if (num2 > 25 && num1 <= 25){
            System.out.println("Solo el segundo numero es mayor a 25..");
        }else{
            System.out.println("Ninguno es mayor que 25..");
        }
        
       
    }
}
