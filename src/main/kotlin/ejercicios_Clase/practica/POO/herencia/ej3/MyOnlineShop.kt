package ejercicios_Clase.practica.POO.herencia.ej3

import ejercicios_Clase.practica.POO.iniciales.Producto
import ejercicios_practica_internet.ejs_Funciones.producto
import java.io.File

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
    val listaObjetos = mutableListOf<Produt>()

    var file = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\productosTienda.txt")

    /*fun tienda() {
        val sony = TV(560.0, "LED", 100, 0)
        val samsung = TV(854.0, "OLED", 120, 0)
        val mp3 = MP3Player(89.4, "Ipod", "Rojo",0)
        val libro1 = Book(24.8, "Leonardo", 1789, 0)
        val libro2 = Book(46.9, "Paco", 2008, 0)
        val camera1 = Camera(650.0, "Cine",0)
        val camera2 = Camera(650.0, "Foto",0)
        val listaProdut = listOf(sony, samsung, mp3, libro1, libro2, camera1, camera2)
        for (item in listaProdut) println("$item \n ººComputeSalePrice -> ${item.computeSalePrice()}ºº")
        for (item in listaProdut) println("Special Customer Price -> ${item.computeSpecialCustomerPrice()} \n ${("=".repeat(20))}")

        if (sony.isGreater(samsung)) println("Es mayor") else println("No es mayor")
        if (libro1.isLess(libro2)) println("Es menor") else println("No es menor")
        if (camera1.isEqual(camera2)) println("Es igual") else println("No es igual")
    }*/
    fun inicio() {
        obtenerObjetos(file, listaObjetos)
        println("Que tipo de producto desea ingresar: \n 1|Book \n 2|Camera \n 3|MP3Player \n 4|TV \n 5|Salir")
        var entrada = readln().toInt()
        while (entrada != 5) {
            when (entrada) {
                1 -> crearBook()
                2 -> crearCamera()
                3 -> crearMP3Player()
                4 -> crearTV()
            }
            println("Que tipo de producto desea ingresar: \n 1|Book \n 2|Camera \n 3|MP3Player \n 4|TV \n 5|Salir")
            entrada = readln().toInt()
        }
        addArticulosFile(file, listaObjetos)
    }

    fun obtenerObjetos(archivo: File, listaObj: MutableList<Produt>){
        val lista = mutableListOf<List<String>>()
        archivo.forEachLine { lista.add(it.split(","))}
        for (item in lista){
            when(item[0]){
                "Book" -> listaObj.add(Book(item[1].toDouble(), item[2], item[3].toInt(), item[4].toInt()))
                "Camera" -> listaObj.add(Camera(item[1].toDouble(), item[2], item[3].toInt()))
                "MP3Player" -> listaObj.add(MP3Player(item[1].toDouble(), item[2], item[3], item[4].toInt()))
                "TV" -> listaObj.add(TV(item[1].toDouble(), item[2], item[3].toInt(), item[4].toInt()))
            }
        }
    }
    fun mostrarListaProductos() = listaObjetos.toString()
    fun addArticulosFile(archivo: File, listaObj: MutableList<Produt>) {
        var texto = ""
        listaObj.forEach { texto += "$it \n" }
        archivo.writeText(texto)
    }


    fun crearBook() {
        print("Regular Price -> ")
        val regularPrice = readln().toDouble()
        print("IVA -> ")
        val IVA = readln()
        print("publisher -> ")
        val publisher = readln().toInt()
        print("yearPublished -> ")
        val yearPublished = readln().toInt()

        val book = Book(regularPrice, IVA, publisher, yearPublished)
        listaObjetos.add(book)
    }

    fun crearCamera() {
        print("Regular Price -> ")
        val regularPrice = readln().toDouble()
        print("manufacturer -> ")
        val manufacturer = readln()
        print("IVA -> ")
        val IVA = readln().toInt()

        val camera = Camera(regularPrice, manufacturer, IVA)
        listaObjetos.add(camera)
    }

    fun crearMP3Player() {
        print("Regular Price -> ")
        val regularPrice = readln().toDouble()
        print("manufacturer -> ")
        val manufacturer = readln()
        print("color -> ")
        val color = readln()
        print("IVA -> ")
        val IVA = readln().toInt()

        val mp3Player = MP3Player(regularPrice, manufacturer, color, IVA)
        listaObjetos.add(mp3Player)
    }

    fun crearTV() {
        print("Regular Price -> ")
        val regularPrice = readln().toDouble()
        print("manufacturer -> ")
        val manufacturer = readln()
        print("IVA -> ")
        val IVA = readln().toInt()
        print("size -> ")
        val size = readln().toInt()

        val tv = TV(regularPrice, manufacturer, size, IVA)
        listaObjetos.add(tv)
    }

}

fun main() {
    val ej = MyOnlineShop()
    //ej.tienda()
    ej.inicio()
    println(ej.mostrarListaProductos())
}

