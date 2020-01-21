/*Programa: act6.java
 * 
 *Propósito: Escribe un programa que dados dos números, uno real (base) y 
 * un entero positivo (exponente), saque por pantalla el resultado de la 
 * potencia. No se puede utilizar el operador de potencia.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 * Leemos la base y exponente de dos numeros y debemos realizar la potencia
 *
 *Diseño:
 * 1. Inicializo el acumulador para multiplicación -> potencia <- 1
 * 2. Leer base
  * 3. Repetir -> Leer exponente -> hasta que exponente sea positivo
  * 4. Desde 1 hasta el exponente
  * 5. Acumulo la multiplicación de la base -> potencia<-potencia*base
  * 6. Muestro potencia
*/
import java.util.Scanner;
public class act6 {
    public static void main(String[] args) {
        System.out.println("Programa que calcule la potencia");
        System.out.println("--------------------------------");
        Scanner s = new Scanner(System.in);
        double base;
        int exponente;
        double potencia;

        System.out.print("Dame la base de la potencia: ");
        base = s.nextDouble();
        do {
          System.out.print("Dame el exponente de la potencia: ");
          exponente = s.nextInt();
          if (exponente<0) {
            System.out.println("ERROR: El exponente debe ser positivo");
          }
        } while (exponente<0);

        potencia = 1;
        for (int i=1;i<=exponente;i++) {
          potencia *= base;
        }
        System.out.println("Potencia: "+potencia);
      }
    }
}
