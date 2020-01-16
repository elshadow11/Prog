/*Programa: act14.java
 * 
 *Propósito: Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Pedimos un numero de dos cifras y necesitamos invertirlo
 * para ello idearemos un sistema por el cual lo separaremos en decenas y unidades
 * tras la conversion podemos invertirlo y mostrarlo
 * 
 *Diseño:
 * 1. Leemos n1
 * 2. Calculamos las dec y las uni
 * 3. Mostramos el resultado de invertirlo
*/

import java.util.Scanner;

public class act14 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Invierte un numero de 2 cifras");
    System.out.println("------------------------------");
    
    int n1;
    int dec;
    int uni;
    
    System.out.print("Introduce un número de dos cifras: ");
    n1 = s.nextInt();

    dec = n1/10;
    uni = n1%10;

    System.out.println("El resultado de la inversion es: "+(10*uni+dec));
  }
}
