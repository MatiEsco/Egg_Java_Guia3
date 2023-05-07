/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9,
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String I,J,K;
        
    for(int i=0; i<=9; i++){
        for(int j=0; j<=9; j++){
            for(int k=0; k<=9; k++){
                I = Integer.toString(i);
                J = Integer.toString(j);
                K = Integer.toString(k);
                
                if(i == 3){
                    I = "E";
                }
                if(j ==3){
                    J="E";
                }
                if(k==3){
                    K="E";
                }
                
                System.out.println(I+" - "+J+" - "+K);
                
            }//finK
            System.out.println();
        }//finJ
        System.out.println();
    }//finI
        System.out.println();
    }
    
}
