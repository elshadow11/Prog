/**Programa: act1.java
 * 
 *Propósito: Crea una aplicación que permita adivinar un número. La aplicación
 *  genera un número aleatorio del 1 al 100. A continuación va pidiendo números
 *  y va respondiendo si el número a adivinar es mayor o menor que el introducido
 * ,a demás de los intentos que te quedan (tienes 10 intentos para acertarlo).
 *  El programa termina cuando se acierta el número (además te dice en cuantos 
 * intentos lo has acertado), si se llega al limite de intentos te muestra el 
 * número que había generado.
 * 
 *@author Jose Manuel Serrano Palomo
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 * Necesitamos crear un programa que nos pregunte por un numero aleatorio
 * 
 *Diseño:
 * 1. Leemos num_ingresado
 * 2. mientras el numero ingresado no sea igula al numero secreto y los intentos
 * sean mayores a 1 comprobamos
 * 3. si el numero secreto es mayor al ingresado escribe "muy bajo"
 * 4. si el numero secreto es menor al ingresado escribe "muy alto"
 * 5. volvemos a pedir num_ingresado y mostramos los intentos restantes
 * 6. si los numeros son iguales muestra mensaje de felicitacion
 * 7. Sino muestra el numero secreto
*/
import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        System.out.println("Programa que permite adivinar un numero");
        System.out.println("---------------------------------------");
        Scanner s = new Scanner(System.in);
        int intentos = 10;
        int num_ingresado;
        int num_secreto = (int) (Math.random()*100 + 1);

        System.out.print("Adivine el número (de 1 a 100): ");
        num_ingresado = s.nextInt();

        while (num_secreto!=num_ingresado && intentos>1) {
          if (num_secreto>num_ingresado) {
            System.out.println("Muy bajo");
          } else {
            System.out.println("Muy alto");
          }
          intentos = intentos-1;
          System.out.println("Le quedan "+intentos+" intentos:");
          System.out.print("Deme otro número (de 1 a 100): ");
          num_ingresado = s.nextInt();
        }

        if (num_secreto==num_ingresado) {
          System.out.println("Exacto! Usted adivino en "+(11-intentos)+" intentos.");
        } else {
          System.out.println("El numero era: "+num_secreto);
        }
    }
}
