package ejercicios_practica_internet.ejs_Herencia.ej5

import ejercicios_practica_internet.ejs_Herencia.ej5.interfaces.Atacante
import ejercicios_practica_internet.ejs_Herencia.ej5.interfaces.Movible

abstract class Unidad() : Atacante, Movible{
    var nombre: String = ""
    var tipo_ataque: String = ""
    var danio: Int = 0
        set(value) {
            if (value >= 0) field = value
        }
    var vida: Int = 0
        set(value) {
            if (value >= 0) field = value
        }
    var vel_mov: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    override fun atacar(unidad: Unidad) = unidad.vida - danio
    override fun mover(ubicacion: Int) = ubicacion + vel_mov

}