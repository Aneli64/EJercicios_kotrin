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
    val p1 = Perecedero("Garbanzos", 20.0, 5)
    val p2 = Perecedero("Chorizo", 30.0, 6)
    val p3 = NoPerecedero("Yogur",12.0, "uno")
    val p4 = NoPerecedero("Arroz",10.0, "dos")
    val p5 = NoPerecedero("Chocolate",22.0, "tres")
    val compra = mutableListOf(p1,p2,p3,p4,p5)
    val ej1 = Compra(compra)

    println(ej1.ListaCompra)
    println(ej1.CalcularPrecio())

    val p6 = NoPerecedero("N_DS",120.0, "cuatro")
    ej1.Comprar(p6)
    println(ej1.ListaCompra)
    println(ej1.CalcularPrecio())
    /*

var listaCompra = mutableListOf<Producto>()

cambiar cuantos de cada  adiando o quitando etc ..

gestionar los posibles tipos en NoPerecedero para empezar son bebidas, Legumbre, verduras, otros

pero se pueden añadir más si al crear un producto se le da un tipo no válido tomará otros

menú gestionar..compras

Ampliación por tu cuenta usa Date con fecha de caducidad en lugar de días para caducar
*/
}