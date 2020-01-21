#Programa: calculos.py
#Propósito: Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# n1 y n2 que serán los números que usaremos en los cálculos
#
#Algoritmo:
# LEER n1,n2
# Escribir n1 + n2
# Escribir n1 - n2
# Escribir n1 / n2
# Escribir n1 * n2

print("Programa para calcular suma, resta, divisón y multiplicación de dos numeros")
print("-----------------------------------------------------------------------------\n")

#Pedimos los datos
n1 = int(input("introduce el primer número: "))
n2 = int(input("introduce el segundo número: "))

#Realizamos los cálculos

print(f"La suma es {n1+n2}")
print(n1 ," menos ", n2, " es: ",n1 - n2)
print(n1 ," entre ", n2, " es: ",n1 / n2)
print(n1 ," por ", n2, " es: ",n1 * n2)
