/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char tipo;
        double precio;
        
        System.out.print("Ingrese clase Socio (A,B,C): ");
        tipo = leer.next().charAt(0);
        tipo = Character.toUpperCase(tipo); //solo paso el caracter leido a mayuscula.
        
        System.out.print("Precio del tratamiento: ");
        precio = leer.nextDouble();
        
        
        switch(tipo){
            case 'A': System.out.println("Socio clase "+ tipo);
                        System.out.println("Total del tratamiento sin Descuento: $"+precio);
                        System.out.println("Total con Descuento: $"+ (precio-(precio*0.5)));
                        break;
            
            case 'B': System.out.println("Socio clase "+ tipo);
                        System.out.println("Total del tratamiento sin Descuento: $"+precio);
                        System.out.println("Total con Descuento: $"+ (precio-(precio*0.35)));
                        break;
                        
            case 'C': System.out.println("Socio clase "+ tipo);
                        System.out.println("Usted no posee Descuentos.");
                        System.out.println("Total del tratamiento: $"+precio);
                        
                        break;
            default: System.out.println("No corresponde con ninguna opcion.");
            break;
        }
        
        
    }
    
}
