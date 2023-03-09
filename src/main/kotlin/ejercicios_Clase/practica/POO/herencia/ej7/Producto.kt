package ejercicios_Clase.practica.POO.herencia.ej7

abstract class Producto() {

    companion object{
        var cont = 0
    }

    var nombre: String = ""
    var precio: Double = 0.0
        set(value) {
            if (value > 0.0) field = value else print("precio no valido")
        }

    constructor(nombre: String, precio: Double) : this() {
        this.nombre = nombre
        this.precio = precio
    }

    open fun Calcular(cant_prod: Int) = cant_prod * precio
    override fun toString(): String {
        return "Producto(nombre='$nombre', precio=$precio)"
    }
}