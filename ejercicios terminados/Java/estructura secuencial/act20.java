/*Programa: act20.java
 * 
 *Propósito: Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Necesitamos saber la cantidad de monedas que tenemos de 10 cent, 20 cent, 50 cent, 1 eur y 2 eur
 * Calculamos el total en eurps y los mostramos en pantalla
 *
 *Diseño:
 * 1. Leer 10c, 20c , 50c, 1e, 2e
 * 2. Calculamos el total de euros
 * 3. Calculamos el total de centimos
 * 4. pasamos los centimos a euro
 * 5. Mostramos el dinero final
 * Variables
*/

import java.util.Scanner;

public class act20 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cacula el total de dinero");
    System.out.println("-------------------------");
    
    int c10;
    int c20;
    int c50;
    int e1;
    int e2;
    int eTotal;
    int cTotal;

    System.out.print("Monedas de 2 euros: ");
    e2 = s.nextInt();
    System.out.print("Monedas de 1 euro: ");
    e1 = s.nextInt();
    System.out.print("Monedas de 50 céntimos: ");
    c50 = s.nextInt();
    System.out.print("Monedas de 20 céntimos: ");
    c20 = s.nextInt();
    System.out.print("Monedas de 10 céntimos: ");
    c10 = s.nextInt();

    eTotal = e2*2+e1;
    cTotal = c50*50+c20*20+c10*10;
    eTotal = eTotal+(cTotal/100);
    cTotal = cTotal%100;

    System.out.println("El dinero total es: "+eTotal+" euros y "+cTotal+" céntimos.");
  }
}
