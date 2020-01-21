#Programa: act10.py
#Propósito: Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
# Análisis:
# Para este programa necesitamos pedir una cadena al usuario
# Luego pediremos un carácter que debe ser solo uno
# Hay que realizar una repetición en la cual compruebe cada posición de la cadena y si el carácter coincide añadirlo a un contador
# cuando se acabe la cadena se finaliza el programa
#
# Diseño:
# Leer cad y car
# Definir i <-- 0
# Definir cont <-- 0
# Mientras car != 1 vuelve a pedir car
# Para i hasta cad
#   Si cad[i] es igual a car
#       cont = cont + 1
# Fin para
# Escribir el caracter 'car' ha aparecido 'cont' veces
# Fin de programa
# Variables: 'i' es el indice del for, 'cont' será el valor contador, 'cad' será la cadena y 'car' el carácter

print("Programa para contar el numero de veces que aparece un caracter en una cadena")
print("------------------------------------------------------------------------------\n")

#Leemos los datos
i = 0
cont = 0
cad = str(input("Introduce una frase: "))
car = str(input("Introduce que carácter quieres contar de la frase: "))

# Mientras la longitud de car no sea igual a 1 vuelve a pedirlo

while len(car) != 1:
    print("Por favor el carácter no puede ser tan largo")
    car = str(input("Introduce que carácter quieres contar de la frase: "))

# desde i hasta el final de la cadena en valor númerico realizamos la comprobacion y sumamos al contador las veces que sea true

for i in range(len(cad)):
    if cad[i] == car:
        cont = cont + 1
    i = i + 1
    
#Escribimos el resultado

print(f"El carácter '{car}' ha aparecido {cont} veces")
