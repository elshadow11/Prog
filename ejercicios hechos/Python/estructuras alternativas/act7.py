#Programa: act7.py
#Propósito: Calcular la potencia
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# base y exponente son las variable de la potencia
#
#Algoritmo:
# LEER datos base y exponente
# Si el exponente es positivo mostrar resultado
# si el exponente es 0 el resultado es 1
# el exponente es negativo el resultado es 1/potencia con exponente positivo

print("calcular la potencia")
print("---------------------\n")

# Leemos los datos
base = int(input("introduce la base: "))
exponente = int(input("introduce la exponente: "))

# Realizamos las comprobaciones
if exponente > 0:
    print("El resultado es : ", base ** exponente)
elif exponente == 0:
    print("El resultado es: 1")
else:
    print("El resultado es: ", 1/(base ** abs(exponente)))
