package ejercicios_practica_internet.ejs_Herencia.juegoRol.armas

import ejercicios_practica_internet.ejs_Herencia.juegoRol.Arma

class puaVenenosa(): Arma() {
    override var danio: Int = 0
        set(value) {
            field = if(danio > 0) value else 0
        }
    override var danioVenen: Int = 0
    override var durabilidad: Int = 0

    constructor(danio: Int, danioVenen: Int, durabilidad: Int) : this()
    {
        this.danio = danio
        this.danioVenen = danioVenen
        this.durabilidad = durabilidad
    }
}