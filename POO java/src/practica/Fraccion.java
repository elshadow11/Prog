package practica;
import java.util.Scanner;

public class Fraccion {
	int num;
	int den;
	Scanner scanner = new Scanner(System.in);

	Fraccion (int num, int den){
		this.num = num;
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public String toString() {
		return this.num + "/" + this.den;
			}
	public void modificarFraccion() {
		int d;
		System.out.println(this);
		System.out.println("Introduce un nuevo numerador: ");
		this.num = Integer.parseInt(scanner.nextLine());
		
		d = 0;
		while (d == 0) {
			System.out.println("Introduce un nuevo denominador: ");
			this.den = Integer.parseInt(scanner.nextLine());
			if (d == 0) {
				System.out.println("El denominador no puede ser 0");
			}
		}
		this.den = d;
		System.out.println("La nueva fracción es " + this);

	}
	public int resultado() {
		return this.num / this.den;
	}
	
	
}