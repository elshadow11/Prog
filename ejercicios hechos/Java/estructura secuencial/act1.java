/*Programa: act1.java
Propósito: Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
Autor: Jose Manuel Serrano Palomo.
Fecha: 06/11/2019

 Análisis:
 Debemos pedir al usuario que introduzca el nombre
 Luego lo escribimos por pantalla dando un saludo

 Diseño:
 1. Leemos el nombre que introduce le usuario
 2. Lo mostramos por pantalla
 
*/
 import java.util.Scanner;

public class act1 {
  public static void main(String args[]) {
        System.out.println("Da tu nombre y se muestra por pantalla");
        System.out.println("--------------------------------------------");
    Scanner s = new Scanner(System.in);
    // definimos la variable name
    String name;
    // pedimos los valores
    System.out.print("Dime tu nombre: ");
    name = s.nextLine();
    // mostramos por pantalla
    System.out.println("Hola "+name);
  }


}
