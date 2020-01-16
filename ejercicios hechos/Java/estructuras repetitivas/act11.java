/*Programa: act11.java
 * 
 *Propósito: Suponiendo que hemos introducido una cadena por teclado que 
 * representa una frase (palabras separadas por espacios), realiza un programa 
 * que cuente cuantas palabras tiene.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 *
 *Diseño:
*/
import java.util.Scanner;
public class act11 {
    public static void main(String[] args) {
        System.out.println("Programa que representa una frase");
        System.out.println("---------------------------------");
         Scanner s = new Scanner(System.in);
        String cadena;
        int posicion = 0;
        int contadorPalabras = 0;

        System.out.print("Introduce una cadena: ");
        cadena = s.nextLine();

        while (cadena.charAt(posicion)==' ') {
          posicion++;
        }
        for (; posicion<=cadena.length()-1; posicion++) {
          if (cadena.charAt(posicion)==' ') {
            contadorPalabras++;
            while (posicion<=cadena.length()-1 && cadena.charAt(posicion)==' ') {
              posicion++;
            }
          }
        }
        if (cadena.charAt(cadena.length()-1)!=' ') {
          contadorPalabras++;
        }
        System.out.println("La frase tiene "+contadorPalabras+" palabras.");
    }
}
