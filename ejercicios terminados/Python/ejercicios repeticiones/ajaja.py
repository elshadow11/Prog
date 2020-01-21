def dolar_o_letra(caracter):
  if caracter.isupper():
    return "$"
  else:
    return caracter

original= "Esto Es Una PruebA"
lista_resultado = [ dolar_o_letra(c) for c in original ]
cadena_resultado = "".join(lista_resultado)
print(cadena_resultado)
