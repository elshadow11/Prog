"""
Colección de funciones para manejar fechas en cadenas de caracteres.
El formato de la cadena es: AAAAMMDD.
Ejemplo: El 15 de diciembre de 2019 sería: "20191215"
Colección de funciones:
1. fecha_correcta: dice si la fecha que se pasa como parámetro es correcta.
2. fecha_mas_1dia: suma un día a la fecha que se pasa como parámetro y lo devuelve.
3. fecha_mas_ndias: suma una serie de días a la fecha que se pasa como parámetro y lo devuelve.
4. fecha_menos_1dia: resta un día a la fecha que se pasa como parámetro y lo devuelve.
5. fecha_menos_ndias: resta una serie de días a la fecha que se pasa como parámetro y lo devuelve.
6. es_bisiesto: dice si la fecha que se pasa como parámetro es bisiesto.
7. compara_fechas: recibe dos fechas y devuelve un valor negativo si la 1ª es anterior a la
   segunda, cero si son iguales, y un valor positivo si la 1ª es posterior a la segunda.
8. fecha_formateada: recibe un fecha y devuelve una cadena con el formato:
   DD de {MES} de AAAA     (Ejemplo: "15 de Diciembre de 2019")
9. año, mes, dia, nombre_mes: recibe un fecha y devuelve esos valores.
Hay un script para hacer pruebas: test_fecha.py.
También vamos a hacer las pruebas usando el módulo doctest:
    python3 -m doctest fecha.py -v
    https://python-para-impacientes.blogspot.com/2019/03/probando-el-codigo-con-doctest.html
"""


