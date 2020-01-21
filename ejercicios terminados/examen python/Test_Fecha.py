import tiempo

"""
 Prueba funciones de Fecha.java
"""

"""testeamos funciones fecha correcta"""

fechas = ["20191215", "20181111", "dfdfdw", "AAAAMMDD", "20181242", "20010229", "20000229"]
for f in fechas:
    print("La fecha ", f, " tiene un formato ", end='')
    if tiempo.fecha_correcta(f):
        print("CORRECTO")
    else:
        print("INCORRECTO")

    """Testeamos suma y resta de dias"""
fecha1 = "20160228"
fecha2 = "20160301"
fecha3 = "20170228"
fecha4 = "20170301"

print("Si sumamos un día a '", tiempo.fecha_formateada(fecha1), "' obtenemos: ", tiempo.fecha_mas_1dia(fecha1))
print("Si restamos un día a '", tiempo.fecha_formateada(fecha2), "' obtenemos: ", tiempo.fecha_menos_1dia(fecha2))
print("Si sumamos un día a '", tiempo.fecha_formateada(fecha3), "' obtenemos: ", tiempo.fecha_mas_1dia(fecha3))
print("Si restamos un día a '", tiempo.fecha_formateada(fecha4), "' obtenemos: ", tiempo.fecha_menos_1dia(fecha4))

suma = int(input(f"Cuantos días quieres sumar a {tiempo.fecha_formateada(fecha1)} ?"))

print("La fecha resultante es ", tiempo.fecha_mas_n_dias(fecha1, suma))

resta = int(input(f"Cuantos días quieres restar a {tiempo.fecha_formateada(fecha1)} ?"))

print("La fecha resultante es ", tiempo.fecha_menos_n_dias(fecha1, resta))

"""Testeamos comparaciones de fechas"""

fecha2 = "20160120"
fecha3 = "20190101"

print("El resultado de comparar '" + tiempo.fecha_formateada(fecha1) + "' con '" +
      tiempo.fecha_formateada(fecha2) + "' es " + tiempo.compara_fechas(fecha1, fecha2))
print("El resultado de comparar '" + tiempo.fecha_formateada(fecha1) + "' con '" +
      tiempo.fecha_formateada(fecha3) + "' es " + tiempo.compara_fechas(fecha1, fecha3))
print("El resultado de comparar '" + tiempo.fecha_formateada(fecha3) + "' con '" +
      tiempo.fecha_formateada(fecha2) + "' es " + tiempo.compara_fechas(fecha3, fecha2))
print("El resultado de comparar '" + tiempo.fecha_formateada(fecha3) + "' con '" +
      tiempo.fecha_formateada(fecha3) + "' es " + tiempo.compara_fechas(fecha3, fecha3))
