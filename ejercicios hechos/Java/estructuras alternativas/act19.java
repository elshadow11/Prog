/*Programa: act19.java
 * 
 *Prop�sito: Escribe un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el mes correspondiente.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Leemos un mes en valor numerico y los motramos en n�mero de dias que tiene
 * 
 *Dise�o:
 * 1. Leer mes como entero
 * 2. Seg�n el valor del mes:
 * 3. Si es el 1,3,5,7,8,10,12: tiene 31 d�as
 * 4. Si es el 2: tiene 28 o 29 d�as
 * 5. Si es el 2,4,9,11: tiene 30 d�as
 * 6. Si es otro n�mero, mostrar mensaje de error
*/
import java.util.Scanner; 
public class act19 {
    public static void main(String[] args) {
        System.out.println("?");
        System.out.println("--------------------------------------------------");
        Scanner s = new Scanner(System.in);
        int mes;

        System.out.print("Introduce el n�mero de mes (1-12): ");
        mes = s.nextInt();

        switch (mes) {
          case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("31 d�as");
            break;
          case 2:
            System.out.println("28 o 29 d�as");
            break;
          case 4: case 6: case 9: case 11:
            System.out.println("30 d�as");
            break;
          default:
            System.out.println("Mes incorrecto");
        }
    }
}
