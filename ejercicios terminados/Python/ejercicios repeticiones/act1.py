#Programa: act1.py
#Propósito:Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
#Variables a usar:
# nu es el numero que introducira el usuario
# intentos seran el numero de intentos
# n1 es el número aleatorio
#
#Algoritmo:
# Generamos números del 1 al 100
# intentos <-- 0
# LEER nu
# Mientras intentos sea menor que 10
#   intentos <-- intentos + 1
#   Leer n1
#   Si nu == n1, break
# Si nu == n1, Escribe, "Enhorabuena, acertaste el numero en tantos intentos"
# Sino, Escribe "Has perdido, ale"

print("Acierta un numero del 1 al 100")
print("---------------------\n")

import random
#Leemos los datos

intentos = 0
n1 = random.randint(1,100)
n1 = 2
print("Piensa un número del 1 al 100.")

while intentos<10:
    nu = int(input(f"Adelante tienes {10-intentos} intentos: "))
    
    intentos = intentos+1
    
    if nu == n1:
        break

if nu == n1:
    print(f"Enhorabuena, acertaste el número en {intentos} intentos.")

if nu != n1:
    print(f"Lo siento el número es: {n1}")
