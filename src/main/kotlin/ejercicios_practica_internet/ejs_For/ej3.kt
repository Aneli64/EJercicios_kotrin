package ejercicios_practica_internet.ejs_For

/*
Confeccionar un programa que permita ingresar un valor del 1 al 10 y
nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
 */

fun main()
{
    println("Introduzca un valor entre 1 y 10 para saber su tabla hasta el 12: ")
    val nTabla = readln().toInt()

    for(i in 1..12) println("$nTabla * $i = ${nTabla * i}")

}