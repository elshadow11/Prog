/*Programa: act12.java
 *Propósito: Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.
 *Autor: Jose Manuel Serrano Palomo.
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Pedimos al usuario que nos de dos puntos y calculamos mediante una formula la distancia entre ellos
 *
 *Diseño:
 * Leer x1, y1, x2, y2
 * Calcular d <-- Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2))
 * Mostramos el resultado por pantalla
 * Variables: x1 y1 son el primer punto x2 y2 son el segundo punto, d es la distancia entre ellos
*/

import java.util.Scanner;

public class act12 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calcula la distancia entre dos puntos");
    System.out.println("-------------------------------------");
    
    double d;
    
    int x1;
    int x2;
    int y1;
    int y2;

    System.out.println("Dime las coordenadas del primer punto:");
    x1 = s.nextInt();
    y1 = s.nextInt();
    
    System.out.println("Dime las coordenadas del segundo punto:");
    x2 = s.nextInt();
    y2 = s.nextInt();
    
    d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    System.out.println("Distancia: "+d);
  }


}
