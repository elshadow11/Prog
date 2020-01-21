#Programa: act1.py
#Propósito: Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# n1 y n2 serán los número que vamos a pedir al usuario
# 
#Algoritmo:
# LEER n1,n2
# Comparar n1 y n2
# Escribir si n1 es mayor o menor que n2

print("Comparación entre dos números")
print("-------------------------------\n")

#Leemos los datos

n1 = int(input("Introduce el primer número: "))
n2 = int(input("Introduce el segundo número: "))

#Comparamos y mostramos el resultado en pantalla

if n1 > n2:
    print(f"{n1} es mayor que {n2}")
else:
    print(f"{n1} es menor que {n2}")
