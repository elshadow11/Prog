from practicas.tiempo import Tiempo

t1 = Tiempo(10, 20, 30)  # Establecemos los valores de Tiempo

# Sumamos y restamos Horas
print(f"T1: {t1}")
h = int(input(f"Horas a sumar a {t1}"))
t1.suma_horas(h)
print(f"Ahora T1 es {t1}")
h = int(input(f"Horas a restar a {t1}"))
t1.resta_horas(h)
print(f"Ahora T1 es {t1}")

# Sumamos y restamos minutos
m = int(input(f"Minutos a sumar a {t1}"))
t1.suma_minutos(m)
print(f"Ahora T1 es {t1}")
m = int(input(f"Minutos a restar a {t1}"))
t1.resta_minutos(m)
print(f"Ahora T1 es {t1}")

# Sumamos y restamos segundos
s = int(input(f"Segundos a sumar a {t1}"))
t1.suma_segundos(s)
print(f"Ahora T1 es {t1}")
s = int(input(f"Segundos a restar a {t1}"))
t1.resta_segundos(s)
print(f"Ahora T1 es {t1}")

# Sumamos y restamos otro objeto de la clase Tiempo
print("Para sumar T2 a T1 introduce los valores de T2")
h = int(input("Horas de T2: "))
m = int(input("Minutos de T2: "))
s = int(input("Segundos de T2: "))
t2 = Tiempo(h, m, s)
t1.suma(t2)
print(f"Ahora T1 es {t1}")

print("Para restar T2 a T1 introduce los valores de T2")
h = int(input("Horas de T2: "))
m = int(input("Minutos de T2: "))
s = int(input("Segundos de T2: "))
t2 = Tiempo(h, m, s)
t1.resta(t2)
print(f"Ahora T1 es {t1}")
