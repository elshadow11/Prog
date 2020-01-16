#Programa: distancia.py
#Propósito: Pide al usuario dos números y muestra la "distancia" entre ellos.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# n1,n2 serán los numeros que usaremos para calcular la distancia
# d será el resultado
#
#Algoritmo:
# LEER n1,n2 
# d <-- abs(n1 - n2) 
# ESCRIBIR d

print("Calcular la distancia entre 2 números")
print("------------------------------------\n")

#Leemos los datos
n1 = int(input("introduce el primer número: "))
n2 = int(input("introduce el segundo número: "))

#Calculamos

d = abs(n1 - n2)

#Escribimos el resultado

print("La distancia es de: ", d)
