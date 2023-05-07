/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
para averiguar la media de edad de los hijos de todas las familias.
 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int cont,m,mediaPorFamilia,edad,acumulador,acumuladorTotal;
        System.out.print("Cantidad de familias: ");
        int n = leer.nextInt();
        System.out.println();
        cont =0;
        acumuladorTotal=0;
        for(int i=0; i<n; i++){
            System.out.print("Cantidad de hijos de la familia N°" + (i+1)+": " );
             m = leer.nextInt();
            acumulador = 0;
            for(int j=0; j<m; j++){
                System.out.print("Edad del hijo N°"+ (j+1)+": ");
                edad = leer.nextInt();
                acumulador += edad;
                cont++;
            }
            mediaPorFamilia = (acumulador/m);
            System.out.println("Media de edad de los hijos de la Familia N°" + (i+1) + ": " + mediaPorFamilia);
            acumuladorTotal += acumulador;
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Media de edad de los hijos de las familias en Total: " + (acumuladorTotal/cont));
    }
   
    
}
