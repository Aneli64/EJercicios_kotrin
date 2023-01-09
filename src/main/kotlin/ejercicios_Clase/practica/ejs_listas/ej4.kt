package ejercicios_Clase.practica.ejs_listas

/*
4 crea una aplicación supermercado con clave valor para 12 productos clave nombre del producto y valor el precio, leídos por teclado.

4.2 crea un menú para borrar insertar actualizar productos
4.3  crear una  compra  de 3 productos calculando su precio total.
 */

fun main()
{
    var catalogo = mutableMapOf<Int, String>()
    while(catalogo.size < 12)
    {
        println("Codigo producto -> ")
        var cod = readln().toInt()
        println("Nombre producto")
        var nom = readln()

        catalogo[cod] = nom
    }
}