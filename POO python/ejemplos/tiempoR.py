"""
Crea métodos para:

    Sumar y restar otro objeto de la clase Tiempo.
    Sumar y restar segundos, minutos y/o horas.
    Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s

Realiza un programa de prueba para comprobar que la clase funcione bien.
"""


class Tiempo:
    """
    Los objetos de la clase TIempo son intervalos de tiempo y se crean de la forma:

    t = Tiempo(1, 20, 30)

    donde los parámetros que se le pasan al constructor son las horas, los minuto y los segundos.
    """

    def __init__(self, horas, minutos, segundos):  # Parametros para definir a el constructor
        """
        Constructor de clase.
        Lanza una excepción en caso de valores incorrectos
        :param horas:
        :param minutos:
        :param segundos:
        """
        assert horas >= 0 and 0 <= minutos < 60 and 0 <= segundos < 60
        # Esto permite que si la condición no se cumple se lance una excepción

        self.__horas = horas
        self.__minutos = minutos
        self.__segundos = segundos

    # Propiedades

    """
    No nos piden modificar los valores pero si queremos poner setters debemos añadir que se compruebe que los valores no
    están por encima o por debajo de lo permitido

    """

    @property
    def horas(self):
        return self.__horas

    @property
    def minutos(self):
        return self.__minutos

    @property
    def segundos(self):
        return self.__segundos

    # Resto métodos

    def __str__(self):  # Metodo para formatear salida de la hora, __str__ es el mejor nombre
        return f"{self.horas}h {self.minutos}m {self.segundos}s"

    # sumar y restar horas
    def suma_horas(self, horas):
        """
        Suma horas al objeto, Si el resultado es negativo lanza una excepción
        :param horas:
        :return:
        """
        assert self.horas + horas > 0
        self.__horas += horas

    def resta_horas(self, horas):
        """
        Restar horas al objeto, Si el resultado es negativo lanza una excepción
        :param horas:
        :return:
        """
        self.suma_horas(-horas)  # Así nos ahorramos escribir una instrucción

    def suma_minutos(self, minutos):
        """
        Suma minutos al objeto. Si las horas finales son negativas lanza una excepción
        :param minutos:
        :return:
        """
        seg = Tiempo.__segundos_total(self) + minutos * 60
        assert seg >= 0  # si los segundos son negativos el estado es inconsistente
        result = Tiempo.__segundos_a_tiempo(seg)
        self.__horas, self.__minutos, self.__segundos = result.horas, result.minutos, result.segundos

    def resta_minutos(self, minutos):
        self.suma_minutos(-minutos)

    def suma_segundos(self, segundos):
        """
        Suma minutos al objeto. Si las horas finales son negativas lanza una excepción
        :param segundos:
        :return:
        """
        seg = Tiempo.__segundos_total(self) + segundos
        assert seg >= 0  # si los segundos son negativos el estado es inconsistente
        result = Tiempo.__segundos_a_tiempo(seg)
        self.__horas, self.__minutos, self.__segundos = result.horas, result.minutos, result.segundos

    def resta_segundos(self, segundos):
        self.suma_segundos(-segundos)

    def suma(self, t):
        """
        Suma otro objeto tiempo.
        :param t:
        :return:
        """
        seg = Tiempo.__segundos_total(self) + t.horas * 3600 + t.minutos * 60 + t.segundos
        result = Tiempo.__segundos_a_tiempo(seg)
        self.__horas, self.__minutos, self.__segundos = result.horas, result.minutos, result.segundos

    def resta(self, t):
        """
        Resta otro objeto tiempo. Si las horas finales son negativas lanza una excepción
        :param t:
        :return:
        """
        seg = Tiempo.__segundos_total(self) - t.horas * 3600 - t.minutos * 60 - t.segundos
        assert seg >= 0  # si el tiempo son negativos el estado es inconsistente
        result = Tiempo.__segundos_a_tiempo(seg)
        self.__horas, self.__minutos, self.__segundos = result.horas, result.minutos, result.segundos

    # Métodos estáticos

    @staticmethod
    def __segundos_total(t):
        return t.horas * 3600 + t.minutos * 60 + t.segundos

    @staticmethod
    def __segundos_a_tiempo(s):
        horas = s // 3600
        s = s % 3600
        minutos = s // 60
        segundos = s % 60
        return Tiempo(horas, minutos, segundos)


if __name__ == '__main__':  # CLarisimo
    t1 = Tiempo(10, 10, 10)
    print(f"T1: {t1}")
    h = int(input(f"Horas a sumar a {t1}"))
    t1.suma_horas(h)
    print(f"Ahora T1 es {t1}")
    m = int(input(f"Minutos a sumar a {t1}"))
    t1.suma_minutos(m)
    print(f"Ahora T1 es {t1}")
    s = int(input(f"Segundos a sumar a {t1}"))
    t1.suma_segundos(s)
    print(f"Ahora T1 es {t1}")
