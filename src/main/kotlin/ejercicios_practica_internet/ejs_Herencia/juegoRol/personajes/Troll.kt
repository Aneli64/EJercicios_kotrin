package ejercicios_practica_internet.ejs_Herencia.juegoRol.personajes

import ejercicios_practica_internet.ejs_Herencia.juegoRol.Personaje

class Troll(): Personaje() {
    constructor(nombre: String, vida: Int, escudo: Int) : this() {
        this.nombre = nombre
        this.vida = vida
        this.escudo = escudo
    }

    override var nombre: String = ""
    override var vida: Int = 0
        set(value) {
            field = if (vida >= 0) value else 0
        }
    override var escudo: Int = 0
        set(value) {
            field = if (vida >= 0) value else 0
        }

    override fun defender(): Int {
        TODO("Not yet implemented")
    }
}