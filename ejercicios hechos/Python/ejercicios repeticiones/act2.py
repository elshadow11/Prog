#Programa: act2.py
#Propósito: Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
#Variables a usar:
# cont_pos,cont_neg,cont_cero son los numeros para el contador
# num sera le numero que introduciremos para comprobar
# num_total es el numero de numeros que vamos a leer
#
#Algoritmo:
# Inicio del conteo
# Leer números
# Desde 1 hasta total de numeros
#   Leer num
#   Si num > 0 -> incremento cont-pos
#   Si num < 0 -> incremento cont-neg
#   Si num = 0 -> incremento cont_cero
# Escribir los resultados

print("Contar de que tipo son los numeros introducidos")
print("------------------------------------------------\n")


#Leemos los datos
cont_pos = 0
cont_neg = 0
cont_cero = 0
num_total = int(input("¿Que cantidad de números vas a utilizar: "))

#Realizamos el conteo
for i in range(1, num_total + 1):
    num = int(input(f"Número {i}: "))
    if num > 0:
        cont_pos = cont_pos + 1
    else:
        if num < 0:
            cont_neg = cont_neg + 1
        else:
            cont_cero = cont_cero + 1
            
print(f"Números positivos: {cont_pos}")
print(f"Números negativos: {cont_neg}")
print(f"Números iguales a 0: {cont_cero}")
