/*Programa: act3.java
 * 
 *Prop�sito: Escribe un programa que lea un n�mero e indique si es par o impar.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Pedimos un numero al usuario y comprobamos si es par o impar
 *
 *Dise�o:
 * 1. Leer el n�mero
 * 2. Si el resto de dividir el n�mero entre 2 es 0 el numero es par
 * 3. Sino es impar
 * Variables: n1
*/
import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        System.out.println("Comprobas si el n�mero es par o impar");
        System.out.println("--------------------------------------------------");
        Scanner s = new Scanner(System.in);
        
        int n1;
        System.out.print("Dime el n�mero: ");
        n1 = s.nextInt();
        if (num%2==0) {
        System.out.println("Es Par");
        } else {
        System.out.println("Es impar");
        }
    }
}
