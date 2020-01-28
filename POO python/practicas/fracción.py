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


def mcd(n1, n2):
    """
    maximo comun divisor
    :param n1:
    :param n2:
    :return:
    """
    maxcomdiv = 0
    a = max(n1, n2)
    b = min(n1, n2)
    while b != 0:
        maxcomdiv = b
        b = a % b
        a = maxcomdiv
    return maxcomdiv


def mcm(n1, n2):
    """
    minimo comun multiplo
    :param n1:
    :param n2:
    :return:
    """
    a = max(n1, n2)
    b = min(n1, n2)
    mincommul = (a / mcd(a, b)) * b
    return mincommul


class Fraccion:

    def __init__(self, num, den):
        """
        Constructor de clase

        :param num:
        :param den:
        """
        self.__num = int(num)
        self.__den = int(den)

    # Propiedades

    @property
    def num(self):
        return self.__num

    @num.setter
    def num(self, value):
        self.__num = value

    @property
    def den(self):
        return self.__den

    @den.setter
    def den(self, value):
        self.__den = value

    # Metodos

    @staticmethod
    def pedir_fraccion():
        den2 = int(input("introduce denominador: "))
        num2 = int(input("introduce numerador: "))
        f2 = Fraccion(num2, den2)
        return f2

    def __str__(self):
        """
        Formato de salida de fracción
        :return:
        """
        return f"{self.__num}/{self.__den}"

    def modificar_fraccion(self):
        """
        Metodo para modificar numerador y denominador,
        :return:
        """
        print(self)
        self.__num = int(input("Introduce un nuevo numerador: "))

        d = 0
        while d == 0:
            d = int(input("Introduce un nuevo denominador: "))
            if d == 0:
                print("El denominador no puede ser 0")

        self.__den = d
        print(f"La nueva fracción es {self}")

    def modificar_fracciones(self):
        """
        Metodo para modificar numerador y denominador,
        :return:
        """
        print(self)
        self.__num = int(input("Introduce un nuevo numerador: "))

        d = int(input("Introduce un nuevo denominador: "))
        assert d < 0
        self.__den = d
        print(f"La nueva fracción es {self}")

    def resultado(self):
        """
        esto nos da el resultado de la fracción
        :return:
        """

        return self.__num / self.__den

    def multiplicacion(self, n1):
        """
        Metodo para calcular la multiplicacion de f por un numero
        :param n1:
        :return:
        """
        return self.resultado() * n1

    def multiplicar_fraccion(self):
        """
        Metodo para multiplicar fracciones
        :return:
        """
        print("vamos a multiplicar dos fracciones")
        f2 = self.pedir_fraccion()
        num3 = self.__num * f2.num
        den3 = self.__den * f2.den
        f3 = Fraccion(num3, den3)
        return f3

    def restar_fraccion(self):
        """
        Metodo para restar fracciones
        :return:
        """
        print("vamos a restar dos fracciones")
        f2 = self.pedir_fraccion()

        if self.__den == f2.den:
            den3 = self.__den
            num3 = self.__num - f2.num
        else:
            den3 = mcm(self.__den, f2.den)
            num3 = (den3 / self.den) * self.num - (den3 / f2.den) * f2.num

        f3 = Fraccion(num3, den3)
        return f3

    def sumar_fraccion(self):
        """
        Metodo para sumar fracciones
        :return:
        """
        print("vamos a sumar dos fracciones")
        f2 = self.pedir_fraccion()

        if self.__den == f2.den:
            den3 = self.__den
            num3 = self.__num + f2.num

        else:
            den3 = int(mcm(self.__den, f2.den))
            num3 = int((den3 / self.den) * self.num + (den3 / f2.den) * f2.num)
        f3 = Fraccion(num3, den3)
        return f3

    def simplificar_fraccion(self):
        return f"{int(self.__den / mcd(self.__den, self.__num))}/{int(self.__num / mcd(self.__den, self.__num))} "
