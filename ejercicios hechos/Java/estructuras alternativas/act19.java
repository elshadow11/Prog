/*Programa: act19.java
 * 
 *Propósito: Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *Análisis:
 * Leemos un mes en valor numerico y los motramos en número de dias que tiene
 * 
 *Diseño:
 * 1. Leer mes como entero
 * 2. Según el valor del mes:
 * 3. Si es el 1,3,5,7,8,10,12: tiene 31 días
 * 4. Si es el 2: tiene 28 o 29 días
 * 5. Si es el 2,4,9,11: tiene 30 días
 * 6. Si es otro número, mostrar mensaje de error
*/
import java.util.Scanner; 
public class act19 {
    public static void main(String[] args) {
        System.out.println("?");
        System.out.println("--------------------------------------------------");
        Scanner s = new Scanner(System.in);
        int mes;

        System.out.print("Introduce el número de mes (1-12): ");
        mes = s.nextInt();

        switch (mes) {
          case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("31 días");
            break;
          case 2:
            System.out.println("28 o 29 días");
            break;
          case 4: case 6: case 9: case 11:
            System.out.println("30 días");
            break;
          default:
            System.out.println("Mes incorrecto");
        }
    }
}
