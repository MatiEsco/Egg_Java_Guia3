/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Teoria_Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        
        for(int i = 1; i < 5; i++){
            
                System.out.print("Numero" + i+": ");
                num1 = leer.nextInt();
                if (num1 > 0 && num1 <=20){
                    imprimir(num1);
                    System.out.println();
                    continue;
                }else{
                    do{
                        System.out.print("Ingrese nuevamente Numero" +i+": ");
                        num1 = leer.nextInt();
                    }while(num1<0 || num1 > 20);
                    imprimir(num1);
                    System.out.println();
                }
            
            
        }
        
       
        
    }
    public static void imprimir( int num){
        System.out.print(num);
        for (int i = 0; i< num ; i++){
            System.out.print("*");
        }
    }
}
