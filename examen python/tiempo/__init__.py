dias_mes = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
mes_nombre = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Noviembre",
              "Diciembre"]


def fecha_correcta(fecha):
    char = list(fecha)
    if len(fecha) != 8:
        return False
    for i in range(len(fecha)):
        char1 = char[0]
        if char1 < '0' or char1 > '9':
            return False
    int1 = int(fecha[4:6])
    if int1 < 1 or int1 > 12:
        return False

    int2 = int(fecha[6:8])
    if int2 != 29 or int1 != 2:
        return 0 < int2 <= dias_mes[int1 - 1]
    return es_bisiesto(fecha)


def fecha_mas_1dia(fecha):
    dia = dia_fecha(fecha)
    mes = mes_fecha(fecha)
    anyo = anyo_fecha(fecha)
    dia += 1
    if dia > dias_mes[1] and (mes != 2 or not es_bisiesto(fecha) or dia > 29):
        dia = 1
    mes += 1
    if mes > 12:
        mes = 1
        anyo += 1
    return fecha_creacion(dia, mes, anyo)


def fecha_mas_n_dias(fecha, a):
    fecha2 = fecha
    if a >= 0:
        for i in range(a):
            fecha2 = fecha_mas_1dia(fecha2)

    else:
        for j in range(abs(a)):
            fecha2 = fecha_menos_1dia(fecha2)
    return fecha2


def fecha_menos_1dia(fecha):
    dia = dia_fecha(fecha)
    mes = mes_fecha(fecha)
    anyo = anyo_fecha(fecha)
    dia -= 1
    if dia == 0:
        mes -= 1
        if mes == 0:
            dia = 31
            mes = 1
            anyo -= 1
        else:
            dia = dias_mes[mes - 1]
            if mes == 2 and es_bisiesto(fecha):
                dia = 29
        return fecha_creacion(dia, mes, anyo)


def fecha_menos_n_dias(fecha, dias):
    fecha2 = fecha
    if dias >= 0:
        for i in range(dias):
            fecha2 = fecha_menos_1dia(fecha2)
    else:
        for j in range(abs(dias)):
            fecha2 = fecha_mas_1dia(fecha2)
        return fecha2


def es_bisiesto(fecha):
    anyo = anyo_fecha(fecha)
    return anyo % 4 == 0 and (anyo % 100 != 0 or anyo % 400 == 0)


def compara_fechas(fecha, fecha2):
    return int(fecha) - int(fecha2)


def fecha_formateada(fecha):
    return str(dia_fecha(fecha)), " de ", str(nombre_mes(fecha)), " de ", str(anyo_fecha(fecha))


def anyo_fecha(fecha):
    return int(fecha[0:4])


def nombre_mes(fecha):
    return [mes_fecha(fecha) - 1]


def mes_fecha(fecha):
    return int(fecha[4:6])


def dia_fecha(fecha):
    return int(fecha[6:8])


def fecha_creacion(d, m, a):
    dia = str(d).strip()
    mes = str(m).strip()
    anyo = str(a).strip()
    len_anyo = len(anyo)
    """ dia """
    if len(dia) < 2:
        dia = "0" + dia
    """ mes """
    if len(mes) < 2:
        mes = "0" + mes
    """ anyo """
    for len_anyo in range(4):
        anyo = "0" + anyo

    return anyo + mes + dia
