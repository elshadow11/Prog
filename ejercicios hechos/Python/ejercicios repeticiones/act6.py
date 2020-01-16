#Programa: act6.py
#Propósito: Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 29/10/2019
#
#Variables a usar:
# b es la base, p es la potencia, exp el exponente, i es el indice del bucle 
#
#Algoritmo:
# Leemos b y p
# Nos aseguramos de que él exoponente es positivo
# calculamos la potencia acumulando el productor de la base en cuestión del exponente

print("Realizar una potencia sin el operador potencia")
print("-----------------------------------------------\n")

#Leemos datos
b = int(input("Dime la base de la potencia: "))
exp = int(input("Dime el exponente de la potencia: "))

while exp < 0:
    exp = int(input("El exponente no puede ser negativo: "))
    
p = 1

for i in range(0, exp):
    p = p * b
    
print(f"El resultado es {p}")
