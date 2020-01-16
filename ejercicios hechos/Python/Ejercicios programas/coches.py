#Programa: coches.py
#Propósito: Calcular cuanto tarda un vehículo en alcanzar al otro.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# v1,v2 la velocidad de los coches
# d la distancia
# t el tiempo que tardan en coincidir
# 
#Algoritmo:
# LEER v1,v2,d
# t <-- d/(v1 + v2)
# Escribir t

print("Calcular cuanto tardan en encontrarse dos vehiculos")
print("----------------------------------------------------\n")

#Leer datos
v1 = int(input("Introduce la velocidad del primer vehículo: "))
v2 = int(input("Introduce la velocidad del segundo vehículo: "))
d = int(input("Introduce la distancia entre ambos: "))

#Calculamos
t = d / (v1 + v2)
t = round(t)

#Escribimos el resultado
print("El resultado es que tardaran ", t, "minutos en coincidir")
