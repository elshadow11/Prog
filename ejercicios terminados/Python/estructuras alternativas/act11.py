print("Clasificacion de triangulos segun sus lados")
print("---------------------\n")

# Leemos los datos
A = int(input("Introduce el lado A: "))
B = int(input("Introduce el lado B: "))
C = int(input("Introduce el lado C: "))

#Buscamos el mayor de ellos
if A ** 2 == B ** 2 + C ** 2 or B ** 2 == A ** 2 + C ** 2 or C ** 2 == A ** 2 + B ** 2:
    print("El triangulo es rectangulo")
    
elif A == B and B != C or A == C and B != C or B == C and B != A:
    print("El triangulo es isosceles")

elif A == B and A == C:
    print("EL triangulo es equilatero")
    
else:
    print("EL triangulo es escaleno")