package ejercicios_Clase.practica.POO.herencia.ej3

/*
Escribir el método main de la clase MyOnlineShop
que cree dos tv una sony y otra Samsung
un MP3Player
y dos Book
introducelos en una lista
compute el total del Regular Price y de Sale Price
mostrando los datos de cada uno y al final los precios totales

En el método main de la clase MyOnlineShop inicializar dos objetos de la clase Camera
 */

/*
Modificar el código escrito hasta ahora para
Agregar el método double computeSpecialCustomerPrice()
Todos y cada uno de los productos debe tenerlo pero su código dependerá del tipo de producto
La lógica de cálculo debe ser como sigue:
Para TV, restar 100 al precio de venta
Para MP3Player, restar 15 al precio de venta
Para Book, restar 2 al precio de venta
PAra cámara restar 205 al precio de venta
En el método main de la clase MyOnlineShop mostrar Special Customer Price para cada artículo de los productos
 */

class MyOnlineShop {
    fun tienda() {
        val sony = TV(560.0, "LED", 100, 0)
        val samsung = TV(854.0, "OLED", 120, 0)
        val mp3 = MP3Player(89.4, "Ipod", "Rojo",0)
        val libro1 = Book(24.8, "Leonardo", 1789, 0)
        val libro2 = Book(46.9, "Paco", 2008, 0)
        val camera1 = Camera(650.0, "Cine",0)
        val camera2 = Camera(650.0, "Foto",0)

        val listaProdut = listOf<Produt>(sony, samsung, mp3, libro1, libro2, camera1, camera2)
        for (item in listaProdut) println("$item \n ººComputeSalePrice -> ${item.computeSalePrice()}ºº")
        for (item in listaProdut) println("Special Customer Price -> ${item.computeSpecialCustomerPrice()} \n ${("=".repeat(20))}")
    }
}

fun main()
{
    val ej = MyOnlineShop()
    ej.tienda()
}

