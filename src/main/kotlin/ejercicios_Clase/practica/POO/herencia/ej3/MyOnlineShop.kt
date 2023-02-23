package ejercicios_Clase.practica.POO.herencia.ej3

/*
Escribir el método main de la clase MyOnlineShop
que cree dos tv una sony y otra Samsung
un MP3Player
y dos Book
introducelos en una lista
compute el total del Regular Price y de Sale Price
mostrando los datos de cada uno y al final los precios totales
 */

class MyOnlineShop {
    fun tienda() {
        val sony = TV(560.0, "LED", 100)
        val samsung = TV(854.0, "OLED", 120)
        val mp3 = MP3Player(89.4, "Ipod", "Rojo",)
        val libro1 = Book(24.8, "Leonardo", 1789)
        val libro2 = Book(46.9, "Paco", 2008)

        val listaProdut = listOf<Produt>(sony, samsung, mp3, libro1, libro2)
        for (item in listaProdut) println("$item \n ººComputeSalePrice -> ${item.computeSalePrice()}ºº")
    }
}

fun main()
{
    val ej = MyOnlineShop()
    ej.tienda()
}

