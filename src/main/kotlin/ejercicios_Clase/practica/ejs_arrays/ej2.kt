package ejercicios_Clase.practica.ejs_arrays

import kotlin.math.max
import kotlin.random.Random

/*
2 Desarrolla una aplicación que cree un array con 5 números
enteros aleatorios y muestre por pantalla el array completo,
el número más grande y el más pequeño.
 */

fun main()
{
    val array = Array(5, { (0..100).random()})
    println("Array -> ${array.toList()}")
    println("Numero maximo -> ${array.max()}")
    println("Numero minimo -> ${array.min()}")
}