package ejercicios_Clase.practica.ejs_arrays

/*
1. Desarrolla una aplicación que pida a un usuario cuantos números decimales quiere
introducir por teclado, cree un array con ese tamaño, le pida los datos y los muestre

 */

fun main()
{
    println("Cuandos decimales quiere introducir: ")
    val nDecimales = readln().toInt()
    val array = Array(nDecimales, {0})

    for(i in array.indices) array[i] = readln().toInt()
    for (item in array) println(item)
}