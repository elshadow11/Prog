#Programa: act5.py
#Propósito: Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
#Variables a usar:
# lim_inf, lim_sup son los valores de los límites
# n1 será el número que introducimos
# sum_int es la suma del intervalo
# cont_int será el conteo
# igual_lim es el indicativo que es igual a un intervalo
#
#Algoritmo:
# Pedimos un intervalo
# El límite inferior debe ser menor que el superior
# Se piden numeros hasta que se introduce el  0
# Si el número es del intervalo se suma
# Si el numero no pertenece al intervalo, se cuenta
# Si el nímero es igual al límite, se índica
# Se muestra la suma de los numeros que pertenecen al intervalo
# Se muestra el contador de números que no pertenecen al intervalo
# Indicamos si se ha introducido un número igual a algún límite

print("Programa para operar con limite inferior y superior")
print("----------------------------------------------------\n")

#Leemos los datos

lim_sup = int(input("Introduce el límite superior: "))
lim_inf = int(input("Introduce el límite inferior: "))
sum_int = 0
cont_int = 0
igual_lim = False

# Comprobamos que no sea el inferior mayor al superior
while lim_inf > lim_sup:
    if lim_inf > lim_sup:
        print("El límite inferior no puede ser mayor al límite superior")
        lim_sup = int(input("Introduce el límite superior: "))
        lim_inf = int(input("Introduce el límite inferior: "))

n1 = int(input("Introduce un número para salir(0 para finalizar): "))

while n1 != 0:
    if n1 > lim_inf and n1 < lim_sup:
        sum_int = sum_int + n1
    else:
        cont_int = cont_int + 1
    
    if n1 == lim_inf or n1 == lim_sup:
        igual_lim = True
        
    n1 = int(input("Introduce un número para salir(0 para finalizar): "))

print(f"La suma de los números es: {sum_int}")
print(f"Los números fuera del intervalo son: {cont_int}")

if igual_lim:
    print("Algún número es igual a los límites del intervalo")
else:
    print("No hay ningún número igual a los límites del intervalo")
