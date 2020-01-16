/*Programa: act5.java
 * 
 *Propósito: Escribe un programa que pida el limite inferior y superior de 
 * un intervalo. Si el límite inferior es mayor que el superior lo tiene que 
 * volver a pedir. 

A continuación se van introduciendo números hasta que introduzcamos el 0. 
* Cuando termine el programa dará las siguientes informaciones:

La suma de los números que están dentro del intervalo (intervalo abierto).
Cuantos números están fuera del intervalo.
Informa si hemos introducido algún número igual a los límites del intervalo.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 * Debemos clasificar unos intervalos en cuanto a si lo que introduce el usuario
 * esta dentro del intervalo, fuera o es uno de  los limites
 *
 *Diseño:
 * 1. Inicializo el acumulador, el contador y el indicado
 * 2. Repetir -> ller limInf y limSup hasta que limInf<limSup
 * 3. Leer num
 * 4. Mientras num sea distinto de 0
 * 5. Si num pertenece al intervalo -> acumula la suma
 * 6. Sino -> incremento contador
 * 7. Si es igual a algún intervalo -> Lo indico (indicador a Verdadero)
 * 8. Leer num
 * 9. Muestro la suma de los números pertenecientes al intervalo
 * 10. Muestro el contador de números no pertenecientes al intervalo
 * 11. Si el indicador = Verdadero -> Muestro "Un número = a intervalo"
 * 12. SiNo -> Muestro "No has introducido un número igual al intervalo
*/
import java.util.Scanner;
public class act5 {
    public static void main(String[] args) {
        System.out.println("Programa que define intervalos");
        System.out.println("------------------------------");
        Scanner s = new Scanner(System.in);
        int contFueraIntervalo = 0;
        boolean igualLimites = false;
        int limInf;
        int limSup;
        int num;
        int sumaDentroIntervalo = 0;

        do {
          System.out.print("Introduce el límite inferior del intervalo: ");
          limInf = s.nextInt();
          System.out.print("Introduce el límite superior del intervalo: ");
          limSup = s.nextInt();
          if (limInf>limSup) {
            System.out.println("ERROR: El límite inferior debe ser menor que el superior.");
          }
        } while (limInf>limSup);

        System.out.print("Introduce un número (0, para salir): ");
        num = s.nextInt();
        while (num!=0) {
          if (num>limInf && num<limSup) {
            sumaDentroIntervalo += num;
          } else {
            contFueraIntervalo++;
          }
          if (num==limInf || num==limSup) {
            igualLimites = true;
          }
          System.out.print("Introduce un número (0, para salir): ");
          num = s.nextInt();
        }

        System.out.println("La suma de los número dentro del intervalo es " + sumaDentroIntervalo);
        System.out.println("La cantidad de números fuera del intervalo es " + contFueraIntervalo);
        if (igualLimites) {
          System.out.println("Se ha introducido algún número igual a los límites del intervalo.");
        } else {
          System.out.println("No se ha introducido ningún número igual a los límites del intervalo.");
        }
    }
}
