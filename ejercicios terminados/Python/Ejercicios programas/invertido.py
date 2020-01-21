#Programa: invertido.py
#Propósito: Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# c sera el numero en cuestión
# 
#Algoritmo:
# LEER c
# c <-- int(c[::-1])
# ESCRIBIR c
print("Invertir número de 2 cifras")
print("--------------------------\n")

#Leemos los datos
c = str(input("Introduce un número de dos cifras: "))

#Invertimos
c = int(c[::-1])

#Escribimos el resultado
print("El numero invertido es: ", c)
