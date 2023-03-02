package ejercicios_Clase.practica.POO.herencia.ej6

import kotlin.math.min

class Almacen(var estanterias: MutableMap<Int, MutableList<Bebida>>) {

    //fun Comprar(producto: Bebida) {}
    fun PrecioTotal(): Double {
        var precioTotal = 0.0
        for ((c, v) in estanterias) {
            v.forEach { precioTotal += it.precio }
            //for (item in v) precioTotal += item.precio
        }
        return precioTotal
    }

    fun PrecioMarca(marcaPed: String): Double {
        var precTotalMarca = 0.0
        for ((c, v) in estanterias) {
            for (item in v) if (item.marca == marcaPed) precTotalMarca += item.precio
        }
        return precTotalMarca
    }

    fun PrecioEstanteria(estanteria: Int): Double {
        var precioEstant = 0.0
        for (item in estanterias[estanteria]!!) precioEstant += item.precio
        return precioEstant
    }

    fun AgregarProducto(estanteria: Int, producto: Bebida) //por Estanteria
    {
        //estanterias[estanteria]?.add(producto)
        for ((c, v) in estanterias) if (c == estanteria) v.add(producto)
    }

    fun AgregarProductoMenorEst(producto: Bebida) { //al estante menor
        var cont = 0
        var tamanioEst = mutableListOf<Int>()
        for ((c, v) in estanterias) {
            for (item in v) cont++
            tamanioEst.add(cont)
            cont = 0
        }
        for ((c, v) in estanterias) for (item in v) if (v.size == tamanioEst.min()) v.add(producto)
    }

    fun EliminarProducto(id: Int) {
        for ((c, v) in estanterias) {
            for (item in v) if (item.identificador == id) v.remove(item)
        }
    }

    fun Informacion() {
        for ((c, v) in estanterias)
            for (item in v) println(
                "${"-".repeat(20)} \n ${item.identificador}--${item.marca} \n " +
                        "${"-".repeat(20)} \n precio -> ${item.precio} \n litros -> ${item.litros}"
            )
    }

    override fun toString(): String {
        return "Almacen(estanterias=$estanterias)"
    }
}


fun main() {
    val cocaCola = BebidaAzucarada(1, 2.5, 3.0, "Coca-Cola", 35.0, false)
    val fanta = BebidaAzucarada(2, 3.5, 6.0, "sprite", 20.0, false)
    val sprite = BebidaAzucarada(3, 5.5, 2.0, "fanta", 30.0, false)
    val agua = AguaMineral(4, 1.2, 2.0, "Bezoya", "Manantial")
    val agua2 = AguaMineral(5, 2.2, 4.0, "Fontbell", "Manantial")
    val agua3 = AguaMineral(6, 4.2, 6.0, "ola", "Manantial")
    val agua4 = AguaMineral(7, 1.2, 7.0, "mar", "Manantial")

    val lista = mutableListOf<Bebida>(cocaCola, fanta, sprite)
    val lista2 = mutableListOf<Bebida>(agua, agua2, agua3, agua4)
    val mapa = mutableMapOf<Int, MutableList<Bebida>>(1 to lista, 2 to lista2)

    val almacen = Almacen(mapa)
    println(almacen.PrecioTotal())
    println(almacen.PrecioMarca("sprite"))
    println(almacen.PrecioEstanteria(1))

    println(almacen)
    almacen.EliminarProducto(2)
    println(almacen)

    val aquarius = BebidaAzucarada(8, 1.0, 2.0, "aquarius", 20.0, false)
    almacen.AgregarProducto(1, aquarius)
    println(almacen)

    almacen.Informacion()

}