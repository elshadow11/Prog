/*Programa: act6.java
 *Propósito: Calcular la media de tres números pedidos por teclado.
 *Autor: Jose Manuel Serrano Palomo.
 *Fecha: /11/2019
 *
 *Análisis:
 * En este ejercicio debemos pedir al usuario tres numeros por teclado
 * Tras obtenerlos realizamos la media y lo mostramos por pantalla
 * 
 *Diseño:
 * Leemos n1,n2 y n3
 * Calculamos (n1 + n2 + n3)/3
 * Escribimos la media por pantalla
 * Variables: n1, n2 y ,3 son los numeros que introduce el usuario. media es el resultado de la media de los 3 numeros
*/

import java.util.Scanner;

public class act6 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calculo de la media de 3 números");
    System.out.println("--------------------------------");
    double n1;
    double n2;
    double n3;
    double media;
    
    System.out.print("Introduce el primer número: ");
    n1 = s.nextDouble();
    System.out.print("Introduce el segundo número: ");
    n2 = s.nextDouble();
    System.out.print("Introduce el tercer número: ");
    n3 = s.nextDouble();

    media = (n1+n2+n3)/3;
    System.out.println("La media es "+media);
  }


}
