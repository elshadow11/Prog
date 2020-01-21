#Programa: descuento.py
#Propósito: Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# compra será el total de la compra
# f será el precio final de la compra
# descuento será el descuento aplicado al precio
# 
#Algoritmo:
# LEER compra
# descuento <-- compra * 0.15
# f <-- compra - descuento
# Escribir f

print("Descuento del 15% en una compra")
print("-------------------------------\n")

#Leemos los datos
compra = float(input("Introduce el precio al que quieres aplicar el descuento: "))

#calculamos
descuento = compra * 0.15
f = compra - descuento

#Escribimos el resultado
print("El resultado de su descuento es: ", f, " euros")
