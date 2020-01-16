/*Programa: act14.java
 * 
 *Prop�sito:  La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B, y adem�s en tama�os 1 y 2. Cuando se realiza la venta del producto, �sta es de un solo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo A, 
se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1; y 30 c�ntimos si es de tama�o 2. Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. Realice un algoritmo para determinar la ganancia obtenida.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Multiplicamos los kilos de uva por el precio por kilo y este se calcula
 * con el precio inicial y se suma o resta dependiendot del tipo y tama�o
 *
 *Dise�o:
 * 1. Leer precioInicial, kilos
 * 2. Leer tipo
 * 3. Si no es A o B mensaje de fallo
 * 4. Leer tama�o
 * 5. Si el tama�o no es 1 o 2 mensaje de fallo
 * 6. Si tipo es "A" y tama�o es "1" sumo a precio_inical 20 c�ntimos.
 * 7. Si tipo es "A" y tama�o es "2" sumo a precio_inical 30 c�ntimos.
 * 8. Si tipo es "B" y tama�o es "1" resto a precio_inical 20 c�ntimos.
 * 9. Si tipo es "B" y tama�o es "2" resto a precio_inical 30 c�ntimos.
 * 10. El precio_final = precioInicial * kilos
 * 11. Muestro precio final/100 euros
 * Variables: precioInicial que introducira el cliente, kilos que es la cantidad que compra del producto, tama�o y tipo son las opciones y precio_final es resultado
*/
import java.util.Scanner; 
public class act14 {
    public static void main(String[] args) {
        System.out.println("Programa para calcular edl precio de uvas");
        System.out.println("------------------------------------------");
        Scanner s = new Scanner(System.in);
        int kilos;
        double precioFinal;
        double precioInicial;
        String tamano;
        String tipo;

        System.out.print("Introduce el precio inicial por kilos de la UVA (centimos): ");
        precioInicial = s.nextDouble();
        System.out.print("Introduce cuantos kilos has vendido: ");
        kilos = s.nextInt();
        s.nextLine();
        System.out.print("Introduce el tipo de la UVA (A/B): ");
        tipo = s.nextLine();


        if (!tipo.toUpperCase().equals("A") && !tipo.toUpperCase().equals("B")) {
          System.out.println("Tipo incorrecto");
        } else {
          System.out.print("Introduce el tama�o de la UVA (1/2):");
          tamano = s.nextLine();
          if (!tamano.equals("1")&!tamano.equals("2")) {
            System.out.println("Tama�o incorrecto");
          } else {
            if (tipo.toUpperCase().equals("A")) {
              if (tamano.equals("1")) {
                precioInicial = precioInicial+20;
              } else {
                precioInicial = precioInicial+30;
              }
            } else {
              if (tamano.equals("1")) {
                precioInicial = precioInicial-20;
              } else {
                precioInicial = precioInicial-30;
              }
            }
            precioFinal = precioInicial*kilos;
            System.out.println("La ganancia es "+precioFinal/100+" euros.");
          }
        }
    }
}
