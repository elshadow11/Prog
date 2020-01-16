#Programa: act3.py
#Propósito: Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
#Variables a usar:
# 
# 
#
#Algoritmo:
# Repetiremos hasta que solo sea un carácter
# Mientras no haya espacio
#   Si caracter no es espacio
#   Si es A,E,I,O,U o a,e,i,o,u --> Mostrar "Es vocal"
#   Sino mostrar "No es vocal"
#   Repetiremos hasta que solo sea un carácter

print("Leer carácteres hasta que solo haya un espacio")
print("-----------------------------------------------\n")

# Leemos los datos
caracter = str(input("Introduce un carácter: "))

while len(caracter) != 1:
    caracter = str(input("Introduce un carácter: "))

# Realizamos la comprobacion
while caracter != " ":
    if caracter == "A" or caracter == "E" or caracter == "I" or caracter == "O" or caracter == "U" or caracter == "a" or caracter == "e" or caracter == "i" or caracter == "o" or caracter == "u":
        print("Es una vocal")
    else:
        print("No es una vocal")
        
    caracter = str(input("Introduce un carácter: "))
