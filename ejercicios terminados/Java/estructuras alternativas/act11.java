/*Programa: act11.java
 * 
 *Propósito: Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
 * 
 * Si se cumple Pitágoras entonces es triángulo rectángulo
 * Si sólo dos lados del triángulo son iguales entonces es isósceles.
 * Si los 3 lados son iguales entonces es equilátero.
 * Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *Análisis:
 * Pedimos la medida de un triangulo y debemos comprobar que tipo de triangulo és
 *
 *Diseño:
 * 1. Leemos ladoa, ladob, ladoc
 * 2. Si pitagoras funciona es rectangulo
 * 3. si tiene dos lados iguales isosceles
 * 4. Si no es equilátero
 * 5. Si no es escaleno
 * Variables: ladoa, ladob, ladoc
*/

import java.util.Scanner; 
public class act11 {
    public static void main(String[] args) {
        System.out.println("Programa para definir el tipo de triángulo");
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

    // Pitágoras
    if (Math.pow(ladoa,2)+Math.pow(ladob,2)==Math.pow(ladoc,2) || Math.pow(ladob,2)+Math.pow(ladoc,2)==Math.pow(ladoa,2) || Math.pow(ladoc,2)+Math.pow(ladoa,2)==Math.pow(ladob,2)) {
      System.out.println("Triángulo Rectángulo");
    }
    // isósceles
    if ((ladoa==ladob && ladoa!=ladoc) || (ladob==ladoc && ladob!=ladoa) || (ladoc==ladoa && ladoc!=ladob)) {
      System.out.println("Triángulo Isósceles");
    // equilátero
    } else if (ladoa==ladob && ladoa==ladoc) {
        System.out.println("Triángulo Equilátero");
    // escaleno
    } else {
        System.out.println("Triángulo Escaleno");
    }
    }
}
