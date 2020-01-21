/*Programa: act9.java
 * 
 *Propósito: Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 07/11/2019
 *
 *Análisis:
 * Tras saber cuanto cuesta la compra debemos aplicarle el 15% de descuento y mostrar por pantalla
 * 
 *Diseño:
 * 1. Leemos el precio
 * 2. Calculamos precio final y lo mostramos
 * Variables: precio
*/

import java.util.Scanner;

public class act9 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa para calcular el precio de un descuento");
    System.out.println("------------------------------------------------");
    double precio;

    System.out.print("Introduce el precio del producto: ");
    precio = s.nextDouble();
    System.out.println("Precio final: "+(precio-precio*0.15));
  }
}
