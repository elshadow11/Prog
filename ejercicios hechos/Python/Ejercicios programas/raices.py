#Programa: raices.py
#Propósito: Calcular la raíz cuadrada y la raíz cúbica de un número
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# n1 es el numero que vamos a usar
# sq1 es la raíz cuadrada
# sq2 es la raíz cúbica
# 
#Algoritmo:
# LEER n1
# sq1 <-- math.sqrt(n1)
# sq2 <-- n1 ** (1/3)
# ESCRIBIR sq1 y sq2

print("Calcular la raíz cuadrada y la raíz cúbica")
print("------------------------------------------\n")
import math

#Leemos los datos
n1 = int(input("Ingrese un número: "))

#Calculamos
sq1 = math.sqrt(n1)
sq2 = n1 ** (1/3)

#Escribimos los resultados
print("El resultado de la raíz cuadrada es ", sq1, " y el de la raíz cúbica es ", sq2)
