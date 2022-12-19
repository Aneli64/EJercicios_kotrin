package ejercicios_practica_internet.ejs_For

/*
Desarrollar un programa que solicite
la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.
 */

fun main()
{
    var sumaNum = 0
    for(i in 1..10)
    {
        println("Introduzca valor -> ")
        val valor = + readln().toInt()
        if(i >= 6) sumaNum += valor

    }

    print("Suma de ultimos 5 valores -> $sumaNum")

}