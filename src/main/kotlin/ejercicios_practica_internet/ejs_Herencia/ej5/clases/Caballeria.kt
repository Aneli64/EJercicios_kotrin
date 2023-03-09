package ejercicios_practica_internet.ejs_Herencia.ej5.clases

import ejercicios_practica_internet.ejs_Herencia.ej5.Unidad
import ejercicios_practica_internet.ejs_Herencia.ej5.interfaces.Atacante

class Caballeria(): Unidad(){
    var armadura: String = ""

    constructor(nombre: String, danio: Int, vida: Int, vel_mov: Int, armadura: String) : this()
    {
        super.nombre = nombre
        super.danio = danio
        super.vida = vida
        super.vel_mov = vel_mov
        this.armadura = armadura
    }
}