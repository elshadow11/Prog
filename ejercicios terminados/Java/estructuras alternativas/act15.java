/*Programa: act15.java
 * 
 *Propósito: El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *Análisis:
 * Debemos calcular el precio final de un bus teniendo encuenta que cada
 * tantos alumnos el precio por alumndo cambia
 *
 *Diseño:
 * 1. Leemos el numAlumnos
 * 2. Si el número>=100 coste por alumno = 65
 * 3. Si el número>=50 y <=99 coste por alumno = 70
 * 4. Si el número>=30 y <=49 coste por alumno = 95
 * 5. Si el número<30 coste por alumno = 4000 / número de alumnos
 * 6. Si el número de alumnos > 0 (valor correcto) calculo costeAutobus=número alumnos * coste por alumno y muestro costeAutobus coste por alumnos.
 * 7. Si el número de alumno <= 0 mostrar mensaje de error
*/
import java.util.Scanner;
 
public class act15 {
    public static void main(String[] args) {
        System.out.println("Calcular el precio del viaje");
        System.out.println("----------------------------");
        Scanner s = new Scanner(System.in);
        int costeAutobus;
        double costePorAlumno=0;
        int numAlumnos;

        // Pedimos datos
        System.out.print("¿Cuántos alumnos participan en la actividad?: ");
        numAlumnos = s.nextInt();

        // Proceso
        if (numAlumnos>=100) {
          costePorAlumno = 65;
        }
        else if (numAlumnos>=50) {
          costePorAlumno = 70;
        }
        else if (numAlumnos>=30) {
          costePorAlumno = 95;
        }
        else if (numAlumnos>0) {
          costePorAlumno = 4000.0/numAlumnos;
        }
        if (numAlumnos>0) {
          costeAutobus = (int) (numAlumnos*costePorAlumno);
          System.out.println("El coste por alumno es "+costePorAlumno+" euros.");
          System.out.println("El coste del autobús es "+costeAutobus+" euros.");
        } else {
          System.out.println("El número de alumnos debe ser un valor positivo.");
        }
    }
}
