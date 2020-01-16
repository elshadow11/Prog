/*Programa: act16.java
 * 
 *Propósito: Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Tenemos dos vehiculos de los que queremos conocer la velocidad y distancia entre ellos
 * Debemos calcular cuanto tarda el segundo en alcanzar al primero
 *
 *Diseño:
 * 1. Leer v1, v2 y d
 * 2. Calculamos el tiempo y lo pasamos a minutos
 * 3. Mostramos el tiempo por pantalla
*/

import java.util.Scanner;

public class act16 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cuanto tarde el segundo en alcanzar al primero");
    System.out.println("----------------------------------------------");
    
    double d;
    double v1;
    double v2;
    double t;

    System.out.print("Introduce la velocidad del primer coche: ");
    v1 = s.nextDouble();
    System.out.print("Introduce la velocidad del segundo coche: ");
    v2 = s.nextDouble();
    System.out.print("Introduce la distancia entre los coches: ");
    d = s.nextDouble();

    t = d/(v1-v2);
    t = t*60;

    System.out.println("El segundo alcanza al primero tras "+t+" minutos.");
  }
}
