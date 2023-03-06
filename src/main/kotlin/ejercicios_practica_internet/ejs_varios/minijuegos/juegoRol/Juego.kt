package ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol

import ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol.armas.katana
import ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol.armas.puaVenenosa
import ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol.personajes.Cazador
import ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol.personajes.Gigante
import ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol.personajes.Guerrero
import ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol.personajes.Troll

class Juego {
    companion object {  //objetos creados y introducidos en listas para su posterior uso
        private val arma1 = puaVenenosa("Pua Venenosa", 100, 5, 4)
        private val arma2 = katana("Katana", 150, 0, 10)
        private val arma3 = katana("Garrote", 300, 0, 20)
        private val arma4 = katana("Espada Venenosa", 150, 1, 8)
        private val personaje1 = Cazador("Cazador", 200, 80)
        private val personaje2 = Guerrero("Guerrero", 300, 300)
        private val monstruo1 = Troll("Troll", 1200, 100)
        private val monstruo2 = Gigante("Gigante", 900, 150)
        private val listaArmas = listOf<Arma>(arma1, arma2)
        private val armasEnemigas = listOf<Arma>(arma3, arma4)
        private val listaPersonajes = listOf<Personaje>(personaje1, personaje2)
        private val listaEnemigos = listOf<Personaje>(monstruo1, monstruo2)

        private fun listPerToString(): String {
            var res = "|"
            for (i in listaPersonajes.indices) {
                res += " $i -> ${listaPersonajes[i].nombre} |"
            }
            return res
        }

        private fun listArmToString(): String {
            var res = "|"
            for (i in listaArmas.indices) {
                res += " $i -> ${listaArmas[i].nombre} |"
            }
            return res
        }
    }

    private fun objetoPersonaje(personaje: Int): Personaje = listaPersonajes[personaje]
    private fun objetoArma(arma: Int): Arma = listaArmas[arma]
    fun inicio() { //pedimos y almacenamos el personaje y su arma de combate
        println("Escoja un personaje: \n ${listPerToString()}")
        val personaje = objetoPersonaje(readln().toInt())
        println("Y un arma: \n ${listArmToString()}") //meter descripciones de armas con ayuda de una funcion?
        val armaPers = objetoArma(readln().toInt())

        val monstruo = listaEnemigos.random()
        val armaMons = armasEnemigas.random()

        println("Ha aparecido un ${monstruo.nombre} con un ${armaMons.nombre}!!")
        combate(personaje, armaPers, monstruo, armaMons)

    }

    private fun combate(aliado: Personaje, armaAliado: Arma, enemigo: Personaje, armaEnemigo: Arma) {

    }

}

fun main() {
    val j1 = Juego()
    j1.inicio()
}