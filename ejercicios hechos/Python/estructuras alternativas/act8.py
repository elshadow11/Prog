#Programa: act8.py
#Propósito: introducir nota edad y sexo y mostrar si esta aceptada o no
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# nota, edad y sexo son los datos a introducir por el usuario
#
#Algoritmo:
# LEER nota, edad y sexo
# si nota mayor o igual 5 y edad mayor o igual a 18 y sexo F imprime aceptada
# si se cumple lo anterior pero el sexo es M imprime posible
# si no se cumple imprime no aceptada

print("ver si esta aceptada o no")
print("---------------------\n")

#leemos los datos
nota = int(input("Introduce la nota: "))
edad = int(input("Introduce la edad: "))
sexo = str(input("Introduce el sexo: "))

#comprobamos los datos
if nota >= 5 and edad >= 18 and sexo == 'F':
    print("ACEPTADA")
elif nota >= 5 and edad >= 18 and sexo == 'M':
    print("POSIBLE")
else:
    print("NO ACEPTADA")
