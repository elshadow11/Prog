#Programa: examen.py
#Propósito: Calcular la nota final de un estudiante en un examen
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# correctas,erroneas,blancas son los valores para las respuestas del examen
# nota aqui almacenaremos la nota final
# preguntas es el numero total de preguntas
# 
#Algoritmo:
# LEER correctas, erroneas, blancas
# nota <-- correctas * 5 + erroneas * -1 + blancas * 0
# preguntas <-- correctas + erroneas + blancas
# nota <-- (nota / (preguntas * 5)) * 10
# Escribir nota

print("Obtencion de iniciales de un nombre completo")
print("----------------------------------------------\n")

#Leemos los valores
correctas = int(input("Introduce la cantidad de respuestas correctas: "))
erroneas = int(input("Introduce la cantidad de respuestas erroneas: "))
blancas = int(input("Introduce la cantidad de respuestas blancas: "))

# Calculos
preguntas = correctas + erroneas + blancas
nota = correctas * 5 + erroneas * -1 + blancas * 0
nota = (nota / (preguntas * 5)) * 10
# Escribimos los datos
print("La nota final es de : ", nota)
