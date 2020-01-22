"""
Crea métodos para:

    Contruir un objeto Fraccion pasándole el numerador y el denominador.
    Obtener la fracción como cadena de caracteres.
    Obtener y modificar numerador y denominador. No se puede dividir por cero.
    Obtener resultado de la fracción (número real).
    Multiplicar la fracción por un número.
    Multiplicar, sumar y restar fracciones.
    Simplificar la fracción.

"""


class Fraccion:

    def __init__(self, num, den):
        """
        Constructor de clase

        :param num:
        :param den:
        """
        self.__num = num
        self.__den = den

    # Propiedades

    @property
    def num(self):
        return self.num

    @num.setter
    def num(self, value):
        self.num = value

    @property
    def den(self):
        return self.den

    @den.setter
    def den(self, value):
        self.num = value

    def __str__(self):
        