package ejercicios_practica_internet.ejs_Herencia.juegoRol.personajes

import ejercicios_practica_internet.ejs_Herencia.juegoRol.Arma
import ejercicios_practica_internet.ejs_Herencia.juegoRol.Personaje

class Guerrero() : Personaje() {
    constructor(nombre: String, vida: Int, escudo: Int, tipoArma: Arma) : this() {
        this.nombre = nombre
        this.vida = vida
        this.escudo = escudo
        this.tipoArma = tipoArma
    }

    override var nombre: String = ""
        set(value) {
            if (nombre in listOf("Cazador", "Guerrero")) field = value else print("personaje no registrado")
        }
    override var vida: Int = 0
        set(value) {
            field = if (vida > 0) value else 0
        }
    override var escudo: Int = 0
        set(value) {
            field = if (escudo > 0) value else 0
        }
    override lateinit var tipoArma: Arma
    override fun atacar(): Int {
        TODO("Not yet implemented")
    }

    override fun defender(): Int {
        TODO("Not yet implemented")
    }
}