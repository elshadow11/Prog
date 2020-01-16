/*Programa: act4.java
 *Prop�sito: Dados dos n�meros, mostrar la suma, resta, divisi�n y multiplicaci�n de ambos.
 *Autor: Jose Manuel Serrano Palomo.
 *Fecha: 06/11/2019
 *
 *An�lisis:
 * Tenemos que pedirle al usuario dos n�meros para calcular la suma, resta, multiplicaci�n y divisi�n entre ellos
 * Y mostrar el resultado por pantalla
 * 
 *Dise�o:
 * 1. Leemos los datos
 * 2. Hacemos las operaciones de suma, resta ,multiplicacion y division
 * 3. Mostramos el resultado en pantalla
*/
import java.util.Scanner;

public class act4 {
 public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
        System.out.println("Introduce dos numeros y calcula entre ellos");
        System.out.println("-------------------------------------------");
    double n1;
    double n2;

    System.out.print("Introduce el primer digito: ");
    n1 = s.nextDouble();
    System.out.print("Introduce el segundo digito: ");
    n2 = s.nextDouble();

    System.out.println("La suma es "+(n1+n2));
    System.out.println("La resta es "+(n1-n2));
    System.out.println("La multiplicaci�n es "+(n1*n2));
    System.out.println("La divisi�n es "+(n1/n2));
  }


}

