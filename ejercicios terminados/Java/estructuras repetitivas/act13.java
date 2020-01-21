/*Programa: act13.java
 * 
 *Propósito: Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
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
public class act13 {
    public static void main(String[] args) {
        System.out.println("Programa qye sustituye mayusculas por minusculas y a la inversa");
        System.out.println("---------------------------------------------------------------");
        Scanner s = new Scanner(System.in);
        String cadena;
        String cadenaNueva = "";

        System.out.print("Introduce una cadena: ");
        cadena = s.nextLine();

        for (int posicion=0; posicion<=cadena.length()-1; posicion++) {
          String letra = cadena.substring(posicion,posicion+1); 
          if (letra.equals(letra.toUpperCase())) {  
            cadenaNueva += letra.toLowerCase();
          }
          else {
            cadenaNueva += letra.toUpperCase();
          }
        }
        System.out.println("La cadena convertida es: "+cadenaNueva);
    }
}
