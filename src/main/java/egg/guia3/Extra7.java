/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valorMin, valorMax,n,cont,entrada,suma;
        
        System.out.print("Cantidad de numeros a ingresar: ");
        n = leer.nextInt();
        cont = 1;
        suma=0;
        valorMin=9999999;
        valorMax=0;
        
        while(cont <= n){
            do{
            System.out.println("Ingrese numero "+ cont + ": ");
            entrada = leer.nextInt();
            }while(entrada<=0);
            
            suma += entrada;
            if(entrada>valorMax){
                valorMax = entrada;
            }else if(entrada < valorMin){
                valorMin = entrada;
            }
            
            
            cont++;
                      
            }
        
        System.out.println("El valor maximo ingresado es: " + valorMax);
        System.out.println("El valor minimo ingresado es: " + valorMin);
        System.out.println("El promedio es: " + (suma/n));
        
        
        
    }
    
}
