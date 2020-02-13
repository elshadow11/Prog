package practica;

public class Tiempo {
	int horas;
	int minutos;
	int segundos;
	
	Tiempo (int horas, int minutos, int segundos){
		
		if (horas >= 0 && 0 <= minutos && minutos < 60 && 0 <= segundos && segundos < 60) {
			this.horas = horas;
			this.minutos = minutos;
			this.segundos = segundos;
		}	
	}

	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public String toString() {
		return this.horas + "h" + this.minutos + "m" + this.segundos + "s";
	}
	
	public void sumaHoras (int horas) {
		if (this.horas + horas > 0) {
			this.horas += horas;
		}
	}
	
	public void restaHoras (int horas) {
		this.sumaHoras(-horas);
	}
	
	public void sumaMinutos (int minutos) {
		int seg;
		
		seg = Tiempo.segundosTotal(this) + minutos * 60;
		if (seg >= 0) {
			Tiempo result = (Tiempo) Tiempo.segundosAtiempo(seg);
			this.horas = result.horas;
			this.minutos  = result.minutos;
			this.segundos = result.segundos;
		}
	}
	
	public void restaMinutos (int minutos) {
		this.sumaMinutos(-minutos);
	}
	
	public void sumaSegundos (int segundos) {
		int seg;
		seg = Tiempo.segundosTotal(this) + segundos;
		if (seg >= 0) {
			Tiempo result = (Tiempo) Tiempo.segundosAtiempo(seg);
			this.horas = result.horas;
			this.minutos  = result.minutos;
			this.segundos = result.segundos;
		}
	}
	public void suma (Tiempo t) {
		int seg;
		seg = Tiempo.segundosTotal(this) + t.horas * 3600 + t.minutos * 60 + t.segundos;
    Tiempo result = (Tiempo) Tiempo.segundosAtiempo(seg);
		this.horas = result.horas;
		this.minutos  = result.minutos;
		this.segundos = result.segundos;
	}
	
	public void resta (Tiempo t) {
		int seg;
		seg = Tiempo.segundosTotal(this) - t.horas * 3600 - t.minutos * 60 - t.segundos;
    Tiempo result = (Tiempo) Tiempo.segundosAtiempo(seg);
		this.horas = result.horas;
		this.minutos  = result.minutos;
		this.segundos = result.segundos;
	}
	
	public void restaSegundos (int segundos) {
		this.sumaSegundos(-segundos);
	}
	
	private static int segundosTotal(Tiempo t) {
		return t.horas * 3600 + t.minutos * 60 + t.segundos;
	}

	public static Object segundosAtiempo (int s) {
		int horas;
		int minutos;
		int segundos;
		
		horas =  (int) Math.floor(s/3600);
		s = s % 3600;
		minutos = (int) Math.floor(s/60);
		segundos = s % 60;
		return new Tiempo(horas, minutos, segundos);
	}
}
