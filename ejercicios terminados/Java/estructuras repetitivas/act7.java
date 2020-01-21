/*Programa: act7.java
 * 
 *Prop�sito: Una persona adquiri� un producto para pagar en 20 meses. El 
 * primer mes pag� 10 �, el segundo 20 �, el tercero 40 � y as� sucesivamente. 
 * Realizar un programa para determinar cu�nto debe pagar mensualmente y 
 * el total de lo que pagar� despu�s de los 20 meses.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *An�lisis:
 * Debemos ir acumulando valores de una serie de 20 cantidades a pagar
 *
 *Dise�o:
 * 1. Inicializo las variables -> pagoAcumulado<-20; pago<-10
 * 2. Desde el mes 1 hasta el 20
 * 3. Acumulo el pago
 * 4. Doblo el pago
 * 5. Muestro el pago acumulado
*/
 
public class act7 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula lo que debe pagar");
        System.out.println("--------------------------------------");
        int pago = 10;
        int pagoAcumulado = 0;

        for (int mes=1; mes<=20; mes++) {
          System.out.printf("Mes %2d paga %7d euros\n",mes,pago);
          pagoAcumulado += pago;
          pago *= 2;
        }
        System.out.printf("Al final de los 20 meses tuvo que pagar: %8d euros\n",pagoAcumulado);
    }
}
