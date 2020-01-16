/*Programa: act15.java
 * 
 *Propósito: Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Se piden dos variables a y b e intentaremos intercambiar el valor de esas variables
 * para ello guardaremos el valor de una de ella en una variable de apoyo
 * 
 *Diseño:
 * 1. Leer a y b
 * Intercambio de variables
 * Mostramos a y b por pantalla
 * Variables: a y b son los valores a intercambiar, var es la variable de apoyo
*/
import java.util.Scanner;

public class act15 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que intercambia el valor de dos variables");
    System.out.println("--------------------------------------------------");
    
    int a;
    int b;
    int var;

    System.out.print("Introduce valor de a: ");
    a = s.nextInt();
    System.out.print("Introduce valor de b: ");
    b = s.nextInt();

    var = a;
    a = b;
    b = var;

    System.out.println("Ahora a vale: "+a);
    System.out.println("Ahora b vale: "+b);
  }
}

