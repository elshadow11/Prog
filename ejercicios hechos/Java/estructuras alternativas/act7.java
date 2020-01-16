/*Programa: act7.java
 * 
 *Propósito: Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
 * El exponente sea positivo, sólo tienes que imprimir la potencia.
 * El exponente sea 0, el resultado es 1.
 * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *Análisis:
 * Pedimos base y exponente y comprobamos si al ser el exponente 0 el resultado es 1
 * o comprobamos que sea menor que 0
 *
 *Diseño:
 * 1. Leemos b y exp
 * 2. Si exp == 0 se escribe 1
 * 3. Si exp > 0 se realiza el calculo
 * 4. Si exp < 0 el resultado es 1/potencia.
 * 
*/
import java.util.Scanner; 
public class act7 {
    public static void main(String[] args) {
        System.out.println("Progrma que ");
        System.out.println("--------------------------------------------------");
        Scanner s = new Scanner(System.in);
        int b;
        int exp;

        System.out.print("Dime la base: ");
        b = s.nextInt();
        System.out.print("Dime el exponente: ");
        exp = s.nextInt();

        if (exp>0) {
        System.out.println("La potencia es "+Math.pow(b,exp));
        } else if (exp==0) {
        System.out.println("La potencia es 1");
        } else {
        System.out.println("La potencia es "+1/(Math.pow(b,Math.abs(exp))));
        }
    }
}
