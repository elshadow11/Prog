#Programa: ciclista.py
#Propósito: Calcular a que hora llega un ciclista que va desde A hasta B
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# horas, minutos, segundos es el tiempo en el que sale del punto A
# t es el tiempo que tarda en segundos
# 
#Algoritmo:
# LEER horas, minutos, segundos y t
# segundos <-- s <-- (t + segundos) / 60
# segundos <-- (s - math.floor(segundos)) * 60
# segundos <-- round(segundos)
# minutos <-- m <-- (math.floor(s) + minutos) / 60
# minutos <-- (m - math.floor(minutos)) * 60
# minutos <-- round(segundos)
# horas <-- (math.floor(m) + horas) / 24
# horas <-- (horas - math.floor(horas)) * 24
# ESCRIBIR, horas minutos y segundos
# horas<-- round(horas)

print("Calcular cuando llega un ciclista de A a B")
print("--------------------------------\n")
import math

#Leemos los datos
horas = float(input("Introduce la hora: "))
minutos = float(input("Introduce los minutos: "))
segundos = float(input("Introduce los segundos: "))
t = float(input("Introduce los segundos que tarda en llegar a B: "))

#Calculamos
segundos = s = (t + segundos) / 60
segundos = (s - math.floor(segundos)) * 60
segundos = round(segundos)
minutos = m = (math.floor(s) + minutos) / 60
minutos = (m - math.floor(minutos)) * 60
minutos = round(segundos)
horas = (math.floor(m) + horas) / 24
horas = (horas - math.floor(horas)) * 24
horas = round(horas)

#Escribimos el resultado
print("Llegara a las ", horas, " horas ", minutos, " minutos ", segundos, " segundos")
