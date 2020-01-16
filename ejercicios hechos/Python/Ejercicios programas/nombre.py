#Programa: nombre.py
#Propósito: Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# nombre, apellido1, apellido2 estas seran las variables del nombre
# iniciales es la variable que contrendra las iniciales del nombre completo
# 
#Algoritmo:
# LEER nombre, apellido1, apellido2
# iniciales <--- nombre[0] + apellido1[0] + apellido2[0]
# ESCRIBIR iniciales

print("Obtencion de iniciales de un nombre completo")
print("----------------------------------------------\n")

# Lectura de datos
nombre = str(input("Introduce tu nombre: "))
apellido1 = str(input("Introduce tu primer apellido: "))
apellido2 = str(input("Introduce tu segundo apellido: "))

# Calculos
iniciales = (nombre[0] + apellido1[0] + apellido2[0]).upper()

#Escritura de datos
print("Tus iniciales son: ", iniciales)
