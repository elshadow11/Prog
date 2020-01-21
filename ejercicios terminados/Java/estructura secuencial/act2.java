/*Programa: act2.java
Propósito: Calcular el perí­metro y área de un rectángulo dada su base y su altura.
Autor: Jose Manuel Serrano Palomo.
Fecha: /11/2019

Análisis:
* Primero pedimos al usuario que introduzca la base y la altura
* Luego mediante las formulas del area y el perimetro, luego lo mandamos por pantalla
*  
Diseño:
*1. Leemos b,h
*2. p <-- 2*b+2*h
*3. a <-- b*h
*4. Escribe p y a
*/
import java.util.Scanner;

public class act2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
        System.out.println("Calculo de perimtero y area de un rectangulo");
        System.out.println("--------------------------------------------");
    //definimos las variables
    double h;
    double a;
    double b;
    double p;
    //Leemos la base y la altura
    System.out.print("Por favor introduce la base: ");
    b = Double.parseDouble(s.nextLine());
    
    System.out.print("Por favor introduce la altura: ");
    h = Double.parseDouble(s.nextLine());
    //hacemos los calculos de are y perimetro
    p = 2*b+2*h;
    a = b*h;
    //mostramos los resultados
    System.out.println("El resultado del perí­metro es "+p+" y el del área es "+a);
  }


}
