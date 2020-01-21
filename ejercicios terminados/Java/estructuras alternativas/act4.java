/*Programa: act4.java
 * 
 *Prop�sito: Crea un programa que pida al usuario dos n�meros y muestre su divisi�n si el segundo no es cero, o un mensaje de aviso en caso contrario.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Tras pedir dos n�meros mostramos su divisi�n pero si el divisor es 0 da error
 *
 *Dise�o:
 * 1. Leer n1 y n2
 * 2. Si divisor es igual a 0 Escribir mensaje de error
 * 3. Sino mostrar resultado
 * Variables n1(dividendo) y n2(divisor)
*/
 
public class plantilla {
    public static void main(String[] args) {
        System.out.println("Programa que divide dos n�meros");
        System.out.println("-------------------------------");
        Scanner s = new Scanner(System.in);
        int n1;
        int n2;

        System.out.print("Dime el primer numero: ");
        n1 = s.nextInt();
        System.out.print("Dime el segundo n�mero: ");
        n2 = s.nextInt();

        if (n2==0) {
        System.out.println("Error, no se puede dividir entre 0");
        } else {
        System.out.println("El resultado es "+n1/n2);
        }
    }
}
