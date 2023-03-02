package ejercicios_practica_internet.ejs_Herencia.ej2

class Motocicleta(): Bicicleta() {
    var velocidad: Double = 0.0
    var cilindrada: Int = 0

    constructor(color: String, ruedas: Int, velocidad: Double, cilindrada: Int) : this()
    {
        this.velocidad = velocidad
        this.cilindrada = cilindrada
        super.color = color
        super.ruedas = ruedas
    }

    override fun toString(): String {
        return "Motocicleta(color= $color, ruedas= $ruedas, velocidad=$velocidad, cilindrada=$cilindrada)"
    }
}