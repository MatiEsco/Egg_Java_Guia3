/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();
        double sumaTotal=0;
        double prom; 
        int cont=0;
        
        for(int i=0; i<n;i++){
            System.out.println("Estatura persona " + (i+1));
            double estatura = leer.nextDouble();
            sumaTotal += estatura;
            
            if(estatura < 1.60){
                cont=cont+1;
            }
            
        }
        prom=sumaTotal/n;
        System.out.println("Personas con Estatura por Debajo de 1.60: "+cont);
        System.out.print("Promedio de estatura General: ");
        System.out.printf("%.2f",prom);
    }
    
}
