package ejercicios_practica_internet.ejs_Herencia.ej2

open class Bicicleta(): Vehiculo() {
    var tipo: String = ""
        set(value) {
            if (value in listOf("urbana", "deportiva")) field = value else print("Tipo de bici no valida")
        }

    constructor(color: String, ruedas: Int, tipo: String) : this()
    {
        super.color = color
        super.ruedas = ruedas
        this.tipo = tipo
    }

    override fun toString(): String {
        return "Bicicleta(color= $color, ruedas= $ruedas, tipo='$tipo')"
    }
}