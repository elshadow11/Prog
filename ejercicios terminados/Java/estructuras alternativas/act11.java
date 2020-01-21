/*Programa: act11.java
 * 
 *Prop�sito: Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un tri�ngulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
 * 
 * Si se cumple Pit�goras entonces es tri�ngulo rect�ngulo
 * Si s�lo dos lados del tri�ngulo son iguales entonces es is�sceles.
 * Si los 3 lados son iguales entonces es equil�tero.
 * Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Pedimos la medida de un triangulo y debemos comprobar que tipo de triangulo �s
 *
 *Dise�o:
 * 1. Leemos ladoa, ladob, ladoc
 * 2. Si pitagoras funciona es rectangulo
 * 3. si tiene dos lados iguales isosceles
 * 4. Si no es equil�tero
 * 5. Si no es escaleno
 * Variables: ladoa, ladob, ladoc
*/

import java.util.Scanner; 
public class act11 {
    public static void main(String[] args) {
        System.out.println("Programa para definir el tipo de tri�ngulo");
        System.out.println("------------------------------------------");
           Scanner s = new Scanner(System.in);
    double ladoa;
    double ladob;
    double ladoc;

    // Pedimos datos
    System.out.print("Introduce longitud lado A: ");
    ladoa = s.nextDouble();
    System.out.print("Introduce longitud lado B: ");
    ladob = s.nextDouble();
    System.out.print("Introduce longitud lado C: ");
    ladoc = s.nextDouble();

    // Pit�goras
    if (Math.pow(ladoa,2)+Math.pow(ladob,2)==Math.pow(ladoc,2) || Math.pow(ladob,2)+Math.pow(ladoc,2)==Math.pow(ladoa,2) || Math.pow(ladoc,2)+Math.pow(ladoa,2)==Math.pow(ladob,2)) {
      System.out.println("Tri�ngulo Rect�ngulo");
    }
    // is�sceles
    if ((ladoa==ladob && ladoa!=ladoc) || (ladob==ladoc && ladob!=ladoa) || (ladoc==ladoa && ladoc!=ladob)) {
      System.out.println("Tri�ngulo Is�sceles");
    // equil�tero
    } else if (ladoa==ladob && ladoa==ladoc) {
        System.out.println("Tri�ngulo Equil�tero");
    // escaleno
    } else {
        System.out.println("Tri�ngulo Escaleno");
    }
    }
}
