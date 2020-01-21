/*Programa: act14.java
 * 
 *Propósito: Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.
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
public class act14 {
    public static void main(String[] args) {
        System.out.println("Programa que realiza comprobacion de subcadena");
        System.out.println("----------------------------------------------act1");
        Scanner s = new Scanner(System.in);
        String cadena;
        String subcadena;
        boolean estaSubcadena = false;
        int numSubcadenas;

        System.out.print("Introduce una cadena: ");
        cadena = s.nextLine();
        System.out.print("Introduce una subcadena a buscar en la cadena anterior: ");
        subcadena = s.nextLine();

        numSubcadenas = cadena.length()-subcadena.length()+1;
        for (int nsubc=0; nsubc<=numSubcadenas-1 && !estaSubcadena; nsubc++) {
          if (cadena.substring(nsubc,nsubc+subcadena.length()).equals(subcadena)) {
            estaSubcadena = true;
          }
        }
        if (estaSubcadena) {
          System.out.println("La cadena contiene la subcadena.");
        } else {
          System.out.println("La cadena no contiene la subcadena.");
        }
    }
}
