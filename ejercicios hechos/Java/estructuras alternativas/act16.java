/*Programa: act16.java
 * 
 *Propósito: La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *Análisis:
 * El precio de una llama se calcula dependiendo del tiempo
 * Cada ciertos minutos el precio disminye hasta quedare en los 10 mins 
 * y dependiendo del dia y el horario tambien varía el precio,
 *
 *Diseño:
 * 1. Leer tiempo
 * 2. Leer si la llamada es en domingo
 * 3. Si no es en domingo, leer el turno (Mañana o Tarde)
 * 4. Si tiempo <5 coste=tiempo*100
 * 5. Si tiempo<8 coste=(tiempo-5)*80 + 500 (el coste de los cinco primeros minutos)
 * 6. Si tiempo<10 coste=(tiempo-8)*70 + 240 (el coste desde el minuto 6 al 8) + 500 (el coste de los cinco primeros minutos)
 * 7. Si tiempo>10 coste=(tiempo-10)*50 + 140 (el coste desde el minuto 9 al 10) + 240 (el coste desde el minuto 6 al 8) + 500 (el coste de los cinco primeros minutos)
 * 8. Si la llamada es en domingo coste = coste + 3%
 * 9. Si la llamada es otro día por la mañana coste = coste + 15%
 * 10. Si la llamada es otro día por la mañana coste = coste + 10%
 * 11. Mostrar coste final en euros
*/

import java.util.Scanner;
public class act16 {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el precio de una llamada");
        System.out.println("-----------------------------------------------");
        Scanner s = new Scanner(System.in);
        double coste; // centimos
        String esDomingo;
        int tiempo;
        String turno="";

        System.out.print("¿Cuánto tiempo es la llamada?: ");
        tiempo = s.nextInt(); s.nextLine();
        System.out.print("¿Es Domingo? (S/N): ");
        esDomingo = s.nextLine();
        if (esDomingo.toUpperCase().equals("N")) {
          System.out.print("¿Qué turno: Mañana o Tarde? (M/T)?: ");
          turno = s.nextLine();
        }

        if (tiempo<=5) {
          coste = tiempo*100;
        } else if (tiempo<=8) {
          coste = (tiempo-5)*80+500;
        } else if (tiempo<=10) {
          coste = (tiempo-8)*70+240+500;
        } else {
          coste = (tiempo-10)*50+140+240+500;
        }
        if (esDomingo.toUpperCase().equals("S")) {
          coste += coste*0.03;
        } else if (turno.toUpperCase().equals("M")) {
          coste += coste*0.15;
        } else {
          coste += coste*0.10;
        }
        System.out.println("El coste de la llamada: "+coste/100+" euros.");
    }
}
