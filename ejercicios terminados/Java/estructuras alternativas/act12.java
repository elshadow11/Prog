/*Programa: act12.java
 * 
 *Propósito: Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *Análisis:
 * Debemos pedir un año y comprobar si es bisiesto
 *
 *Diseño:
 * 1. Leer year
 * 2. Si es divisible por 4, pero no por 100 a no ser que sea por 400 mostrar "año bisiesto"
 * 3. En caso contrario mostrar "año ñno bisiesto"
 * Variables: year
*/
import java.util.Scanner; 
public class act12 {
    public static void main(String[] args) {
        System.out.println("Programa para comprobar si el año es bisiesto");
        System.out.println("---------------------------------------------");
        Scanner s = new Scanner(System.in);
        int year;

        System.out.print("Introduce el año: ");
        year = s.nextInt();

        if ((year%4==0 && !(year%100==0)) || year%400==0) {
        System.out.println("Año bisiesto.");
        } else {
        System.out.println("Año no bisiesto.");
        }
    }
}
