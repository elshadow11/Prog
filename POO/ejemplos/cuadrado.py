from ejemplos.rectangulo import Rectangulo


class Cuadrado(Rectangulo):
    """
    Implementamos la clase Cuadrado partiendo de la clase Rectángulo.
    Consideramos que un cuadrado es un rectánfulo con base==altura.
    """

    def __init__(self, lado):
        super().__init__(lado, lado)

    @property
    def lado(self):
        return self.__base

    @lado.setter
    def lado(self, value):
        self.base = value
        self.altura = value
