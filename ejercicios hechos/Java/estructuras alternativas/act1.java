/*Programa: act1.java
 * 
 *Propósito: Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 08/11/2019
 *
 *Análisis:
 * Debemos pedir un número al usuario y tenemos que comprobar si es par o impar
 *
 *Diseño:
 * 1. Leer el número
 * 2. Si el resto de n/2 es igual a 0 el numero es par
 * 3. sino es impar
 * Variables: n sera el numero que introduzca el usuario
*/
import java.util.Scanner;
public class act1 {
    public static void main(String[] args) {
        System.out.println("Programa para comprobar si es par o impar");
        System.out.println("-----------------------------------------");
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número: ");
        n = s.nextInt();
        if (n%2==0) {
        System.out.println("Es Par");
        }   else {
        System.out.println("Es impar");
        }
    }
}
