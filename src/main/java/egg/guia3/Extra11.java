/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */
package egg.guia3;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author MatiPC
 */
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont=0;
        double num;
      
        
        System.out.print("Ingrese un numero: ");
        num = leer.nextDouble();
        
        while(num > 0){
           
            cont++;
            num = Math.floor(num/10);
        }
        System.out.println("El numero ingresado tiene " + cont+ " digitos.");
        
    }
    
}