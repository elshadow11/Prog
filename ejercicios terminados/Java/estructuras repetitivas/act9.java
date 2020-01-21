/*Programa: act9.java
 * 
 *Propósito: Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de números primos que queremos mostrar.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 * Tras leer un numero vamos comprobando si es divisible entre 2 hasta la raiz del numero
 * 
 *Diseño:
 * 1. Supongo que el número es primo -> esPrimo<-Verdadero
 * 2. Leer num_esPrimo
 * 3. Desde num = 2 hasta raíz(numero_es_rpimo)
 * 4. Si numeroEsPrimo es divisible entre num -> esPrimo<-Falso
 * 5. Si esPrimo -> Mostrar "Es primo"
 * 6. Si no -> Mostrar "No es primo"
*/
import java.util.Scanner;
public class act9 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra los primos");
        System.out.println("-------------------------------");
        Scanner s = new Scanner(System.in);
        boolean esPrimo = true;
        int numeroEsPrimo;

        System.out.print("Introduce un número para comprobar si es primo: ");
        numeroEsPrimo = s.nextInt();

        for (int num=2; num<=Math.sqrt(numeroEsPrimo) && esPrimo; num++) {
          if (numeroEsPrimo%num==0) {
            esPrimo = false;
          }
        }
        if (esPrimo) {
          System.out.println("Es Primo");
        } else {
          System.out.println("No es Primo");
        }
    }
}
