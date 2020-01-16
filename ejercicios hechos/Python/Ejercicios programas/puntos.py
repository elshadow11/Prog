#Programa: puntos.py
#Propósito: Calcular y medir la distancia entre dos puntos en un plano
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# x1,x2,y1,y2 serán los putnos en el plano
# d es el resultado de la distancia de ambos
# 
#Algoritmo:
# LEER x1,y1,x2,y2
# d <-- sqrt((x2-x1)**2+(y2-y1)**2)
# ESCRIBIR d

print("Calcular la distancia entre 2 puntos del plano")
print("---------------------------------------------\n")
import math

#Leemos los datos
x1 = int(input("Introduce el valor de x1: "))
y1 = int(input("Introduce el valor de y1: "))
x2 = int(input("Introduce el valor de x2: "))
y2 = int(input("Introduce el valor de y2: "))

#Calculamos
d = math.sqrt((x2-x1)**2+(y2-y1)**2)

#Mostramos el resultado

print("La distancia entre ambos puntos es de: ", d)
