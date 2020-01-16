/*Programa: act19.java
 * 
 *Propósito: Escribir un algoritmo para calcular la nota final de un estudiante, considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Neceistamos el numero de respuestas correctas, incorrectas y en blanco de un alumno y debemos puntuarle
 *
 *Diseño:
 * 1. Leer corre e incorre
 * 2. Calcular nota <-- corre * 5 + incorre * -1
 * 3. Mostramos por pantalla
 * Variables: 
*/

import java.util.Scanner;

public class act19 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calcula la nota de un test");
    System.out.println("--------------------------");
    
    int corre;
    int incorre;
    int nota;

    System.out.print("Introduce la cantidad de respuestas correctas: ");
    corre = s.nextInt();
    System.out.print("Introduce la cantidad de respuestas incorrectas: ");
    incorre = s.nextInt();

    nota = corre*5+incorre*(-1);
    System.out.println("La nota es: "+nota);
  }
}
