#Programa: sueldo.py
#Propósito: teniendo en cuenta un sueldo base y un 10% de comisión debemos calcular el pago final por 3 ventas en un mes.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# s es el sueldo del vendedor
# v1,v2,v3 son las ventas del mes
# f será el sueldo final del vendedor
# c será el total de los ganado por comisiones
#
#Algoritmo:
# LEER s,v1,v2,v3
# c <-- (v1 * 0.1) + (v2 * 0.1) + (v3 * 0.1)
# f <-- s + c
# ESCRIBIR c y f

print("Sueldo y comisiones de vendedor")
print("-------------------------------\n")

#Leemos los datos
s = float(input("El sueldo base del vendedor es: "))
v1 = float(input("La primera venta ha sido de: "))
v2 = float(input("La segunda venta ha sido de: "))
v3 = float(input("La tercera venta ha sido de: "))

#calculamos
c = (v1 * 0.1) + (v2 * 0.1) + (v3 * 0.1)
f = s + c

#Escribimos los resultados
print("La comisión total es de: ", c, " euros")
print("El pago final al vendedor será de: ", f, " euros")
