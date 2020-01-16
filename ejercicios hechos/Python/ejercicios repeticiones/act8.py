#Programa: act8.py
#Propósito: Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos. Para hacer una espera en Python podemos usar el método sleep del módulo time.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
#Variables a usar:
# hora,minuto y segundos
# 
#Algoritmo:
# Para las horas de 0 hasta 24
# Para los minutos desde 0 hasta 60
# Para los segundos desde 0 hasta 60
# imprimimos el resultado
# esperamos mediante time.sleep

print("Temporizador en python")
print("------------------------\n")

import time

print("Comienzo")

#Generamos un bucle y con time.sleep le pedimos que espere 1 segundo para devolver los datos
for h in range(0 , 24):
    for m in range(0 ,60):
        for s in range(0 ,60):             
            print("Hora: ", h, "Minuto: ", m, "Segundos: ", s)
            time.sleep(1)
