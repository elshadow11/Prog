/*Programa: act11.java
 * 
 *Propósito: Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Tras pedir dos numeros calculamos el valor absoluto de la resta entre ambos
 * 
 *Diseño:
 * 1. Leemos n1 y n2
 * 2. Calculamos el valor absoluto de la diferencia
 * Variables: n1 y n2
*/

import java.util.Scanner;

public class act11 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa para calcular la distancia entre ellos");
    System.out.println("-----------------------------------------------");
    int n1;
    int n2;

    System.out.print("Dime el primer número: ");
    n1 = s.nextInt();
    System.out.print("Dime el segundo número: ");
    n2 = s.nextInt();

    System.out.println("La distancia es: "+Math.abs(n1-n2));
  }
}
