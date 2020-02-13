class Jugadores:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__puntos = 10

    @property
    def nombre(self):
        return self.__nombre

    @nombre.setter
    def nombre(self, value):
        self.__nombre = value

    @property
    def puntos(self):
        return self.__puntos

    @puntos.setter
    def puntos(self, value):
        self.__puntos = value

    def restar_puntos(self):
        self.__puntos -= 1
        