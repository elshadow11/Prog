#Programa: intercambio.py
#Propósito: Intercambiar el valor de dos variables númericas
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# A,B los dos números a los que vamos a intercambiar
# suma nos ayudará a realizar el intercambio
#Algoritmo:
# LEER A,B
# suma <-- A + B
# A <-- suma - A
# B <-- suma - B
#ESCRIBIR A Y B

print("Invertir el valor de dos variables A y B")
print("-----------------------------------------\n")

#Leemos los datos
A = int(input("Introduce el número A: "))
B = int(input("Introduce el número B: "))

#Calculamos
suma = A + B
A = suma - A
B = suma - B

# Forma alternativa A,B = B,A
#Escribimos los datos
print("El valor de A es ",A , " y el valor de B es ", B)
