#Programa: act10.py
#Propósito: clasificar unas circunferencias
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# x1,y1,x2,y2 y r1,r2 son los puntos de la circunferencia
# d es la distancia entre los centros de las circunferencias
#
#Algoritmo:
# LEER x1,y1 x2,y2 y r1,r2
# Calculamos d <-- ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 1/2
# si d es mayor que la suma de r1 y r2 son exteriores
# si d es menor que la suma y mayor que la diferencia son secantes
# si d es mayor que 0 pero menor que la diferencia son interiores
# si d es igual a la suma de los radios son Tangentes exteriores
# si d es igual a la diferenfcia entre los radios son Tangentes interiores
# si d es igual a 0 son concentricas

print("Clasificar dos circunferencias relativas a su posición")
print("-------------------------------------------------------\n")

#Leemos los datos
x1 = int(input("Introduce el punto x1: "))
y1 = int(input("Introduce el punto y1: "))
r1 = int(input("Introduce el punto r1: "))
x2 = int(input("Introduce el punto x2: "))
y2 = int(input("Introduce el punto y2: "))
r2 = int(input("Introduce el punto r2: "))

# Calculamos d
d = ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 1/2

# realizamos las comparativas
if d > r1 + r2:
    print("Las circunferencias son exteriores")
    
elif d < r1 + r2 and d > abs(r1 - r2):
    print("Las circunferencias son secantes")
    
elif d < 0 and d < abs(r1 - r2):
    print("Las circunferencias son interiores")

elif d == r1 + r2:
    print("Las circunferencias son Tangentes exteriores")

elif d == abs(r1 - r2):
    print("Las circunferencias son Tangentes interiores")
    
elif d == 0:
    print("Las circunferencias son concentricas")
