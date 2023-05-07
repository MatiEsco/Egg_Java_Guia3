/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre 
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje 
de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.


 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num1,num2;
        System.out.println("Ingrese dos numeros enteros positivos: ");
        do{
            System.out.print("Primer numero: ");
            num1 = leer.nextInt();
            if (num1 <0){
                System.out.println("El numero debe ser Positivo!");
            }
        }while(num1 < 0);
        do{
            System.out.print("Segundo numero: ");
            num2 = leer.nextInt();
            if (num2 <=0){
                System.out.println("El numero debe ser Positivo!");
            }
        }while(num2 <= 0);
        
        int op;
        System.out.println();
       do{
           System.out.println("*** MENU ***");
           System.out.println("1. Sumar ");
           System.out.println("2. Restar ");
           System.out.println("3. Multiplicar ");
           System.out.println("4. Dividir ");
           System.out.println("5. Salir ");
           System.out.println();
           System.out.print("Elija una opcion: ");
           op = leer.nextInt(); 
           
           if (op == 5){
               System.out.println("Esta seguro que desea salir? (S/N)");
               String salir = leer.next();
               
               if(salir.substring(0, 1).equals("S")){
                   op = 5;
               }else{
                   op = 0;
               }
           }
           System.out.println();
           
           switch (op){
               case 1: System.out.println("La suma es: "+ (num1 + num2));
                        System.out.println();
               break;
               case 2: System.out.println("La resta es: "+ (num1 - num2));
                        System.out.println();
               break;
               case 3: System.out.println("La multiplicacion es: "+ (num1*num2));
                        System.out.println();
               break;
               case 4: System.out.println("La division es: "+ (num1/num2));
                        System.out.println();
               break;
              // default: System.out.println("Ingrese una opcion Valida!");
                  // System.out.println();
           }
           
       }while(op!=5);
       
       
        
      
    }
    
}
