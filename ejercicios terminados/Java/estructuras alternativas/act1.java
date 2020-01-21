/*Programa: act1.java
 * 
 *Prop�sito: Algoritmo que pida dos n�meros e indique si el primero es mayor que el segundo o no.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 08/11/2019
 *
 *An�lisis:
 * Debemos pedir un n�mero al usuario y tenemos que comprobar si es par o impar
 *
 *Dise�o:
 * 1. Leer el n�mero
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
        System.out.print("Introduce un n�mero: ");
        n = s.nextInt();
        if (n%2==0) {
        System.out.println("Es Par");
        }   else {
        System.out.println("Es impar");
        }
    }
}
