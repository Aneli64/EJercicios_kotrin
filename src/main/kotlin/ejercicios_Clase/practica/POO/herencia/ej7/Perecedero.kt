package ejercicios_Clase.practica.POO.herencia.ej7

class Perecedero() : Producto() {
    var diasParaCaducar: Int = 0
        set(value) {
            if (value > 0) field = value else println("dias no validos")
        }

    constructor(nombre: String, precio: Double, diasParaCaducar: Int) : this()
    {
        super.nombre = nombre
        super.precio = precio
        this.diasParaCaducar = diasParaCaducar
    }
    override fun Calcular(cant_prod: Int) = cant_prod * precio
}