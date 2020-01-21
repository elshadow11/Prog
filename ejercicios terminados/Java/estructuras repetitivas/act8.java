/*Programa: act8.java
 * 
 *Propósito: Hacer un programa que muestre un cronometro, indicando las 
 * horas, minutos y segundos.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 * 
 *
 *Diseño:
*/
import java.util.concurrent.TimeUnit;
public class act8 {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Programa que muestra un conmetro");
        System.out.println("--------------------------------");
        int hora;
        int minuto;
        int segundo;
        String borraAnterior = "\b\b\b\b\b\b\b\b"; 

        for (hora=0; hora<=23; hora++) {
          for (minuto=0; minuto<=59; minuto++) {
            for (segundo=0; segundo<=59; segundo++) {
              System.out.print(borraAnterior+hora+":"+minuto+":"+segundo);
              TimeUnit.SECONDS.sleep(1);
            }
          }
        }
    }
}
