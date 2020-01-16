#Programa: temperaturas.py 
#Propósito: Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# ºF será las temperatura en grados Farenheit
# ºc será en grados celsius
#
#Algoritmo:
# LEER F
#  c <--(F − 32) * 5 / 9
# 
#

print("Programa para convertir Farenheit a Celsius")
print("--------------------------------------------\n")

#leemos los grados que queremos pasar
F = int(input("Introduce la temperatura en grados Farenheit: "))

#Realizamos los cálculos
c = (F - 32) * 5 / 9

#Los mostramos en pantalla
print(F," Grados Farenheit son ", c, " grados Celsius")
