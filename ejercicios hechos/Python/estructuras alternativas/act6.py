#Programa: act6.py
#Propósito: Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# str1 será la cadena que tiene que leer el programa 
#
#Algoritmo:
# LEER str1
# comprobar si es alfanúmerico
# comprobar si la cadena es de solo una letra
# comprobar si es mayúscula o minúscula

print("Comprobar si una cadena es mayúscula")
print("-------------------------------------\n")

# Leemos los datos
str1 = str(input("Introduce una letra para comprobar si es mayúscula: "))

# Comprobamos
if str1.isalpha() == False:
    print("Introduce un valor valido")
else:
    if len(str1) != 1:
        print("Solo puedes introducir un caráctater")
    else:
        if str1.islower() == False:
            print("La letra es mayúscula")
        else:
            print("La letra es minúscula")
