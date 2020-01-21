/*Programa: act8.java
 * 
 *Propósito: Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *Análisis:
 * Pedimos edad, nota y sexo. Debemos ver si se cumplen las condiciiones y mostrar el resultado en pantalla
 *
 *Diseño:
 * 1. Leer nota edad y sexo
 * 2. Si nota >= 5, edad>=18
 * 3. Si sexo="F" mostrar "ACEPTADA"
 * 4. Si sexo="M" mostrar "POSIBLE"
 * 5. Sino mostrar NO ACEPTADA
 * Variables: edad, nota y sexo
*/
import java.util.Scanner; 
public class act8 {
    public static void main(String[] args) {
        System.out.println("Programa para ver si está aceptada");
        System.out.println("----------------------------------");
        Scanner s = new Scanner(System.in);
        int edad;
        int nota;
        String sexo;

        System.out.print("Introduce la nota: ");
        nota = s.nextInt();
        System.out.print("Introduce la edad: ");
        edad = s.nextInt();
        s.nextLine();
        System.out.print("Introduce el sexo F o M: ");
        sexo = s.nextLine();

        if (nota>=5 && edad>=18) {
        if (sexo.toUpperCase().equals("F")) {
            System.out.println("Aceptada");
        } else if (sexo.toUpperCase().equals("M")) {
            System.out.println("Posible");
        } else {
            System.out.println("El sexo no es F ni M. No Aceptada");
        } 
        } else {
        System.out.println("No Aceptada");
        }
    }
}
