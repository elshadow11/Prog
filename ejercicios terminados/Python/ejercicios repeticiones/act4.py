#Programa: act4.py
#Propósito: Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
#Variables a usar:
# n1 primer numero
# n2 segundo numero hasta el que queremos llegar
#
#Algoritmo:
# Leer n1,n2
# desde i en rango n1 ha n2 + 1
# si i entre 2 igual a 0
#   Escribir numero i

print("Programa que lee los números pares de 2 en 2")
print("---------------------------------------------\n")

#Leemos los datos
n1 = int(input("Introduce el número 1: "))
n2 = int(input("Introduce el número 2: "))

#Realizamos las comprobaciones

for i in range(n1, n2 + 1):
    if i % 2 ==0:
        print(i)
