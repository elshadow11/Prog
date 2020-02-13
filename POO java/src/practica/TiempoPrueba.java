package practica;
import practica.Tiempo;
import java.util.Scanner;

public class TiempoPrueba {

	public static void main(String[] args) {
	int h;
	int m;
	int s;
  Tiempo t1 = new Tiempo(10,10,20);
  @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("T1: " + t1);
	System.out.println("Horas a sumar a " + t1);
  h = Integer.parseInt(scanner.nextLine());
	t1.sumaHoras(h);
	System.out.println("Ahora T1 es " + t1);
	System.out.println("Horas a restar a " + t1);
	h = Integer.parseInt(scanner.nextLine());
	t1.restaHoras(h);
	System.out.println("Ahora T1 es " + t1);
	
	System.out.println("T1: " + t1);
	System.out.println("Minutos a sumar a " + t1);
  m = Integer.parseInt(scanner.nextLine());
	t1.sumaMinutos(m);
	System.out.println("Ahora T1 es " + t1);
	System.out.println("Minutos a restar a " + t1);
	m = Integer.parseInt(scanner.nextLine());
	t1.restaMinutos(m);
	System.out.println("Ahora T1 es " + t1);

	System.out.println("T1: " + t1);
	System.out.println("Segundos a sumar a " + t1);
  s = Integer.parseInt(scanner.nextLine());
	t1.sumaSegundos(s);
	System.out.println("Ahora T1 es " + t1);
	System.out.println("Segundos a restar a " + t1);
	s = Integer.parseInt(scanner.nextLine());
	t1.restaSegundos(s);
	System.out.println("Ahora T1 es " + t1);

	System.out.println("Para sumar T2 a T1 introduce los valores de T2");
	System.out.println("Horas de T2: ");
  h = Integer.parseInt(scanner.nextLine());
	System.out.println("Minutos de T2: ");
  m = Integer.parseInt(scanner.nextLine());
	System.out.println("Segundos de T2: ");
  s = Integer.parseInt(scanner.nextLine());
	Tiempo t2 = new Tiempo(h, m, s);
	t1.suma(t2);
	System.out.println("Ahora T1 es " + t1);

	System.out.println("Para restar T2 a T1 introduce los valores de T2");
	System.out.println("Horas de T2: ");
  h = Integer.parseInt(scanner.nextLine());
	System.out.println("Minutos de T2: ");
  m = Integer.parseInt(scanner.nextLine());
	System.out.println("Segundos de T2: ");
  s = Integer.parseInt(scanner.nextLine());
	t2 = new Tiempo(h, m, s);
	t1.resta(t2);
	System.out.println("Ahora T1 es " + t1);
	}
}