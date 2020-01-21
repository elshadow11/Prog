class Tiempo:

    def __init__(self, horas, minutos, segundos):
        """
        Constructor de la clase
        :param t:

        """
        self.__horas = 1
        self.__minutos = 1
        self.__segundos = 1

        self.horas = horas
        self.minutos = minutos
        self.segundos = segundos

    # Propiedades

    @property
    def horas(self):
        return self.__horas

    @horas.setter
    def horas(self, value):
        self.__horas = value

    @property
    def minutos(self):
        return self.__minutos

    @minutos.setter
    def minutos(self, value):
        self.__minutos = value

    @property
    def segundos(self):
        return self.__segundos

    @segundos.setter
    def segundos(self, value):
        self.__segundos = value

    # Métodos

    def __str__(self):
        return f"{self.__horas}h {self.__minutos}m {self.__segundos}s "

