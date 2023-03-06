package ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol.armas

import ejercicios_practica_internet.ejs_varios.minijuegos.juegoRol.Arma

class katana(): Arma() {
    override var nombre: String = ""
    override var danio: Int = 0
    override var danioVenen: Int = 0
    override var durabilidad: Int = 0
    constructor(nombre: String, danio: Int, danioVenen: Int, durabilidad: Int) : this()
    {
        this.nombre = nombre
        this.danio = danio
        this.danioVenen = danioVenen
        this.durabilidad = durabilidad
    }
}