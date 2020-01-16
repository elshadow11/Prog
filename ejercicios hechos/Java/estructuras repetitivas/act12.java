/*Programa: act12.java
 * 
 *Prop�sito: Pide una cadena y dos caracteres por teclado (valida que sea 
 * un car�cter), sustituye la aparici�n del primer car�cter en la cadena 
 * por el segundo car�cter.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *An�lisis:
 *
 *Dise�o:
*/

import java.util.Scanner;
public class act12 {
    public static void main(String[] args) {
        System.out.println("Programa que sustituye caracteres");
        System.out.println("---------------------------------");
         Scanner s = new Scanner(System.in);
        String cadena;
        String caracterABuscar;
        String caracterParaSustituir;
        String cadenaNueva = "";

        System.out.print("Introduce una cadena: ");
        cadena = s.nextLine();
        do {
          System.out.print("Introduce un car�cter a buscar: ");
          caracterABuscar = s.nextLine();
        } while (caracterABuscar.length()!=1);
        do {
          System.out.print("Introduce un car�cter para sustituir: ");
          caracterParaSustituir = s.nextLine();
        } while (caracterParaSustituir.length()!=1);

        for (int posicion=0; posicion<=cadena.length()-1; posicion++) {
          if (cadena.charAt(posicion)==caracterABuscar.charAt(0)) {
            cadenaNueva += caracterParaSustituir;
          } else {
            cadenaNueva = cadenaNueva.concat(cadena.substring(posicion,posicion+1));
          }
        }
        System.out.println("La cadena modificada es "+cadenaNueva);
    }
}
