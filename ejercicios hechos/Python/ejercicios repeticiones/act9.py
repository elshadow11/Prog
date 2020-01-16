#Programa: act9.py
#Propósito: Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de números primos que queremos mostrar.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# n1 es un valor que guardará la cantidad de números primos que pedimos
# cont es el contador
# cad es un valor que usaremos de soporte
# n nos servirá para comprovar si el primo es divisor
# i será el indice de los bucles y el otro número que usaremos para verificar
#
#Algoritmo:
# Si n1 es mayor a 2 y si no lo es comparamos si es mayor a 0
# y si tampoco lo es muestra un mensaje pidiendo un numero mayor a 0
# si es verdadero comparamos si n1 es igual a 1 mostramos el primer primo
# si es 2 mostramos los dos primeros primos
# Luego iniciamos 2 y 4 mientras que cont sea menor que n1 podremos ir desde el 3 hasta el número ingresado
# mientras i (que definiremos como 2) sea menor o igual que n podemos verificar que el numero es primo o no
# si i no es igual a n verificamos si i es divisor de n
# en el caso de que sea igual asignamos a i el valor de n para terminar el ciclo
# Por ultimo si verificamos que si lo és mostramos la salida y actualizamos el contador incrementando i en 1 y n en 1

print("Programa que muestra los primeros número primos")
print("------------------------------------------------\n")

#Leemos los datos
n = 4
cont = 2
n1 = int(input("ingrese un numero: "))
#Comprobamos si n1 es mayor que dos
if(n1 > 2):
 cad = "2 - 3"
 while cont < n1:#Mientras el contador sea menos que n1 aplicamos lo siguiente para hacer los calculos
  i = 2
  while i <= n:
   if(i == n):
    cad = cad + " - " + str(i)
    cont = cont + 1
   else:
    if(n % i == 0):
     i = n
   i = i + 1
  n = n + 1
 print(cad) # Mostramos el resultado en una cadena
else:
 if(n1 > 0):#En el caso de que n1 sea mayor que 0 pero igual a 1 
  if(n1 == 1):
   print("2")
  else:
   print("2 - 3")
 else:
  print("ingrese un digito superior a 0")
