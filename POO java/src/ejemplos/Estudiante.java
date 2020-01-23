package ejemplos;

import ejemplos.Persona.Persona;

public class Estudiante extends Persona{

	public Estudiante(String nombre, boolean pelo) {
		super(nombre, pelo);
		
	}
	void estudiar(){
		System.out.print(super.nombre + " está estudiando");
		
	}
}