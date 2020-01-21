#Programa: act4.py
#Propósito: pedir 2 numeros a un usuario y mostrar su división si el segundo no es 0 o un mensaje en caso contrario
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
#n1 y n2 numeros a dividir
# 
#Algoritmo:
# LEER n1 y n2
# dividir n1 entre n2
# si n2 no es igual a 0 mostrar resultado
# por el contrario mensaje de error

print("programa para dividir dos numeros")
print("----------------------------------\n")

# Leemos datos
n1 = int(input("Introduce el primer número: "))
n2 = int(input("Introduce el segundo número: "))

# Hacemos los cálculos y los mostramos

if n2 == 0:
    print("El número introducido en el divisor no puede ser 0")
else:
    print("El resultado es: ",n1/n2)
