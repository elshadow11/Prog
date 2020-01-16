/*Programa: act20.java
 * 
 *Propósito: Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 10/11/2019
 *
 *Análisis:
 * El coste del servicio se basa en el peso y a donde se dirige
 * Para paquetes mayores a 5KG no hay entregas
 * 
 *Diseño:
 * 1. Leer peso
 * 2. Si no es correcto >0 y <5000 mostrar mensaje de error
 * 3. Si es correcto:
 * 4. Leer zona
 * 5. Según el valor de la zona calculo el coste del transporte.
 * 6. Mostrar el coste de transporte.
 * 
*/
import java.util.Scanner;
 
public class act20 {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el precio de un transporte");
        System.out.println("-------------------------------------------------");
        Scanner s = new Scanner(System.in);
        int peso;
        int zona;

        System.out.print("¿Qué peso tiene el paquete (en gramos)?: ");
        peso = s.nextInt();

        if (peso>0 && peso<=5000) {
          System.out.println("1.- América del Norte");
          System.out.println("2.- América Central");
          System.out.println("3.- América del Sur");
          System.out.println("4.- Europa");
          System.out.println("5.- Asia");
          System.out.print("A que zona se reparte (1-5): ");
          zona = s.nextInt();
          switch (zona) {
            case 1:
              System.out.println("Coste: "+peso*24+" euros.");
              break;
            case 2:
              System.out.println("Coste: "+peso*20+" euros.");
              break;
            case 3:
              System.out.println("Coste: "+peso*21+" euros.");
              break;
            case 4:
              System.out.println("Coste: "+peso*10+" euros.");
              break;
            case 5:
              System.out.println("Coste: "+peso*18+" euros.");
              break;
            default:
              System.out.println("Zona incorrecta.");
          }
        } else {
          System.out.println("Peso incorrecto (no podemos transportar paquetes de más de 5Kg).");
        }
    }
}
