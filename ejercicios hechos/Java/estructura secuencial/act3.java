/*Programa: act3.java
 *Propósito: Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 *Autor: Jose Manuel Serrano Palomo.
 *Fecha: 06/11/2019
 *
 *Análisis:
 * Debemos usar la formula de el calculode la hipotenusa
 * Para ello pedimos al usuario los catetos del triangulo
 * Hacemos el calculo y lo mostramos
 * 
 *Diseño:
 *1. Leemos los catetos
 *2. realizamos la formula
 *3. lo mostramos por pantalla
*/

import java.util.Scanner; 
public class act3 {
    public static void main(String[] args) {
        System.out.println("Calcula la hipotenusa de un triangulo rectangulo");
        System.out.println("------------------------------------------------");
        Scanner s = new Scanner(System.in);
    //Definimos las variables
    double cat1;
    double cat2;
    double hip;

    //Leemos los datos
    System.out.println("Introduce el primer cateto: ");
    cat1 = s.nextDouble();
    System.out.println("Introduce el segundo cateto: ");
    cat2 = s.nextDouble();

    //calculamos la hipotenusa
    hip = Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
    
    //mostramos el resultado
    System.out.println("La hipotenusa es "+hip);
    }
}
