/*
 Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;
        System.out.print("Ingrese un valor limite: ");
       
        do{
            limite = leer.nextInt();
            if(limite <0){
            System.out.println("Recuerde que debe ser Positivo!");
            }
        }while(limite<=0);
        
        int num;
        int suma = 0;
        
        while(suma < limite){
            System.out.print("Ingrese un numero: ");
             num = leer.nextInt();
             
             suma += num;
            
             
             
             if (suma > limite){
                 break;
             }
        }
        System.out.println("La suma total es: " + suma);
    }
    
}
