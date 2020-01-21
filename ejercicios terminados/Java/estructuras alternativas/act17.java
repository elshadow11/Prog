/*Programa: act17.java
 * 
 *Prop�sito: Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado obtenido.
 * 
 * Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
 * Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: �ERROR: n�mero incorrecto.�.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Leemos la cara de un dado y debemos mostrar el opuesto en letras
 *
 *Dise�o:
 * 1. Leer n�mero de la cara
 * 2. Seg�n el valor introducido:
 * 3. Si es = 1 muestro "SEIS"
 * 4. Si es = 2 muestro "CINCO"
 * 5. Si es = 3 muestro "CUATO"
 * 6. Si es = 4 muestro "TRES"
 * 7. Si es = 5 muestro "DOS"
 * 8. Si es = 6 muestro "UNO"
 * 9. Si es otro n�mero, mostrar mensaje de error
*/
import java.util.Scanner;
 
public class act17 {
    public static void main(String[] args) {
        System.out.println("Programa para saber cara opuesta de un dado");
        System.out.println("-------------------------------------------");
        Scanner s = new Scanner(System.in);
        int cara;
        System.out.print("Introduce el n�mero de la cara: ");
        cara = s.nextInt();

        switch (cara) {
          case 1:
            System.out.println("SEIS");
            break;
          case 2:
            System.out.println("CINCO");
            break;
          case 3:
            System.out.println("CUATRO");
            break;
          case 4:
            System.out.println("TRES");
            break;
          case 5:
            System.out.println("DOS");
            break;
          case 6:
            System.out.println("UNO");
            break;
          default:
            System.out.println("Error: n�mero incorrecto.");
        }
    }
}
