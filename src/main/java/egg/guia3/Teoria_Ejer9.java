/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Teoria_Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, suma;
        suma = 0;
        int n = 1;
        //for(int i = 1; i < 21; i++){
        do {  
        System.out.println("Num "+n+": ");
            num = leer.nextInt();
            
            if (num > 0){
                suma = suma + num;
            }else if(num == 0){
                System.out.println("Se capturó el numero cero.");
                break;
            }
            
            n++;
            
    }while (num < 20);
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
    
}
