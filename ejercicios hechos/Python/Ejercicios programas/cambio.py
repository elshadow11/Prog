#Programa: cambio.py
#Propósito: Calcular el dinero que tenemos partiendo de la cantidad de monedas
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# e2, e1, c50, c20, c10 son las monedas que debemos sumar
# euros, centimos seran el resultado de nuestro
# e nos ayudara con los ca
# 
#Algoritmo:
# LEER e2, e1, c50, c20, c10
# centimos <-- e <-- ((c10 * 10) + (c20 * 20) + (c50 * 50) + (e1 * 100) + (e2 * 200)) / 100
# centimos <-- (e - math.floor(centimos)) * 100
# centimos <-- round(centimos)
# euros <-- round(e)
# ESCRIBIR euros y centimos

print("Obtencion de iniciales de un nombre completo")
print("----------------------------------------------\n")
import math

# Leemos los datos
e2 = int(input("Introduce el numero de monedas de 2 euros: "))
e1 = int(input("Introduce el numero de monedas de 1 euros "))
c50 = int(input("Introduce el numero de monedas de 50 centimos: "))
c20 = int(input("Introduce el numero de monedas de 20 centimos: "))
c10 = int(input("Introduce el numero de monedas de 10 centimos: "))

# Calculamos

centimos = e = ((c10 * 10) + (c20 * 20) + (c50 * 50) + (e1 * 100) + (e2 * 200)) / 100
centimos = (e - math.floor(centimos)) * 100
centimos = round(centimos)
euros = math.floor(e)

# Escribimos el resultado
print("El resultado es : ", euros, " euros y ",centimos, " centimos ")
