package ejercicios_practica_internet.ejs_Herencia.ej5.clases

import ejercicios_practica_internet.ejs_Herencia.ej5.Unidad
import ejercicios_practica_internet.ejs_Herencia.ej5.interfaces.Atacante

class Infanteria(): Unidad(){
    var nivel: Int = 1
        set(value) {
            if (value in listOf(1,2,3,4,5,6)) field = value
        }
    constructor(nombre: String, danio: Int, vida: Int, vel_mov: Int, nivel: Int) : this()
    {
        super.nombre = nombre
        super.danio = danio
        super.vida = vida
        super.vel_mov = vel_mov
        this.nivel = nivel
    }
}