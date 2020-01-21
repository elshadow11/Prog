#Programa: act15.py
#Propósito: Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
# Análisis:
# Un palíndromo es una palabra que se lee de misma manera al reves que al derecho
# para averiguarlo obtenemos una cadena, la cual debemos invertir y equipararla al original
#
# Diseño:
# Leemos cad
# definimos unos valores para las vocales en mayuscula y con tildes
# cad1 <-- cad en mayusculas y quitamos los espacios
# para i en rango de la longitud de vocales con tilde
#   cad1 <-- cad1 intercambia tildes por normales
# cad2 <-- cad1 invertida
# si cad1 es igual a cad2
#   escribe la cadena es palindromo
# sino la cadena no es palindromo

print("Si es palindromo es aquella que se lee de igual manera hacia delante y hacia atrás")
print("-----------------------------------------------------------------------------------\n")

cad = input("Introduce una cadena para comprobar si es palíndromos: ")
voc_til = "ÁÉÍÓÚ"
voc_nom = "AEIOU"

cad1 = cad.upper().replace(" ","")

for i in range(len(voc_til)):
    cad1 = cad1.replace(voc_til[i],voc_nom[i])

cad2 = cad1[::-1]

if cad1==cad2:
    print(f"la cadena {cad} es un palíndromo")
else:
    print(f"la cadena {cad} no es palíndromo")
