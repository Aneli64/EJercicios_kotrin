package ejercicios_Clase.practica.POO.herencia.ej6

abstract class Bebida() {
    constructor(identificador: Int, litros: Double, precio: Double, marca: String) : this() {
        this.identificador = identificador
        this.litros = litros
        this.precio = precio
        this.marca = marca
    }

    companion object {
        var identificadores = mutableListOf<Int>()
    }

    var identificador: Int = 0
        set(value) {
            if (value !in identificadores) {
                field = value
                identificadores.add(value)
            } else println("Identificador ya almacenado")
        }
    var litros: Double = 0.0
        set(value) {
            if (value > 0.0) field = value else print("Litros no validos")
        }
    var precio: Double = 0.0
        set(value) {
            if (value > 0.0) field = value else print("Precio no valido")
        }
    var marca: String = ""

    open fun Calcular(cant_prod: Int) = precio * cant_prod
    override fun toString(): String {
        return "Bebida(identificador=$identificador, litros=$litros, precio=$precio, marca='$marca')"
    }
}