package ejemplos;

import ejemplos.Persona.Persona;

class Main{
	public static void Main(String[]args){
		
		Persona p1 = new Persona("Paco", true);
		p1.dormir();
		
		Persona p2 = new Persona("Maria",true);
		p2.dormir();
		
		Persona p3 = new Estudiante("manu", false);
		p3.dormir();
		
		Estudiante e1 = new Estudiante("ramon", false);
		e1.dormir();
		
	}
}