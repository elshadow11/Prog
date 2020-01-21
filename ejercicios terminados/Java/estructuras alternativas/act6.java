/*Programa: act6.java
 * 
 *Prop�sito: Programa que lea una cadena por teclado y compruebe si es una letra may�scula.
 * 
 *Autor: Jose Manuel Serrano Palomo.
 * 
 *Fecha: 09/11/2019
 *
 *An�lisis:
 * Tras pedir por telcado a un usuario que introduzca una cadena comprobamos si es
 * mayuscula o minuscula
 *
 *Dise�o:
 * 1. Leemos cad
 * 2. Si es igual a 1 de longitud y est� entre la A y la Z es mayuscula
 * 3. sino es minuscula
 * Variables: cad
*/
import java.util.Scanner; 
public class act6 {
    public static void main(String[] args) {
        System.out.println("Progrma que comprueba si una letras es may�scula o no");
        System.out.println("-----------------------------------------------------");
        Scanner s = new Scanner(System.in);
        String cad;

        System.out.print("Introduce una cadena: ");
        cad = s.nextLine();

        if (cad.length()==1 && (cad.compareTo("A")>=0 && cad.compareTo("Z")<=0)) {
        System.out.println("La cadena "+cad+" es may�scula");
        } else {
        System.out.println("La cadena "+cad+" no es may�scula");
        }
    }
}
