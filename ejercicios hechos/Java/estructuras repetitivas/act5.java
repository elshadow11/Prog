/*Programa: act5.java
 * 
 *Prop�sito: Escribe un programa que pida el limite inferior y superior de 
 * un intervalo. Si el l�mite inferior es mayor que el superior lo tiene que 
 * volver a pedir. 

A continuaci�n se van introduciendo n�meros hasta que introduzcamos el 0. 
* Cuando termine el programa dar� las siguientes informaciones:

La suma de los n�meros que est�n dentro del intervalo (intervalo abierto).
Cuantos n�meros est�n fuera del intervalo.
Informa si hemos introducido alg�n n�mero igual a los l�mites del intervalo.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *An�lisis:
 * Debemos clasificar unos intervalos en cuanto a si lo que introduce el usuario
 * esta dentro del intervalo, fuera o es uno de  los limites
 *
 *Dise�o:
 * 1. Inicializo el acumulador, el contador y el indicado
 * 2. Repetir -> ller limInf y limSup hasta que limInf<limSup
 * 3. Leer num
 * 4. Mientras num sea distinto de 0
 * 5. Si num pertenece al intervalo -> acumula la suma
 * 6. Sino -> incremento contador
 * 7. Si es igual a alg�n intervalo -> Lo indico (indicador a Verdadero)
 * 8. Leer num
 * 9. Muestro la suma de los n�meros pertenecientes al intervalo
 * 10. Muestro el contador de n�meros no pertenecientes al intervalo
 * 11. Si el indicador = Verdadero -> Muestro "Un n�mero = a intervalo"
 * 12. SiNo -> Muestro "No has introducido un n�mero igual al intervalo
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
          System.out.print("Introduce el l�mite inferior del intervalo: ");
          limInf = s.nextInt();
          System.out.print("Introduce el l�mite superior del intervalo: ");
          limSup = s.nextInt();
          if (limInf>limSup) {
            System.out.println("ERROR: El l�mite inferior debe ser menor que el superior.");
          }
        } while (limInf>limSup);

        System.out.print("Introduce un n�mero (0, para salir): ");
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
          System.out.print("Introduce un n�mero (0, para salir): ");
          num = s.nextInt();
        }

        System.out.println("La suma de los n�mero dentro del intervalo es " + sumaDentroIntervalo);
        System.out.println("La cantidad de n�meros fuera del intervalo es " + contFueraIntervalo);
        if (igualLimites) {
          System.out.println("Se ha introducido alg�n n�mero igual a los l�mites del intervalo.");
        } else {
          System.out.println("No se ha introducido ning�n n�mero igual a los l�mites del intervalo.");
        }
    }
}
