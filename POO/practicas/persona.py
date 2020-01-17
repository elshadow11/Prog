class Persona:

    def __init__(self, sexo, nombre, estatura, peso, edad, color_de_pelo, color_de_piel, tiene_pelo, color_de_ojos,
                 tiene_gafas):
        self.sexo = sexo
        self.nombre = nombre
        self.estatura = estatura
        self.peso = peso
        self.edad = edad
        self.tiene_pelo = tiene_pelo
        self.color_de_pelo = color_de_pelo
        self.color_de_piel = color_de_piel
        self.color_de_ojos = color_de_ojos
        self.tiene_gafas = tiene_gafas

    def cumple_annos(self):
        return self.edad + 1

    def comer(self, comida):
        print(f"estoy comiendo {comida}")

    def dormir(self):
        print("Buenas noches\n ZZZZzzzzzzz")

    def despertar(self):
        print("Wenos dias peñita UwU")

    def andar(self, direccion, tiempo=0, dist=0):
        if direccion == "norte" or direccion == "sur" or direccion == "este" or direccion == "oeste":
            if tiempo == 0:
                print(f"Voy a andar hacia el {direccion} unos {dist} kilometros")
            if dist == 0:
                print(f"Voy a andar hacia el {direccion} durante {tiempo} minutos")
