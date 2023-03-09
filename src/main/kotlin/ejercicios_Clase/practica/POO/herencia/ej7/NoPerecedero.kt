package ejercicios_Clase.practica.POO.herencia.ej7

class NoPerecedero(): Producto() {
    var tipo: String = ""

    constructor(nombre: String, precio: Double, tipo: String) : this()
    {
        super.nombre = nombre
        super.precio = precio
        this.tipo = tipo
    }
    override fun toString(): String {
        return "NoPerecedero(nombre='$nombre', precio=$precio, tipo='$tipo')"
    }

}