/*Programa: act10.java
 * 
 *Propósito: Pide una cadena y un carácter por teclado y muestra cuantas 
 * veces aparece el carácter en la cadena.
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
public class act10 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra la cantidad de veces que aparece un caracter");
        System.out.println("-----------------------------------------------------------------");
        Scanner s = new Scanner(System.in);
        String cadena;
        String caracter;
        int cont = 0;
        int posicion;

        // Leemos datos
        System.out.print("Introduce una cadena: ");
        cadena = s.nextLine();
        do {
          System.out.print("Introduce un carácter: ");
          caracter = s.nextLine();
        } while (caracter.length()!=1);

        // Proceso
        for (posicion=0; posicion<=cadena.length()-1; posicion++) {
          if (cadena.substring(posicion,posicion+1).equals(caracter)) {
            cont++;
          }
        }
        System.out.println("En la cadena \""+cadena+"\" aparece "+cont+" veces el carácter '"+caracter+"'.");
    }
}
