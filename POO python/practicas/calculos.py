from practicas.fracción import Fraccion

f1 = Fraccion(3, 4)

print(f"la fracción es: {f1}")

f1.modificar_fraccion()

print(f"El resultado es: {f1.resultado()}")

n1 = int(input("¿Por cuanto quieres multiplicar la fracción?: "))
print(f"El resultado es: {f1.multiplicacion(n1)}")

print(f1.multiplicar_fraccion())

print(f1.sumar_fraccion())

print(f1.restar_fraccion())

print("Simplificamos la fracción: ")
print(f1.simplificar_fraccion())
