package ejercicios_practica_internet.ejs_Herencia.ej2

class Camioneta(): Coche() {
    var carga: Double = 0.0

    constructor(color: String, ruedas: Int, carga: Double) : this()
    {
        super.color = color
        super.ruedas = ruedas
        this.carga = carga
    }

    override fun toString(): String {
        return "Camioneta(color= $color, ruedas= $ruedas, carga=$carga)"
    }
}