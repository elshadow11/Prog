/*Programa: act3.java
 * 
 *Propósito: Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales
 *  y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce 
 * un espacio.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 * En este programa debemos comprobar que caracter es vocal o no
 * y lo mostramos por pantalla
 *
 *Diseño
 * 1. Repetir -> Leer carácter hasta que sea un sólo carácter
 * 2. Mientras no sea espacio
  * 3. Si car no es el espacio
  * 4. Si es A,E,I,O,U o a,e,i,o,u -> Mostrar "Es vocal"
  * 5.  Si no mostrar "No es vocal"
  * 6. Repetir -> Leer carácter hasta que sea un sólo carácter
*/
import java.util.Scanner;
public class act3 {
    public static void main(String[] args) {
        System.out.println("Programa para determinar si un caracter es vocal");
        System.out.println("------------------------------------------------");
        Scanner s = new Scanner(System.in);
        String car;

        do {
          System.out.print("Introduce un carácter: ");
          car = s.nextLine();
        } while (car.length()!=1);

        while (!car.equals(" ")) {
          if (car.toUpperCase().equals("A") || car.toUpperCase().equals("E") || car.toUpperCase().equals("I") || car.toUpperCase().equals("O") || car.toUpperCase().equals("U")) {
            System.out.println("VOCAL");
          } else {
            System.out.println("NO VOCAL");
          }
          do {
            System.out.print("Introduce un carácter: ");
            car = s.nextLine();
          } while (car.length()!=1);
        }
    }
}
