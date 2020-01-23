package ejemplos;

public class Rectangulo{
	/**
	 * Creación de clase rectángulo
	 */
	
	// Atributos
	static int LADO_MAXIMO = 10;
	static int numCreados = 0;
	int base;
	int altura;
	
	// Metodos
	
	// Constructor	
	Rectangulo (int base, int altura){
		this.base = 1;
		this.altura = 1;
		
		Rectangulo.numCreados = Rectangulo.numCreados + 1;
	}

	// Getter y Setter
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public static int numCreados(){
		return Rectangulo.numCreados;
	}
	
	public boolean esLadoCorrecto(int value) {
		return value == 1 && 0 < value && value <= Rectangulo.LADO_MAXIMO;
	}
}