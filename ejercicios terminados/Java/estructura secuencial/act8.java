/*Programa: act8.java
 *Propósito: Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
 *Autor: Jose Manuel Serrano Palomo.
 *Fecha: /11/2019
 *
 *Análisis:
 * Tenemos un vendedor con un sueldo base que introduce el usuario y al cual se
 * le añade un 10% de comisión por ventas y debemos calcular el sueldo final
 * 
 *Diseño:
 * Leemos el sueldoBase
 * Leemos v1, v2 y v3
 * Calculamos comision <-- v1*0.1+v2*0.1+v3*0.1
 * Mostramos la comision y el sueldo final
 * Variables: sueldoBase será el sueldo que introduzca el usuario, v1, v2, v3 son las ventas, comision es el resultado de calcular la comision
*/

import java.util.Scanner;

public class act8 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Calcular el sueldo final de un vendedor");
    System.out.println("---------------------------------------");
    double comision;
    double sueldoBase;
    double v1;
    double v2;
    double v3;

    System.out.println("Introduce el sueldo base del vendedor:");
    sueldoBase = s.nextDouble();
    System.out.println("Introduce la primera venta:");
    v1 = s.nextDouble();
    System.out.println("Introduce la segunda venta:");
    v2 = s.nextDouble();
    System.out.println("Introduce la tercera venta:");
    v3 = s.nextDouble();

    comision = v1*0.1+v2*0.1+v3*0.1;

    System.out.println("Comisión por ventas: "+comision);
    System.out.println("Sueldo total: "+sueldoBase+comision);
  }


}
