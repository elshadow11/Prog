#Programa: act7.py
#Propósito: Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después de los 20 meses.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
#Variables a usar:
# P es el pago inicial, pac es el total del pago tras acumularlo, mes es la cantidad de meses
#
#Algoritmo:
# Debemos ir acumulando los pagos en una serie aritmética de 20 veces multiplicando poe 2
# Desde el mes 1 al 20
#   Acumula el pago
#   Se dobla
# Mostramos el pago acumulado 

print("Calcular el pago acumulado de un comprador")
print("------------------------------------------\n")

# Leemos los datos

P = 10
pac = 0

#Hacemos la acumulación
for mes in range (1, 20):
    pac = pac + P
    P = P * 2

print(f"El resultado de los 20 meses al pagar es {pac}")
