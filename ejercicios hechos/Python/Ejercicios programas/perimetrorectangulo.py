#Programa: perimetrorectangulo.py
#Propósito: Calcular el perí­metro y área de un rectángulo dada su base y su altura.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 10/10/2019
#
#Variables a usar:
# a y b serán la altura y la base del rectangulo.
# perimetro será el resultado del cálculo
# área del rectángulo
#
#Algoritmo:
# LEER a,b
# perimetro <-- 2a + 2b
# area <-- a * b
# ESCRIBIR perimetro

print("Calculo del perímetro y el area de un rectángulo")
print("---------------------------------------\n")

# Leemos los datos
a = int(input("introduce la altura del rectángulo: "))
b = int(input("introduce la base del rectángulo: "))

#Cálculos
perimetro = 2 * a + 2 * b
area = a *b
#Resultado
print("El resultado es: ", perimetro, " de perimetro ", area, " el area")
