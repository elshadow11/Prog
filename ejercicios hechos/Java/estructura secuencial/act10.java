/*Programa: .act10java
 * 
 *Propósito: Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
 * 55% del promedio de sus tres calificaciones parciales.
 * 30% de la calificación del examen final.
 * 15% de la calificación de un trabajo final.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Necesitamos leer las notas y calcular usando los porcentajes, una vez lo hagamos
 * sumamos el total para obtener la nota
 * 
 *Diseño:
 * 1. Leemos las np1, np2 , np3, examenFinal y trabajoFinal
 * 2. A las notas parciales les aplicamos un 55%, al examen final 30% y al trabajo 15%
 * 3. Mostramos la suma por pantalla
 * Variables np1 np2 np3 examenFinal y trabajoFinal son las notas a calcular, notaFinal es el resultado
*/

import java.util.Scanner;

public class act10 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa para calcular la nota");
    System.out.println("------------------------------");
    double np1;
    double np2;
    double np3;
    double examenFinal;
    double trabajoFinal;
    double notaFinal;

    System.out.print("Dime la nota del primer parcial: ");
    np1 = s.nextDouble();
    System.out.print("Dime la nota del segundo parcial: ");
    np2 = s.nextDouble();
    System.out.print("Dime la nota del tercer parcial: ");
    np3 = s.nextDouble();
    System.out.print("Dime la nota del examen final: ");
    examenFinal = s.nextDouble();
    System.out.print("Dime la nota del trabajo final: ");
    trabajoFinal = s.nextDouble();

    notaFinal = ((np1+np2+np3)/3)*0.55+0.3*examenFinal+0.15*trabajoFinal;
    System.out.print("La nota final es: "+notaFinal);
  }


}