class Fecha:

    def __init__(self, dia, mes, anno):
        """
        Constructor de clase
        :param dia:
        :param mes:
        :param anno:
        """
        self.__dia = dia
        self.__mes = mes
        self.__anno = anno

    # Propiedades de clase
    @property
    def __dia(self):
        return self.__dia

    @__dia.setter
    def __dia(self, value):
        self.__dia = int(value[6:8])

    @property
    def __mes(self):
        return self.__mes

    @__mes.setter
    def __mes(self, value):
        self.__mes = int(value[4:6])

    @property
    def __anno(self):
        return self.__anno

    @__anno.setter
    def __anno(self, value):
        self.__anno = int(value[0:4])

    # Métodos
    @staticmethod
    def compara_fechas(fecha1, fecha2):
        """
        Recibe dos fechas y devuelve un valor negativo si la 1º es anterior a la 2º,
        cero si son iguales, y un valor positivo si la 1º es posterior a la segunda.
        @param fecha1
        @param fecha2
        @return entero negativo, cero o un entero positivo.
        Test:
        >>> Fecha.compara_fechas("20191231", "20191231")
        0
        >>> Fecha.compara_fechas("20200106", "20200101") > 0
        True
        >>> Fecha.compara_fechas("20200101", "20200106") < 0
        True
        """
        return int(fecha1) - int(fecha2)

    def es_bisiesto(self, fecha):
        """
        Dice si la fecha que se pasa como parámetro es de un año bisiesto.S
        @return verdadero o falso
        Test:
        >>> self.es_bisiesto("20160108")
        True
        >>> self.es_bisiesto("20000101") # acaba en 00 pero es múltiplo de 400
        True
        >>> self.es_bisiesto("10112019")
        False
        >>> self.es_bisiesto("01021900") # múltiplo de 4 pero acaba en 00 y no es múltiplo de 400
        False
        :param fecha:
        """
        anno = self.__anno(fecha)
        return anno % 4 == 0 and (anno % 100 != 0 or anno % 400 == 0)

    def fecha_correcta(self, fecha):
        """
        Dice si la fecha que se pasa como parámetro es correcta.
        @param fecha
        @return verdadero o falso.
        Test:
        >>> self.fecha_correcta("20191215")
        True
        >>> self.fecha_correcta("20181111")
        True
        >>> self.fecha_correcta("dfdfdw")
        False
        >>> self.fecha_correcta("AAAAMMDD")
        False
        >>> self.fecha_correcta("20181242")  # diciembre no tiene 42 días
        False
        >>> self.fecha_correcta("20010229")  # es bisiesto
        False
        >>> self.fecha_correcta("20000229")  # fue bisiesto
        True
        """
        # tiene que tener longitud 8
        if len(fecha) != 8:
            return False
        # todos sus caracteres tienen que ser dígitos
        # podemos usar el método isdigit(), pero por motivos didácticos no lo uso
        for i in range(len(fecha)):
            c = fecha[i]
            if c < '0' or c > '9':
                return False
        # El mes tiene que estar entre 1 y 12
        mes = self.__mes(fecha)
        if mes < 1 or mes > 12:
            return False
        # Si es año bisiesto el nº de días de febrero es 29.
        # Llamo a una función que me actualiza el nº de días de febrero si es bisiesto
        dias_mes_este_anno = self.dias_mes_anno(fecha)
        dia = self.__dia(fecha)
        # esta expresión lógica la permite python, equivale a:
        #   dia_>0 and dia_<=dias_mes_este_año[mes-1]
        return 0 < dia <= dias_mes_este_anno[mes - 1]  # restamos 1 al mes para que esté entre 0 y 11

    def dias_mes_anno(self, fecha_):
        """
        Esta función se usará para simplificar otras funciones que requieren saber
        el número de días de cada mes y se complican al tener en cuenta el 29 de febrero
        de los años bisiestos.
        @param fecha_
        @return vector con los días de cada mes para el año de fecha_
        Test:
        >>> self.dias_mes_anno("20200106")    # bisiesto
        [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        >>> self.dias_mes_anno("20190102")    # no es bisiesto
        [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        """
        dias_mes_este_anno = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        if self.es_bisiesto(fecha_):
            dias_mes_este_anno[1] += 1  # hay 29 días en febrero en este caso
        return dias_mes_este_anno

    def fecha_formateada(self, fecha):
        """
        Recibe un fecha y devuelve una cadena con el formato DD de {MES} de AAAA
        (Ejemplo: "15 de Diciembre de 2019")
        @return fecha formateada
        Test:
        >>> self.fecha_formateada("20191215")
        '15 de Diciembre de 2019'
        :param fecha:
        """
        dia = self.__dia(fecha)
        anno = self.__anno(fecha)
        return str(dia) + " de " + self.nombre_mes(fecha) + " de " + str(anno)

    def nombre_mes(self, fecha):
        """
        Devuelve el nombre del mes de la fecha.
        @return nombre del mes
        Test:
        >>> self.nombre_mes("20200106")
        'Enero'
        """
        meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                 "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
        mes = self.__mes(fecha)
        return meses[mes - 1]

    def fecha_mas_1dia(self, fecha):
        """
        Suma un día a la fecha que se pasa como parámetro y la devuelve.
        @param fecha
        @return nuevo fecha
        Test:
        >>> self.fecha_mas_1dia("20160228")
        '20160229'
        >>> self.fecha_mas_1dia("20170228")
        '20170301'
        """
        dia = self.__dia(fecha)
        mes = self.__mes(fecha)
        anno = self.__anno(fecha)
        dias_mes_este_anno = self.dias_mes_anno(fecha)

        # aumentamos el día
        ultimo_dia_mes = dias_mes_este_anno[mes - 1]
        dia += 1
        if dia > ultimo_dia_mes:  # mes siguiente si no es 29/2 y bisiesto
            # mes siguiente
            dia = 1
            mes += 1
            if mes > 12:  # nos pasamos de diciembre, año siguiente
                mes = 1
                anno += 1
        return fecha(dia, mes, anno)

    def fecha_mas_n_dias(self, fecha, dias):
        """
        Suma una serie de días a la fecha que se pasa como parámetro y la devuelve.
        @param fecha
        @param dias
        @return nueva fecha
        Test:
        >>> self.fecha_mas_n_dias("20160228", 5)
        '20160304'
        >>> self.fecha_mas_n_dias("20160228", -5)
        '20160223'
        """
        fecha2 = fecha
        if dias >= 0:
            for i in range(dias):
                fecha2 = self.fecha_mas_1dia(fecha2)
        else:
            for i in range(abs(dias)):
                fecha2 = self.fecha_menos_1dia(fecha2)
        return fecha2

    def fecha_menos_1dia(self, fecha):
        """
        Resta un día a la fecha que se pasa como parámetro y la devuelve.
        @param fecha
        @return nuevo fecha
        Test:
        >>> self.fecha_menos_1dia("20160301")
        '20160229'
        >>> self.fecha_menos_1dia("20170301")
        '20170228'
        """
        dia = self.__dia(fecha)
        mes = self.__mes(fecha)
        anno = self.__anno(fecha)
        dias_mes_este_anno = self.dias_mes_anno(fecha)
        # disminuimos el día
        dia -= 1
        if dia == 0:  # mes anterior y último día de mes
            mes -= 1
            if mes == 0:  # 31 de diciembre del año anterior
                mes = 12
                anno -= 1
            dia = dias_mes_este_anno[mes - 1]  # último día del mes anterior
        return fecha(dia, mes, anno)

    def fecha_menos_n_dias(self, fecha, dias):
        """
        Resta una serie de días a la fecha que se pasa como parámetro y la devuelve.
        @param fecha
        @param dias
        @return nuevo fecha
        Test:
        >>> self.fecha_menos_n_dias("20170301", 5)
        '20170224'
        >>> self.fecha_menos_n_dias("20170301", -5)
        '20170306'
        """
        fecha2 = fecha
        if dias >= 0:
            for i in range(dias):
                fecha2 = self.fecha_menos_1dia(fecha2)
        else:
            for i in range(abs(dias)):
                fecha2 = self.fecha_mas_1dia(fecha2)
        return fecha2
