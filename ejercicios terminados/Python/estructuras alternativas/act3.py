#Programa: act3.py
#Propósito: leer un número y sabe si es par o impar
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# n1 es el número que introduce el usuario
#
#Algoritmo:
# LEER n1
# realizar una división entre 2
# si el resultado da 0 es par si da algo distinto de 0 es impar
# Escribimos le resultado

print("Saber si un número es par o impar")
print("----------------------------------\n")

# Leemos los datos
n1 = int(input("Introduce un número para comprobar: "))

#Realizamos la comprobación y mostramos por pantalla
if n1 % 2 == 0:
    print(f"{n1} es un número par")
else: 
    print(f"{n1} es un número impar")
