/*
Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad 
de números leídos, la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse.
Nota: recordar el uso de la sentencia break.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,contPar,contImpar,cont;
        
        contPar=0;
        contImpar=0;
        cont=0;
        do{
            System.out.print("Ingresar numero: ");
            n=leer.nextInt();
            
            if(n >= 0){
                cont++;
            }
            
            if(n % 5 == 0){
                contImpar++;
                break;
            }else if(n<0){
                continue;
            }

            if(n % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
            
        }while(n%5!=0);
        
        System.out.println("Cantidad de numeros leidos: "+ cont);
        System.out.println("Cantidad de numeros Pares: " + contPar);
        System.out.println("Cantidad de numeros Impares: "+ contImpar);
  
    }
    
}
