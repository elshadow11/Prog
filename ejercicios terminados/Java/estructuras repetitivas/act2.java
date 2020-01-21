/*Programa: act2.java
 * 
 *Propósito: Realizar un algoritmo que pida números (se pedirá por teclado
 *  la cantidad de números a introducir). El programa debe informar de cuantos
 *  números introducidos son mayores que 0, menores que 0 e iguales a 0
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 * Debemos realizar un programa que nos clasifique los numeros que introduzcamos
 * debemos clasificarlos en menores, iguales o mayores que 0
 * 
 *Diseño:
 * 1. Leemos cantidad_num
 * 2. Para i siendo i menor o igual que cantidad_num realizamos lo siguiente
 * 3. Si num es mayor que 0 incrementamos contPositivos
 * 4. Si num es menor que 0 incrementamos contNegativos
 * 5. Si num es igual que 0 incrementamos contCeros
 * 6. Mostramos el resultado por la pantalla
*/
import java.util.Scanner; 
public class act2 {
    public static void main(String[] args) {
        System.out.println("Programa para comprobar numeros");
        System.out.println("-------------------------------");
        Scanner s = new Scanner(System.in);
        int cantidad_num;
        int contCeros = 0;
        int contNegativos = 0;
        int contPositivos = 0;
        int i;
        int num;

        System.out.print("¿Cuántos números vas a introducir?: ");
        cantidad_num = s.nextInt();

        for (i=1; i<=cantidad_num; i++) {
          System.out.print("Número "+i+": ");
          num = s.nextInt();
          if (num>0) {
            contPositivos = contPositivos+1;
          } else if (num<0) {
              contNegativos = contNegativos+1;
          } else {
              contCeros = contCeros+1;
          }
        }

        System.out.println("Números positivos: "+contPositivos);
        System.out.println("Números negativos: "+contNegativos);
        System.out.println("Números igual a 0: "+contCeros);
    }
}
