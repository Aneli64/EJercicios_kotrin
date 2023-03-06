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
    override fun Calcular(cant_prod: Int) : Double
    {
        var precioF = precio
        when(diasParaCaducar)
        {
           1 -> precioF = cant_prod * (precio * 0.80) //4 veces¿?
           2 -> precioF = cant_prod * (precio * 0.60) //3 veces¿?
           3 -> precioF = cant_prod * (precio * 0.50)
        }
        return precioF
    }

    override fun toString(): String {
        return "Perecedero(nombre='$nombre', precio=$precio, diasParaCaducar=$diasParaCaducar)"
    }
}