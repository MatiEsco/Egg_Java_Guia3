/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.A continuación,
realizar las instrucciones necesarias para que: 
B tome el valor de C, 
C tome el valor de A, 
A tome el valor de D 
y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;
        
        aux = B;
        B = C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("Valores Originales: ");
        System.out.println("A: "+1);
        System.out.println("B: "+2);
        System.out.println("C: "+3);
        System.out.println("D: "+4);
        
        System.out.println("Valores Cambiados");
        
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        
        
        
        
        
        
        
    }
    
}
