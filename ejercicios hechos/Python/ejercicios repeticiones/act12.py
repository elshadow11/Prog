#Programa: act12.py
#Propósito: Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
# Análisis:
# Primero nos pide una cadena, tras introducirla nos piden dos carácteres
# Con el primero vamos a marcar el primer caracter de la cadena que sea igual y lo intercambiamos por el segundo introducido
# Para ello debemos leer la cadena desde el principio y cuando encuentre un caracter igual al primero
# Cambiamos su valor por el del segundo caracter
#
# Diseño:
# Leemos los datos de cad, car1 y car2
# i <-- 0
# mientras la longitud de car1 no sea igual 1
#   pedimos de nuevo car1
# mientras la longitud car2 no sea igual a 1
#   pedimos de nuevo car2
# mientras car1 no sea igual a el caracter de cad[i] seguir comprobando
#   si car1 no es igual a cad[i]
#       a i se le incrementa en 1
# creamos una nueva cadena y reemplazamos los datos
# Escribe la cadena para comprobar el cambio
# variables: i sera la posicion de la cadena, cad es la cadena, car1 y car2 son los carácteres, newcad será la nueva cadena cambiada

print("Intercambiar el primer caracter de una cadena por otro")
print("--------------------------------------------------------\n")

#Leemos los datos
i = 0
cad = str(input("Introduce la frase: "))
car1 = str(input("Introduce el primer carácter: "))
car2 = str(input("Introduce el carácter de remplazo: "))
separador = ""

#Realizamos comprobación sobre car1 y car2
while len(car1) != 1:
    print("El carácter no puede ser tan largo")
    car1 = str(input("Introduce el primer carácter: "))
while len(car2) != 1:    
    print("El carácter no puede ser tan largo")
    car2 = str(input("Introduce el carácter de remplazo: "))
    
#Cuando tenemos los caracteres hacemos la lectura de la cadena
while car1 != cad[i]:
    if car1 != cad[i]:
        i = i + 1
    

cad = list(cad)
cad[i] = car2
newcad = separador.join(cad)
newcad = str(newcad)

#Mostramos el resultado
print(newcad)
