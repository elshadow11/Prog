#Programa: act19.py
#Propósito: Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# dias array para los dias de los meses
# mes será el mes del año
#
#Algoritmo:
# LEER mes
# Comprobar a que mes pertenece y escribir los días

print("mostrar los días que tiene un mes")
print("----------------------------------\n")

# Leemos los datos
dias = [31,28,31,30,31,30,31,31,30,31,30,31]
mes = int(input("Introduce el número del mes entre 1 y 12: "))

# Comprobamos los datos
if mes < 1 or mes > 12:
    print("Debe ser un numero entre 1 y 12")

else:
    if mes == 1:
        print(f"El mes tiene {dias[mes-1]} días")
        
    else:
        if mes == 2:
            print(f"El mes tiene {dias[mes-1]} días")
            
        else:
            if mes == 3:
                print(f"El mes tiene {dias[mes-1]} días")
                
            else:
                if mes == 4:
                    print(f"El mes tiene {dias[mes-1]} días")
                    
                else:
                    if mes == 5:
                        print(f"El mes tiene {dias[mes-1]} días")
                        
                    else:
                        if mes == 6:
                            print(f"El mes tiene {dias[mes-1]} días")
                            
                        else:
                            if mes == 7:
                                print(f"El mes tiene {dias[mes-1]} días")
                                
                            else:
                                if mes == 8:
                                    print(f"El mes tiene {dias[mes-1]} días")
                                    
                                else:
                                    if mes == 9:    
                                        print(f"El mes tiene {dias[mes-1]} días")
                                        
                                    else:
                                        if mes == 10:   
                                            print(f"El mes tiene {dias[mes-1]} días")
                                            
                                        else:
                                            if mes == 11:
                                                print(f"El mes tiene {dias[mes-1]} días")    
                                                
                                            else:
                                                if mes == 12:
                                                    print(f"El mes tiene {dias[mes-1]} días")
