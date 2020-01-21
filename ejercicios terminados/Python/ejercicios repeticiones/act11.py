#Programa: act11.py
#Propósito: Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
# Análisis:
# Introduce el usuario una frase
# comprobamos cada posición de la cadena y 
# si hay espacio es por que hemos cambiado de palabra
 
# Diseño:
# Leemos cad
# para i en el rango la longitud de cad
#   si la posicion de la cadena es igual a espacio
#       se añade a un contador
# fin del bucle
# escribimos "el resultado es 'contador' palabras
# variables:  cad es la cadena, cont el contador, i el indice del for.

print("Contador de palabras")
print("---------------------\n")

# Leemos los datos
cad = str(input("Introduce una frase: "))
cont = 1

# Realizamos el contador
for i in range (len(cad)):
    if cad[i] == " ":
        cont = cont + 1

# Imprimimos el resutlado
print(f"Hay {cont} palabras en la frase")
