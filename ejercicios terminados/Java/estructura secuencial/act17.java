/*Programa: act17.java
 * 
 *Propósito: Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine la hora de llegada a la ciudad B.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Debemos pedir una hora de salida y el tiempo que tarda en alcanzar el destino
 * Tras calcular la hora de llegada lo mostramos
 *
 *Diseño:
 * 1. Leer horaSalida y t
 * 2. Pasamos la horaSalida a segundos
 * 3. Calculamos los segundos totales y pasamos a horas, minutos y segundos
 * 4. Mostramos la hora de llegada
 * Variables: horaSalida, minSalida y segSalida son las variables del tiempo de salida, t es el tiempo en segundos que tarda,
 * horaLLegada, minLLegada y segLLegada son las variables del timepo de llegada y tFinal son los segundos finales y tTotal son los segundos totales antes de sumarles t.
*/

import java.util.Scanner;

public class act17 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calcula la hora de llegada a un sitio");
    System.out.println("-------------------------------------");
    
    
    int segSalida;
    int horaSalida;
    int minSalida;
    int horaLLegada;
    int minLLegada;
    int segLLegada;
    int t;    
    int tFinal;
    int tTotal;

    System.out.print("Introduce la hora de salida: ");
    horaSalida = s.nextInt();
    System.out.print("Introduce los minutos de salida: ");
    minSalida = s.nextInt();
    System.out.print("Introduce los segundos de salida: ");
    segSalida = s.nextInt();
    System.out.print("Introduce el tiempo que ha tardado en segundos: ");
    t = s.nextInt();

    tTotal = horaSalida*3600+minSalida*60+segSalida;
    tFinal = tTotal+t;
    horaLLegada = tFinal/3600;
    minLLegada = (tFinal%3600)/60;
    segLLegada = (tFinal%3600)%60;

    System.out.print("Hora de llegada ");
    System.out.println(horaLLegada+":"+minLLegada+":"+segLLegada);
  }
}
