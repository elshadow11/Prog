/*Programa: act7.java
 *Propósito: Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.
 *Autor: Jose Manuel Serrano Palomo.
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Debemos calcular a que equivale en horas y minutos, unos minutos introducidos por pantalla
 * 
 *Diseño:
 * Leemos min
 * Calculamos horas <-- min/60
 * Calculamos minsRes <-- min%60
 * Mostramos por pantalla
 * Variables: min son los minutos introducidos por el usuario. horas son el resultado en horas de los minutos y minRes es el resultado restante de los minutos
*/

import java.util.Scanner;

public class act7 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calculo de horas y minutos");
    System.out.println("--------------------------");
    int min;
    int horas;
    int minRes;

    System.out.println("Dime cuantos minutos son:");
    min = s.nextInt();

    horas = min/60;
    minRes = min%60;
    System.out.println("El resultado son "+horas+" horas y "+minRes+" minutos.");
  }


}
