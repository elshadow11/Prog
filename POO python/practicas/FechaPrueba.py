from practicas.fecha import Fecha

fechas = ["20191215",  # correcto
          "20181111",  # correcto
          "dfdfdw",  # incorrecto
          "AAAAMMDD",  # incorrecto
          "20181242",  # incorrecto (diciembre no tiene 42 días)
          "20010229",  # incorrecto (no es bisiesto)
          "20000229"  # correcto (fue bisiesto)
          ]

for f in fechas:
    print(f"La fecha {f} tiene un formato ", end="")
    fecha = Fecha(f)
    if fecha.fecha_correcta():
        print("CORRECTO")
    else:
        print("INCORRECTO")
print()

fecha1 = Fecha("20160228")
fecha2 = Fecha("20160301")
fecha3 = Fecha("20170228")
fecha4 = Fecha("20170301")

print("Si sumamos un día a '" + fecha1.fecha_formateada() + "' obtenemos: " +
      fecha1.fecha_mas_1dia())
print("Si restamos un día a '" + fecha2.fecha_formateada() + "' obtenemos: " +
      fecha2.fecha_menos_1dia())
print("Si sumamos un día a '" + fecha3.fecha_formateada() + "' obtenemos: " +
      fecha3.fecha_mas_1dia())
print("Si restamos un día a '" + fecha4.fecha_formateada() + "' obtenemos: " +
      fecha4.fecha_menos_1dia())
print()

suma = int(input("¿Cuantos días quieres sumar a " + fecha1.fecha_formateada() + "? "))
print("La fecha resultante es " + fecha1.fecha_mas_n_dias(suma))
print()

resta = int(input("¿Cuantos días quieres restar a " + fecha1.fecha_formateada() + "? "))
print("La fecha resultante es " + fecha1.fecha_menos_n_dias(resta))
print()

# Testeamos comparaciones de fechas
fecha2 = Fecha("20160120")
fecha3 = Fecha("20190101")
print("El resultado de comparar '" + fecha1.fecha_formateada() + "' con '" +
      fecha2.fecha_formateada() + "' es ", fecha1.compara_fechas(fecha2))
print("El resultado de comparar '" + fecha1.fecha_formateada() + "' con '" +
      fecha3.fecha_formateada() + "' es ", fecha1.compara_fechas(fecha3))
print("El resultado de comparar '" + fecha3.fecha_formateada() + "' con '" +
      fecha2.fecha_formateada() + "' es ", fecha3.compara_fechas(fecha2))
print("El resultado de comparar '" + fecha3.fecha_formateada() + "' con '" +
      fecha3.fecha_formateada() + "' es ", fecha3.compara_fechas(fecha3))
