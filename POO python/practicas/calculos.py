from practicas.fracción import Fraccion

f1 = Fraccion(3, 4)

print(f"la fracción es: {f1}")

f1.mod_fraccion()

print(f"El resultado es: {f1.resultado()}")

n1 = int(input("¿Por cuanto quieres multiplicar la fracción?: "))
print(f"El resultado es: {f1.multiplicacion(n1)}")

print(f1.mul_f())
print(f1.sum_f())
print(f1.rest_f())