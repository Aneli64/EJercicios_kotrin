package ejercicios_Clase.practica.ejs_listas

/*
4 crea una aplicación supermercado con clave valor para 12 productos clave nombre del producto y valor el precio, leídos por teclado.

4.2 crea un menú para borrar insertar actualizar productos
4.3  crear una  compra  de 3 productos calculando su precio total.
 */

fun main() {
    var catalogo = mutableMapOf<Int, String>()
    while (catalogo.size < 3) {
        println("Codigo producto -> ")
        var cod = readln().toInt()
        println("Nombre producto")
        var nom = readln()

        catalogo[cod] = nom
    }

    println("Introduzca una opción: [ 1- Borrar articulo por codigo | 2- Insertar articulo | 3- Actualizar producto por codigo | 4- Mostrar catalogo de articulos | 5- Salir]")
    var entrada = readln().toInt()

    while (entrada != 5) {
        when (entrada) {
            1 -> del(catalogo)
            2 -> insert(catalogo)
            3 -> act(catalogo)
            4 -> mostrarCat(catalogo)
        }
        println("Introduzca una opción: [ 1- Borrar articulo por codigo | 2- Insertar articulo | 3- Actualizar producto por codigo | 4- Mostrar catalogo de articulos | 5- Salir]")
        entrada = readln().toInt()

    }
}

fun insert(mapa: MutableMap<Int, String>) {
    println("Introduzca el id de su producto (Formato numérico): ")
    var id_prod = readln().toInt()
    println("Introduzca su producto: ")
    var prod = readln()
    mapa[id_prod] = prod
    println("Articulo insertado")
}

fun del(mapa: MutableMap<Int, String>) {
    println("Introduzca el codigo del articulo a eliminar: ")
    var id_prod = readln().toInt()

    while (id_prod !in mapa.keys) {
        println("Codigo no encontrado, inténtelo de nuevo: ")
        id_prod = readln().toInt()
    }
    mapa.remove(id_prod)
    println("Articulo borrado")
}

fun act(mapa: MutableMap<Int, String>) {
    println("Introduzca el codigo del articulo que desea actualizar: ")
    var id_prod = readln().toInt()

    while (id_prod !in mapa.keys) {
        println("Codigo no encontrado, inténtelo de nuevo: ")
        id_prod = readln().toInt()
    }

    println("Introduzca el nuevo articulo asignado a ese codigo: ")
    var new_produc = readln()
    mapa[id_prod] = new_produc
    println("Articulo actualizado")
}

fun mostrarCat(mapa: MutableMap<Int, String>) {
    for ((c, v) in mapa) println("cod: $c | art: $v")
}