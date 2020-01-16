#Programa: nota.py
#Propósito: Calcular la nota de un alumno dadas las notas y los porcentajes
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 13/10/2019
#
#Variables a usar:
# media será el total de las tres calificaciones parciales
# p1, p2, p3 son sus 3 notas parciales
# ex será la nota del examen final
# tra será la nota del trabajo final
# nota es el resultado final de la nota del alumno
#
#Algoritmo:
# LEER p1,p2,p3,ex,tra
# media <-- (p1 + p2 + p3)/3
# media <-- media * 0.55
# ex <-- ex * 0.30
# tra <-- tra *0.15
# nota <-- media + ex + tra
# ESCRIBIR nota

print("Calculo de la nota final")
print("-----------------------\n")

#Leemos los datos
p1 = float(input("Introduce la nota del primer parcial: "))
p2 = float(input("Introduce la nota del segundo parcial: "))
p3 = float(input("Introduce la nota del tercer parcial: "))
ex = float(input("Introduce la nota del examen final: "))
tra = float(input("Introduce la nota del trabajo final: "))

# Calculamos
media = (p1 + p2 + p3)/3
media = media * 0.55
ex = ex * 0.30
tra = tra *0.15
nota = round(media + ex + tra,2)

#Escribimos el resultado
print("La nota final es: ", nota)
