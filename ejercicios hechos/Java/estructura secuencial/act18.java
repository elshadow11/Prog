/*Programa: act18.java
 *Propósito: 
 *Autor: Jose Manuel Serrano Palomo.
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Debemos pedir el nombre completo de alguien y mostrar las iniciales leyendo el primer caracter de cada cadena
 * 
 *Diseño:
 * 1. Leemos el nombre y apellidos
 * 2. Conseguimos el primer caracter de cada cadena
 * 3. unimos los caracteres
 * 4. Mostramos las iniciales por pantalla
 * Variables: nombre ape1 y ape2 son el nombre completo, inicales es el resultado
*/

import java.util.Scanner;

public class act18 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Muestra las iniciales de un nombre completo");
    System.out.println("--------------------------------------------------");
    String nombre;
    String ape1;
    String ape2;
    String iniciales;


    System.out.print("Introduce tu nombre: ");
    nombre = s.nextLine();
    System.out.print("Dime tu primer apellido: ");
    ape1 = s.nextLine();
    System.out.print("Dime tu segundo apellido: ");
    ape2 = s.nextLine();

    iniciales = nombre.substring(0,1);
    iniciales = iniciales.concat(ape1.substring(0,1));
    iniciales = iniciales.concat(ape2.substring(0,1));
    iniciales = iniciales.toUpperCase();

    System.out.println("Tus iniciales son "+iniciales);
  }


}
