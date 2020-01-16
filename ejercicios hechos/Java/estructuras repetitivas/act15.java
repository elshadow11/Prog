/*Programa: act15.java
 * 
 *Propósito: Introducir una cadena de caracteres e indicar si es un palíndromo.
 * Una palabra palíndroma es aquella que se lee igual adelante que atrás.
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
public class act15 {
    public static void main(String[] args) {

        System.out.println("Programa que indica si la cadena es palindromo");
        System.out.println("----------------------------------------------");
                
        final String VOCALES_CON_TILDE = "ÁÉÍÓÚ";
        final String VOCALES_SIN_TILDE = "AEIOU";
        Scanner s = new Scanner(System.in);
        String cadena;        
        String cadena1 = "";  
        String cadena2 = "";  
        
        System.out.print("Introduce una cadena para comprobar si es palíndroma: ");
        cadena = s.nextLine();
        
        cadena1 = cadena.toUpperCase(); 
        for (int i=0; i<VOCALES_CON_TILDE.length(); i++) {  
          cadena1 = cadena1.replace(VOCALES_CON_TILDE.charAt(i),VOCALES_SIN_TILDE.charAt(i));
        }
        cadena1 = cadena1.replace(" ","");

        for (int i=cadena1.length()-1; i>=0; i--) {
          cadena2 += cadena1.substring(i,i+1);
        }

        if (cadena1.equals(cadena2)) {
          System.out.println("Es un palíndromo");
        } else {
          System.out.println("No es un palíndromo");
        }
    }
}
