#Programa: act13.py
#Propósito: Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 30/10/2019
#
# Análisis:
# Pedimos una cadena al usuario
# Para cada caracter hacemos una variable independiente
# Si es minuscula lo convertiremos a mayuscula y a la inversa
# Una vez terminemos mostramos el resultado en pantalla
#
# Diseño:
# Leemos cad
# cad lo pasamos a lista
# Para i en rango de la longitud de cad
# si el cad[i] es mayuscula
#   newcad[i] <-- cad[i] en minuscula
# si el cad[i] es minuscula
#   newcad[i] <-- cad[i] en mayuscula
# newcad lo pasamos cadena y lo mostramos en pantalla
# fin del programa

print("Conversion de mayusculas a minusculas")
print("--------------------------------------\n")

#Leemos los datos
cad = input("Introduce una frase: ")
newcad = ""        
             
for i in range(0, len(cad)):
    char = cad[i]         
    if char.islower() == False: 
        char = char.lower() 
        newcad += char         
    else:
        char = char.upper() 
        newcad += char 

print(newcad)
