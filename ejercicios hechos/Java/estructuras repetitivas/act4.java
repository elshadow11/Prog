/*Programa: act4.java
 * 
 *Prop�sito: Escribir un programa que imprima todos los n�meros pares entre 
 * dos n�meros que se le pidan al usuario.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *An�lisis:
 * Tenemos que ver si un numero es par o impar e imprimir todos los impares entre dos numeros que introduzca el usuario
 *
 *Dise�o:
 * 1. Leer num1,num2
 * 2. Si num1 es impar -> num1=num1+1
 * 3. Desde num1 hasta num2 de 2 en 2
 * 4. Escribir el n�mero
*/
import java.util.Scanner; 
public class act4 {
    public static void main(String[] args) {
        System.out.println("Programa qye imprime pares");
        System.out.println("--------------------------");
        Scanner s = new Scanner(System.in);
        int num;
        int num1;
        int num2;

        System.out.print("Introduce el n�mero 1: ");
        num1 = s.nextInt();
        System.out.print("Introduce el n�mero 2: ");
        num2 = s.nextInt();

        if (num1%2==1) {
          num1++;
        }

        for (num=num1; num<=num2; num+=2) {
          System.out.print(num+" ");
        }
    }
}
