#Programa: media.py
#Propósito: Calcular la media de tres números pedidos por teclado.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# n1,n2,n3 serán los número usados para calcular la media
# media es el resultado
#
#Algoritmo:
# LEER n1, n2, n3
# media <-- (n1 + n2 + n3) / 3
# Escribir media

print("Calculo de la media de 3 números")
print("------------------------------\n")

#Leemos los números
n1 = int(input("Introduce el primer número: "))
n2 = int(input("Introduce el segundo número: "))
n3 = int(input("Introduce el tercer número: "))

#Calculamos la media

media = (n1 + n2 + n3) / 3

#Escribimos el resultado

print ("La media de ", n1, " ", n2, " ", n3, " es: ", media)
