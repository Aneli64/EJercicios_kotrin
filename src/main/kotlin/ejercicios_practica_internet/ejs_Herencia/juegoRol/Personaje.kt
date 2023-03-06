package ejercicios_practica_internet.ejs_Herencia.juegoRol

import ejercicios_practica_internet.ejs_Herencia.juegoRol.personajes.Defensa

abstract class Personaje : Defensa{

    abstract var nombre: String
    abstract var vida: Int
    abstract var escudo: Int

    override fun defender() = vida + escudo //mirar que el escudo se vaya reduciendo y luego pase a quitar vida
}