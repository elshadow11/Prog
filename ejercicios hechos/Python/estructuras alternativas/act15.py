#Programa: act15.py
#Propósito: El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# alumnos que abonaran el dinero
# precio_renta es lo que costará el autobus
# precio_alumno es lo que pagará cada alumno
#
#Algoritmo:
# LEER alumnos
# si alumnos es de 100 o más precio_alumno <-- 65
# si alumnos es 50-99 precio_alumno <-- 70
# si alumnos es 30-49 precio_alumno <-- 95
# si alumnos es 30 o inferior precio_renta <-- 4000 y precio_alumnos <-- 4000/alumnos
# precio_renta <-- alumnos * precio_alumnos
# ESCRIBIR precio_renta y precio_alumnos

print("calcular el precio a pagar de un bús y el importe a pagar de cada alumno")
print("--------------------------------------------------------------------------\n")

#Leemos los datos
alumnos = int(input("Introduce el número de alumnos: "))

# Realizamos las comprobaciones
if alumnos >= 100:
    precio_alumno = 65
    precio_renta = alumnos * precio_alumno
    print(f"Los alumnos pagarán: {precio_alumno} y la renta total será: {precio_renta}")

else:
    if alumnos >= 50 and alumnos <= 99:
        precio_alumno = 70
        precio_renta = alumnos * precio_alumno
        print(f"Los alumnos pagarán: {precio_alumno} y la renta total será: {precio_renta}") 
    
    else:
        if alumnos >= 30 and alumnos <= 49:
            precio_alumno = 95
            precio_renta = alumnos * precio_alumno
            print(f"Los alumnos pagarán: {precio_alumno} y la renta total será: {precio_renta}") 
    
        else:
            if alumnos <= 30:
                precio_renta = 4000
                precio_alumno = precio_renta / alumnos
                precio_alumno = round(precio_alumno,2)
                print(f"Los alumnos pagarán: {precio_alumno} y la renta total será: {precio_renta}") 
            
            else:
                print("Los valores son erroneos")
