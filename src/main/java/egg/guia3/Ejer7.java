/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232,
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java Substring(), Length(), equals().

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            String cadena;
            int cont=0;
            int incorrectos = 0;
            
            System.out.println("Cadenas de maximo 5 caracteres: ");
            cadena = leer.next();
            
            while(!cadena.equals("&&&&&")){
                if(cadena.equals("&&&&&")){
                    break;
                }
                
                if(cadena.length()>5){
                    System.out.println("La cadena no debe sobrepasar los 5 caracteres!");
                }else if(cadena.substring(0, 1).equals("X") && cadena.substring(cadena.length()-1, cadena.length()).equals("O")){
                    cont+=1;
                }else{
                    incorrectos+=1;
                }
               
                System.out.println("Cadenas de maximo 5 caracteres: ");
                cadena = leer.next();
            }//FinMientras
        
        System.out.println("Cantidad Correctos: " + cont);
        System.out.println("Cantidad de lecturas Incorrectas: "+incorrectos);
            
    }
    
}
