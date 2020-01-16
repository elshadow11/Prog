#Programa: act17.py
#Propósito: Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# cara_dado será la cara que el usuario introduzca
# cara_opuesta será el dato cadena para la cara opuesta
#
#Algoritmo:
# LEER cara_dado
# si cara_dado es igual a 1 escribir "seis"
# si cara_dado es igual a 2 escribir "cinco"
# si cara_dado es igual a 3 escribir "cuatro"
# si cara_dado es igual a 4 escribir "tres"
# si cara_dado es igual a 5 escribir "dos" 
# si cara_dado es igual a 6 escribir "uno"
# si cara_dado es mayor que 6 o menor que uno fallo

print("calcular la potencia")
print("---------------------\n")

#Leemos los datos
cara_dado = int(input("Introduce el numero que ha sacado el dado del 1 al 6: "))
cara_opuesta = ["uno","dos","tres","cuatro","cinco","seis"]

#Realizamos las comprobaciones
if cara_dado < 1 or cara_dado > 6:
    print("ERROR: número incorrecto")

else:
    if cara_dado == 1:
        print(f"En la cara opuesta está el {cara_opuesta[5]}")
    
    else:
        if cara_dado == 2:
            print(f"En la cara opuesta está el {cara_opuesta[4]}")
    
        else:
            if cara_dado == 3:
                print(f"En la cara opuesta está el {cara_opuesta[3]}")
    
            else:
                if cara_dado == 4:
                    print(f"En la cara opuesta está el {cara_opuesta[2]}")
    
                else:
                    if cara_dado == 2:
                        print(f"En la cara opuesta está el {cara_opuesta[1]}")
    
                    else:
                        if cara_dado == 1:
                            print(f"En la cara opuesta está el {cara_opuesta[0]}")
