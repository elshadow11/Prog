class Fecha:
    def __init__(self, dia, mes, anyo):
        assert Fecha.es_correcta(dia, mes, anyo)
        self.__dia = dia
        self.__mes = mes
        self.__anyo = anyo

    # Propiedades
    @property
    def dia(self):
        return self.__dia

    @dia.setter
    def dia(self, value):
        assert Fecha.es_correcta(self.dia, self.mes, self.anyo)
        self.__dia = value

    @property
    def mes(self):
        return self.__mes

    @mes.setter
    def mes(self, value):
        assert Fecha.es_correcta(self.dia, self.mes, self.anyo)
        self.__mes = value

    @property
    def anyo(self):
        return self.__anyo

    @anyo.setter
    def anyo(self, value):
        assert Fecha.es_correcta(self.dia, self.mes, self.anyo)
        self.__anyo = value

    # Nombre del mes
    def nombre_mes(self):
        meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                 "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
        mes = self.__mes
        return meses[mes - 1]

    def __suma_1dia(self):

        dia = self.__dia + 1
        mes = self.__mes
        anyo = self.__anyo
        # aumentamos el día
        if dia > self.dias_mes(self.mes, self.__anyo):  # mes siguiente si no es 29/2 y bisiesto
            # mes siguiente
            dia = 1
            mes += 1
            if mes > 12:  # nos pasamos de diciembre, año siguiente
                mes = 1
                anyo += 1

        return Fecha(dia, mes, anyo)

    def __resta_1dia(self):

        dia = self.__dia - 1
        mes = self.__mes
        anyo = self.__anyo
        # aumentamos el día
        if dia == 0:
            mes -= 1
            if mes == 0:
                mes = 12
                anyo -= 1
            dia = Fecha.dias_mes(mes, anyo)
        return Fecha(dia, mes, anyo)

    # Sobrecarga
    def __str__(self):

        return f"{self.dia} de {self.nombre_mes()} del {self.anyo} "

    def __gt__(self, other):
        pass

    def __lt__(self, other):
        pass

    def __eq__(self, other):
        pass

    def __add__(self, n):
        f = self
        if n > 0:
            for i in range(n):
                f = f.__suma_1dia()
        else:
            for i in range(abs(n)):
                f = f.__resta_1dia()
        return f

    def __radd__(self, n):
        return self + n

    def __sub__(self, n):
        return self + -1*n

    # Metodos estáticos
    @staticmethod
    def es_bisiesto(anyo):
        return anyo % 400 == 0 or (anyo % 4 == 0 and anyo % 100 != 0)

    @staticmethod
    def es_correcta(dia, mes, anyo):
        if not isinstance(dia, int) or not isinstance(mes, int) or not isinstance(anyo, int):
            return False
        if anyo < 0:
            return False

        if mes < 1 or mes > 12:
            return False

        dias_mes = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        if Fecha.es_bisiesto(anyo):
            dias_mes[1] = 29
            return dia > 0 and dias_mes[mes - 1]

    @staticmethod
    def comparar_fechas(fecha1, fecha2):
        int(fecha1) - int(fecha2)

    @staticmethod
    def dias_mes(mes, anyo):

        dias_mes_ = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        if Fecha.es_bisiesto(anyo):
            dias_mes_[1] += 29  # hay 29 días en febrero en este caso
        return dias_mes_[mes - 1]
