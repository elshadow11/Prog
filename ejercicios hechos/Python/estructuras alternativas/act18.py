#Programa: act18.py
#Propósito: Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# dia el valor número asignado al día de la semana
# dia_semana será un array que contenga los valores
#
#Algoritmo:
# LEER dia
# comprobar si es un número del 1 al 7 en caso contrario mensaje de error
# si es 1 mostrar lunes
# si es 2 mostrar martes
# si es 3 mostrar miercoles
# si es 4 mostrar jueves
# si es 5 mostrar viernes
# si es 6 mostrar sabado
# si es 7 mostrat domingo

print("Muestra el día de la semana")
print("----------------------------\n")

# Leemos los datos
dia = int(input("Introduce el número del día de la semana: "))
dia_semana = ["Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"]

#comprobamos los datos
if dia < 1 or dia > 7:
    print("introduce un valor entre 1 y 7")
else:
    if dia == 1:
        print(f"El día de la semana es {dia_semana[dia-1]}")
        
    else:
        if dia == 2:
            print(f"El día de la semana es {dia_semana[dia-1]}")
        
        else:
            if dia == 3:
                print(f"El día de la semana es {dia_semana[dia-1]}")
        
            else:
                if dia == 4:
                    print(f"El día de la semana es {dia_semana[dia-1]}")
        
                else:
                    if dia == 5:
                        print(f"El día de la semana es {dia_semana[dia-1]}")
        
                    else:
                        if dia == 6:
                            print(f"El día de la semana es {dia_semana[dia-1]}")
        
                        else:
                            if dia == 7:
                                print(f"El día de la semana es {dia_semana[dia-1]}")
