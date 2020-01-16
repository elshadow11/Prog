#Programa: tiempo.py
#Propósito: Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# mins serán los minutos que vamos a convertir en tiempo.
# horas,minutos son los resultados que luego usaremos. 
# h lo usaremos para calcular los minutos
#
#Algoritmo:
# LEER mins
# horas <-- h <-- mins / 60
# horas <-- math.floor(horas)
#h -<-- math.floor(h)
# minutos <-- h * 60
# ESCRIBIR horas y minutos

print("Minutos a horas y minutos")
print("-----------------------\n")


#Leemos los datos
minutos = int(input("introduce los minutos: "))

#Calculamos

horas = minutos // 60
resmin = minutos % 60

#Escribimos el resultado
print("El resultado es :", horas, " horas y ", resmin, " minutos")
