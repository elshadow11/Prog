/*Programa: act12.java
 * 
 *Prop�sito: Escribir un programa que lea un a�o indicar si es bisiesto. Nota: un a�o es bisiesto si es un n�mero divisible por 4, pero no si es divisible por 100, excepto que tambi�n sea divisible por 400.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Debemos pedir un a�o y comprobar si es bisiesto
 *
 *Dise�o:
 * 1. Leer year
 * 2. Si es divisible por 4, pero no por 100 a no ser que sea por 400 mostrar "a�o bisiesto"
 * 3. En caso contrario mostrar "a�o �no bisiesto"
 * Variables: year
*/
import java.util.Scanner; 
public class act12 {
    public static void main(String[] args) {
        System.out.println("Programa para comprobar si el a�o es bisiesto");
        System.out.println("---------------------------------------------");
        Scanner s = new Scanner(System.in);
        int year;

        System.out.print("Introduce el a�o: ");
        year = s.nextInt();

        if ((year%4==0 && !(year%100==0)) || year%400==0) {
        System.out.println("A�o bisiesto.");
        } else {
        System.out.println("A�o no bisiesto.");
        }
    }
}
