package ejercicios_practica_internet.ejs_Herencia.juegoRol

import ejercicios_practica_internet.ejs_Herencia.juegoRol.armas.katana
import ejercicios_practica_internet.ejs_Herencia.juegoRol.armas.puaVenenosa
import ejercicios_practica_internet.ejs_Herencia.juegoRol.personajes.Cazador
import ejercicios_practica_internet.ejs_Herencia.juegoRol.personajes.Guerrero

class Juego {
    companion object
    {
        private val arma1 = puaVenenosa("Pua Venenosa", 100, 5, 4)
        private val arma2 = katana("Katana", 150, 0, 10)
        private val personaje1 = Cazador("Cazador", 200, 80)
        private val personaje2 = Guerrero("Guerrero", 300, 300)
        private val listaArmas = listOf<Arma>(arma1, arma2)
        private val listaPersonajes = listOf<Personaje>(personaje1, personaje2)
    }
    fun inicio() //intentar comprimir esto o pasarlo a otra funcion
    {
        println("Escoja un personaje: ")
        val personajeIN = readln().toInt()
        println("Y un arma: [0- Pua Venenosa | 1- Katana]") //meter descripciones de armas con ayuda de una funcion?
        val armaIN = readln().toInt()

        val equipo: MutableMap<Personaje, Arma> = mutableMapOf()
        val personaje = listaPersonajes[personajeIN]
        val arma = listaArmas[armaIN]

        print("${personaje.nombre}, ${arma.nombre}")
    }
}

fun main()
{
    var j1 = Juego()
    j1.inicio()
}