#Programa: hipotenusa.py
#Propósito: Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 10/10/2019
#
#Variables a usar:
# a,b que serán los catetos.
# hipotenusa será el resultado del programa.
#
#Algoritmo:
# LEER a,b
# hipotenusa ** 2 <-- math.sqrt(a**2 + b**2)
# hipotenusa <-- round(hipotenusa, 2)
# ESCRIBIR hipotenusa

import math
print("Resolución de la hipotenusa de un triángulo rectangulo")
print("-------------------------------------------------------\n")

#Leemos los datos

a = int(input("Introduce un cateto: "))
b = int(input("Introduce el segundo cateto: "))

# Calculamos

hipotenusa = math.sqrt(a ** 2 + b ** 2)
hipotenusa = round(hipotenusa, 2)

#mostramos el resultado
print("El resultado de la hipotenusa es: ",hipotenusa)
