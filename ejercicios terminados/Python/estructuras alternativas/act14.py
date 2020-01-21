#Programa: act14.py
#Propósito: Determinar la ganancia obtenida en un negocio
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# tipo y tamaño son las variables de las uvas
# precio base al que añadiremos o rebajaremos el precio
# kg que será la cantidad de uvas a comprar
#
#Algoritmo:
# LEER tipo, tamaño y kg
# precio base <-- precio base * kg
# si es tipo A tamaño 1 20 cents + precio base, si es tamaño 2 30 cents + precio base
# si es tipo B tamaño 1 30 cents - precio base, si es tamaño 2 50 cents - precio base
# calculamos y mostramos en pantalla el resultado

print("calcular la ganancia de una venta de uvas")
print("------------------------------------------\n")

#Leemos los datos
precio_base = 3.10 #el kilo
tipo = str(input("Introduce le tipo de Uvas: "))
tamaño = int(input("Introduce le tamaño de las Uvas: "))
kg = float(input("Introduce le peso de las Uvas: "))

#Añadimos el peso al precio base
precio_base = precio_base * kg

#Comprobamos los precios
if tipo == 'A' and tamaño == 1:
    precio_base = round(precio_base + 0.20,2)
    print("La ganancia será de: ",precio_base," euros")
    
else:
    if tipo == 'A' and tamaño == 2:
        precio_base = round(precio_base + 0.30,2)
        print("La ganancia será de: ",precio_base," euros")
        
    else:
        if tipo == 'B' and tamaño == 1:
            precio_base = round(precio_base - 0.30,2)
            print("La ganancia será de: ",precio_base," euros")
            
        else:
            if tipo == 'B' and tamaño == 2:
                precio_base = round(precio_base - 0.50,2)
                print("La ganancia será de: ",precio_base," euros")
                
            else:
                print("Los valores no son correctos")
