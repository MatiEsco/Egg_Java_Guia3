/*
Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
package egg.guia3;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         int n1,n2,aux;
         int  cont;
         cont=0;
        
         do{
             System.out.println("Ingrese dos numeros mayores que 1..");
             do{
             System.out.print("N1: ");
             n1 = leer.nextInt();
             aux=n1;// uso un auxiliar para resguardar el valor de n1 para mostrarlo al final, ya que dentro del while lo voy modificando.
             }while(n1<=0);
             System.out.println();
             do{
             System.out.print("N2: ");
             n2=leer.nextInt();
             }while(n2<=0);
       }while(n1<=0 || n2 <=0);
         
         
         while(n1 >= n2){
             n1 = n1 - n2;
             cont++;
        }
         
         System.out.println(aux+ "/" + n2 + " = "+cont);
         System.out.println("Resto: " + n1);
         
         
         
         
         
         
    }
    
}
