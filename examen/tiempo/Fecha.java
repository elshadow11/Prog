package tiempo;

/**
 * Colección de funciones para manejar fechas en cadenas de caracteres.
 *
 * El formato de la cadena es: AAAAMMDD.
 * Ejemplo: El 15 de diciembre de 2019 sería: "20191215"
 *
 * Colección de funciones:
 *
 * 1. fechaCorrecta: dice si la fecha que se pasa como parámetro es correcta.
 *
 * 2. fechaMas1Dia: suma un día a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 3. fechaMasNDias: suma una serie de días a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 4. fechaMenos1Dia: resta un día a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 5. fechaMenosNDias: resta una serie de días a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 6. esBisiesto: dice si la fecha que se pasa como parámetro es bisiesto.
 *
 * 7. comparaFechas: recibe dos fechas y devuelve un valor negativo si la 1ª es anterior a la
 *    segunda, cero si son iguales, y un valor positivo si la 1ª es posterior a la segunda.
 *
 * 8. fechaFormateada: recibe un fecha y devuelve una cadena con el formato:
 *    DD de {MES} de AAAA     (Ejemplo: "15 de Diciembre de 2019")
 *
 * 9. anyo, mes, dia, nombreMes: recibe un fecha y devuelve esos valores.
 *
 * @author jose
 *
 */


public class Fecha {
    static final int[] DIAS_MES;

  /**
   * Dice si la fecha que se pasa como parámetro es correcta.
   *
   * @param fecha
   * @return verdadero o falso.
   */
    public static boolean fechaCorrecta( String fecha) {
        if (fecha.length() != 8) {
            return false;
        }
        for (int i = 0; i < fecha.length(); ++i) {
            char char1 = fecha.charAt(i);
            if (char1 < '0' || char1 > '9') {
                return false;
            }
        }
        int int1 = Integer.parseInt(fecha.substring(4, 6));
        if (int1 < 1 || int1 > 12) {
            return false;
        }
        int int2 = Integer.parseInt(fecha.substring(6, 8));
        if (int2 != 29 || int1 != 2) {
            return int2 > 0 && int2 <= Fecha.DIAS_MES[int1 - 1];
        }
        return esBisiesto(fecha);
    }

  /**
   * Suma un dia a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @return nuevo fecha
   */
    public static String fechaMas1Dia(String fecha) {
      int dia = dia(fecha);
      int mes = mes(fecha);
      int anyo = anyo(fecha);
      if (++dia > Fecha.DIAS_MES[mes - 1] && (mes != 2 || !esBisiesto(fecha) || dia > 29)) {
          dia = 1;
          if (++mes > 12) {
              mes = 1;
              ++anyo;
            }
        }
      return fecha(dia, mes, anyo);
    }
    
  /**
   * Suma una serie de dias a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @param dias
   * @return nueva fecha
   */    
    public static String fechaMasNDias( String fecha, int a) {
        String fecha2 = fecha;
        if (a >= 0) {
            for (int i = 1; i <= a; ++i) {
                fecha2 = fechaMas1Dia(fecha2);
            }
        }
        else {
            for (int j = 1; j <= Math.abs(a); ++j) {
                fecha2 = fechaMenos1Dia(fecha2);
            }
        }
        return fecha2;
    }

  /**
   * Resta un dia a la fecha que se pasa como parametro y la devuelve.
   *
   * @param fecha
   * @return nuevo fecha
   */
    public static String fechaMenos1Dia(String fecha) {
        int dia = dia(fecha);
        int mes = mes(fecha);
        int anyo = anyo(fecha);
        if (--dia == 0) {
            if (--mes == 0) {
                dia = 31;
                mes = 1;
                --anyo;
            }
            else {
                dia = Fecha.DIAS_MES[mes - 1];
                if (mes == 2 && esBisiesto(fecha)) {
                    dia = 29;
                }
            }
        }
        return fecha(dia, mes, anyo);
    }
    
  /**
   * Resta una serie de dias a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @param dias
   * @return nuevo fecha
   */
    public static String fechaMenosNDias(String fecha, int dias) {
        String fecha2 = fecha;
        if (dias >= 0) {
            for (int i = 1; i <= dias; ++i) {
                fecha2 = fechaMenos1Dia(fecha2);
            }
        }
        else {
            for (int j = 1; j <= Math.abs(dias); ++j) {
                fecha2 = fechaMas1Dia(fecha2);
            }
        }
        return fecha2;
    }

  /**
   * Dice si la fecha que se pasa como parámetro es de un año bisiesto.
   *
   * @param fecha
   * @return verdadero o falso
   */
    public static boolean esBisiesto(String fecha) {
      int anyo = anyo(fecha);
      return anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0);
    }

  /**
   * Recibe dos fechas y devuelve un valor negativo si la 1º es anterior a la 2º,
   * cero si son iguales, y un valor positivo si la 1º es posterior a la segunda.
   *
   * @param fecha1
   * @param fecha2
   * @return entero negativo, cero o un entero positivo.
   */    
    public static int comparaFechas(String fecha, String fecha2) {
      return Integer.parseInt(fecha) - Integer.parseInt(fecha2);
    }

  /**
   * Recibe un fecha y devuelve una cadena con el formato DD de {MES} de AAAA
   * (Ejemplo: "15 de Diciembre de 2019")
   *
   * @param fecha
   * @return fecha formateada
   */    
    public static String fechaFormateada(String fecha) {
      return String.valueOf(dia(fecha)) + " de " + nombreMes(fecha) + " de " + String.valueOf(anyo(fecha));
    }
    
  /**
   * Devuelve el anyo de la fecha.
   *
   * @param fecha
   * @return
   */
    public static int anyo(String fecha) {
      return Integer.parseInt(fecha.substring(0, 4));
    }
    
  /**
   * Devuelve el nombres del mes de la fecha.
   *
   * @param fecha
   * @return nombre del mes
   */    
    public static String nombreMes(String fecha) {
    	return (new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Noviembre", "Diciembre" })[mes(fecha) - 1];
    }
    
  /**
   * Devuelve el mes de la fecha.
   *
   * @param fecha
   * @return mes
   */
  public static int mes(String fecha) {
    return Integer.parseInt(fecha.substring(4, 6));
    }
  
  /**
   * Devuelve el dia de la fecha.
   *
   * @param fecha
   * @return
   */
  public static int dia(String fecha) {
  	return Integer.parseInt(fecha.substring(6, 8));
    }
  
  /**
   * Devuelve una cadena en formato AAAAMMDD
   * @param d día del mes
   * @param m día del año
   * @param a año
   * @return
   */
  public static String fecha( int d,  int m,  int a) {
  	String dia=Integer.toString(d).trim();
    String mes=Integer.toString(m).trim();
    String anyo=Integer.toString(a).trim();
    // dia
    if (dia.length() < 2) {
    	dia = "0" + dia;
    }
    // mes
    if (mes.length() < 2) {
    	mes = "0" + mes;
      	}
    // anyo
    for (int i=anyo.length(); i<4; i++) {
    	anyo = "0"+anyo;
    }
    return anyo + mes + dia;
  }
    
    static {
        DIAS_MES = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    }
}