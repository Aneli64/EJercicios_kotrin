package ejercicios_practica_internet.ejs_Herencia.ej1.clases

import ejercicios_practica_internet.ejs_Herencia.ej1.Animal

class Mamifero(
    nPatas: Int, alas: Boolean, tipoPiel: String, tipoHabitat: String, poneHuevos: Boolean, respir: String,
    desplaz: String, habitat: String, tipoALimen: String, alimentos: String, venenoso: Boolean
) :
    Animal(nPatas, alas, tipoPiel, tipoHabitat, poneHuevos, respir, desplaz, habitat, tipoALimen, alimentos, venenoso) {
}