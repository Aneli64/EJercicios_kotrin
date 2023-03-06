package ejercicios_Clase.practica.POO.herencia.ej7

class Compra(var ListaCompra: MutableList<Producto>) {
    fun Comprar(producto: Producto) = ListaCompra.add(producto)
    fun CalcularPrecio(): Double
    {
        var precioTotal = 0.0
        ListaCompra.forEach { precioTotal += it.precio }
        return precioTotal
    }

    override fun toString(): String {
        return "Compra(ListaCompra=$ListaCompra)"
    }
}

fun main()
{
    val p1 = Perecedero("PS5", 560.0, 5)
    val p2 = Perecedero("Xbox", 450.0, 6)
    val p3 = NoPerecedero("N_Switch",360.0, "uno")
    val p4 = NoPerecedero("G_Cube",240.0, "dos")
    val p5 = NoPerecedero("N_64",180.0, "tres")
    val compra = mutableListOf(p1,p2,p3,p4,p5)
    val ej1 = Compra(compra)

    println(ej1.ListaCompra)
    println(ej1.CalcularPrecio())

    val p6 = NoPerecedero("N_DS",120.0, "cuatro")
    ej1.Comprar(p6)
    println(ej1.ListaCompra)
    println(ej1.CalcularPrecio())

}