#Programa: act14.py
#Propósito: Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
# Análisis:
# Leemos dos cadenas, hay que ir comprobando las subcadenas de la primera 
# que sean igual de tamaño que la segunda. Si alguna es igual, la primera contiene la segunda.
# Diseño:
# 

print("Añadimos dos cadenas y comprobamos si la segunda se encuentra en la primera")
print("------------------------------------------------------------------------------\n")

cad = str(input("Introduce una cadena: "))
subcad = str(input("Introduce una subcadena: "))
num_subcad = len(cad)-len(subcad) + 1
cad = list(cad)
ind = False

for i in range(0, num_subcad - 1):
    if num_subcad == subcad:
        ind = True
        
if ind:
    print("La cadena contiene la subcadena")
else:
    print("La cadena no tiene la subcadena")
