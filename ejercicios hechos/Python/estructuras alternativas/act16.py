#Programa: act16.py
#Propósito:La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
#Autor: Jose Manuel Serrano Palomo.
#Fecha: 17/10/2019
#
#Variables a usar:
# precio_llamada será el precio total de la llamada
# día es el día en el que llama y que determinará el impuesto
# tiempo es lo que dura la llamada
# turno en el caso de que no sea el domingo nos dirá un impuesto diferente segun si es te tarde o mañana
#
#Algoritmo:
# si el tiempo es igual o inferior a 5 mins precio_llamada <-- 1 eur
# si el tiempo es igual o inferior a 8 mins precio_llamada <-- 1 eur + 0.80 cents
# si el tiempo es igual o inferior a 10 mins precio_llamada <-- 1 eur + 0.80 cents + 0.70 cents
# si el tiempo es superior a 10 mins precio_llamada <-- 1 eur + 0.80 cents + 0.70 cents + 0.50 cents
# si fue un domingo 3% de impuestos añadidos a precio_llamada
# en caso contrario LEER si fue turno de mañana 15% añadido o tarde 10% añadido
# ESCRIBIR el resultado

print("calcular el precio de una llamada telefónica")
print("--------------------------------------------\n")

#Leemos los datos
dia = str(input("Introduce el día que realiza la llamada: "))
tiempo = int(input("Introduce el tiempo que dura la llamada en minutos: "))

#Realizamos las comprobaciones
if tiempo <= 5:
    precio_llamada = 1
    
else:
    if tiempo <= 8:
        precio_llamada = 1 + 0.80
    
    else:
        if tiempo <= 10:
            precio_llamada = 1 + 0.80 + 0.70
        
        else: 
            if tiempo > 10:
                precio_llamada = 1 + 0.80 + 0.70 + 0.50
                
            else:
                print("los datos son erroneos introduce un numero entero")

if dia == "domingo" or dia == "Domingo" or dia == "DOMINGO":
    precio_llamada = round(precio_llamada * 1.03, 2)
    print(f"El precio de la llamada será {precio_llamada}")

else:
    if dia != "domingo" or dia != "Domingo" or dia != "DOMINGO":
        turno = str(input("Introduce en que turno se realiza la llamada : "))
    
    else:
        print("los datos son erroneos introduce un día de la semana")
    
    if turno == "mañana":
        precio_llamada = round(precio_llamada * 1.15,2)
        print(f"El precio de la llamada será {precio_llamada}")
        
    else:
        if turno == "tarde":
            precio_llamada = round(precio_llamada * 1.10,2)
            print(f"El precio de la llamada será {precio_llamada}")
        
        else:
            print("los datos son erroneos introduce turno de tarde o mañana")
