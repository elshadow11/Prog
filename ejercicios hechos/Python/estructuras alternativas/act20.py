#Programa: act20.py
#Propósito: una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# zona y peso son los valores del paquete
# precio será el resultado
#
#Algoritmo:
# lEER zona y peso
# si el peso es mayo a 5kg se rechaza el pedido
# si la zona es America del Norte 24 euros kg
# si la zona es America Central 20 euros kg
# si la zona es America del Sur 21 euros kg
# si la zona es Europa 10 euros kg
# si la zona es Asia 18 euros kg
# calculamos y mostramos en pantalla

print("calcular el precio de un paquete")
print("---------------------\n")

# Leemos los datos
zona = str(input("Introduce la zona a la que desea enviar: "))
peso = float(input("Introduce el peso del paquete, recueda no debe pesar más de 5kg: "))

# Realizamos las comprobaciones y calculos
if peso > 5:
    print("Lo sentimos pero no podemos enviar pesos superiores a 5kg")

else:
    if zona == "América del Norte":
        precio = round((peso*1000) * 24,2)
        print(f"El precio es {precio} euros")
    else:
        if zona == "América del Sur":
            precio = round((peso*1000) * 21,2)
            print(f"El precio es {precio} euros")
        
        else:
            if zona == "América Central":
                precio = round((peso*1000) * 20,2)
                print(f"El precio es {precio} euros")
        
            else:
                if zona == "Europa":
                    precio = round((peso*1000) * 10,2)
                    print(f"El precio es {precio} euros")
        
                else:
                    if zona == "Asia":
                        precio = round((peso*1000) * 18,2)
                        print(f"El precio es {precio} euros")
