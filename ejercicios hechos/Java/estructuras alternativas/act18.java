/*Programa: act18.java
 * 
 *Prop�sito: Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Leemos un d�a de la semana como n�mero y lo mostramos escrito en pantalla y si hay un valor erroneo mensaje de error
 * 
 *Dise�o:
 * 1. Leer dia de la semana
 * 2. Seg�n el valor mostrar el nombre
 * 3. si el dia es incorrecto mensaje de error
*/
import java.util.Scanner;
public class act18 {
    public static void main(String[] args) {
        System.out.println("Programa para saber el dia de la semana");
        System.out.println("---------------------------------------");
        Scanner s = new Scanner(System.in);
        int dia;

        System.out.print("Dime un d�a de la semana (1-7): ");
        dia = s.nextInt();

        switch (dia) {
          case 1:
            System.out.println("Lunes");
            break;
          case 2:
            System.out.println("Martes");
            break;
          case 3:
            System.out.println("Mi�rcoles");
            break;
          case 4:
            System.out.println("Jueves");
            break;
          case 5:
            System.out.println("Viernes");
            break;
          case 6:
            System.out.println("S�bado");
            break;
          case 7:
            System.out.println("Domingo");
            break;
          default:
            System.out.println("D�a incorrecto");
        }
    }
}
