/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package egg.guia3;
import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int minutos, horas, dias,horasRestantes;
       
        System.out.println("Ingrese la cantidad de minutos para convertir: ");
        minutos = leer.nextInt();
        
        horas = minutos /60;
        dias = horas /24;
        horasRestantes = horas % 24;
       
        System.out.println("Equivale a " + dias + " Dia/s y "+horasRestantes+" hora/s.");
       
    }
    
}
