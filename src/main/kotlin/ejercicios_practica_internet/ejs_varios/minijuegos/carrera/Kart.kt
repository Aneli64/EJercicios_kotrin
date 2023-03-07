package ejercicios_practica_internet.ejs_varios.minijuegos.carrera

class Kart(){
    var nombre:String = ""
    var velocidad: Int = 0
        set(value) {
            if (value in 0..10) field = value
        }
    var probAcelCrit: Int = 0
        set(value) {
            if (value in 0..10) field = value
        }

    constructor(nombre: String, velocidad: Int, probAcelCrit: Int) : this()
    {
        this.nombre = nombre
        this.velocidad = velocidad
        this.probAcelCrit = probAcelCrit
    }

    override fun toString(): String {
        return "kart(nombre='$nombre', velocidad=$velocidad, probAcelCrit=$probAcelCrit)"
    }
}