/*Programa: act10.java
 * 
 *Propósito: Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
circunferencias y las clasifique en uno de estos estados:

exteriores
tangentes exteriores
secantes
tangentes interiores
interiores
concéntricas
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *Análisis:
 * Nos dan un centro y un radio de dos circunferencias
 * debemos comprobar su organización en el plano
 *
 *Diseño:
 * 1. Leer x1,y1,r1 x2,y2,r2
 * 2. Caculamos la distancia entre los centros
 * 4. Si distancia>suma de los radios mostrar "Circunferencias exteriores"
 * 5. Si distancia = suma de los radios mostrar "Tangentes exteriores"
 * 6. Si distancia < suma de los radios Y distancia> que el valor absoluto de la resta de los radios mostrar "Circunferencias secante"
 * 7. Si distancia = que el valor absoluto de la resta de los radios mostrar "Circunferencias tangentes interiores"
 * 8. Si distancia >0 y distancia < que el valor absoluto de la resta de los radios mostrar "Circunferencias interiores"
 * 9. Si distancia = 0  mostrar "Circunferencias concéntricas"
*/
import java.util.Scanner;
 
public class act10 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("?");
    System.out.println("--------------------------------------------------");
    double distancia;
    double r1;
    double r2;
    double x1;
    double x2;
    double y1;
    double y2;

    System.out.print("Dime coordenada x primera circunferencia: ");
    x1 = s.nextDouble();
    System.out.print("Dime coordenada y primera circunferencia: ");
    y1 = s.nextDouble();
    System.out.print("Dime radio primera circunferencia: ");
    r1 = s.nextDouble();
    System.out.print("Dime coordenada x segunda circunferencia: ");
    x2 = s.nextDouble();
    System.out.print("Dime coordenada y segunda circunferencia: ");
    y2 = s.nextDouble();
    System.out.print("Dime radio segunda circunferencia: ");
    r2 = s.nextDouble();

    distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    
    if (distancia>(r1+r2)) {
      System.out.println("Circunferencias exteriores");
    }
    if (distancia==(r1+r2)) {
      System.out.println("Circunferencias tangentes exteriores");
    }
    if (distancia<(r1+r2) && distancia>Math.abs(r1-r2)) {
      System.out.println("Circunferencias secantes");
    }
    if (distancia==Math.abs(r1-r2)) {
      System.out.println("Circunferencias tangentes interiores");
    }
    if (distancia>0 && distancia<Math.abs(r1-r2)) {
      System.out.println("Circunferencias interiores");
    }
    if (distancia==0) {
      System.out.println("Circunferencias concétricas");
    }
  }


}
