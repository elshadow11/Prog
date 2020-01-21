/*Programa: act13.java
 * 
 *Propósito: Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿cómo se puede calcular?
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * nos piden las raiz cuadradra de cubica de un numero
 * debemos calcularlas y mostrarlas
 * 
 *Diseño:
 * 1. Leemos n1
 * 2. Calculamos la raiz cuadrada
 * 3. Calculamos la raiz cubica mediante una potencia de exponente 1/3
 * 4. Mostramos resultados
*/

import java.util.Scanner;

public class act13 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa para calcular raiz cuadrada y cúbica");
    System.out.println("---------------------------------------------");
    int n1;

    System.out.print("Introduce un número: ");
    n1 = s.nextInt();

    System.out.println("La raíz cuadrada es: "+Math.sqrt(n1));
    System.out.println("La raíz cúbica es: "+Math.pow(n1,(double)1/3));
  }


}
