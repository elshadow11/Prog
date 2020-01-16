/*Programa: act5.java
 *Prop�sito: Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
 *Autor: Jose Manuel Serrano Palomo.
 *Fecha: 07/11/2019
 *An�lisis:
 * Debemos leer unos grados que est�n en Farenheit y pasarlos a Celsius
 * 
 *Dise�o:
 * 1. Leemos la temperatura que introduzca el usuario
 * 2. Calculamos la conversi�n de Fahrenheit a Celsius
 * 3. Mostramos el resultado en Celsius
 * Variables: F son los grados en Fahrenheit, C son los grados en celsius
*/

import java.util.Scanner;

public class act5 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calcula la conversi�n de Fahrenheit a Celsius");
    System.out.println("--------------------------------------------");
    double F;
    double C;

    System.out.print("Usuario introduce la temperatura de Fahrenheit: ");
    F = s.nextDouble();
    C = (F-32)*5/9;
    System.out.println("El resultado son "+C+" �C.");
  }


}
