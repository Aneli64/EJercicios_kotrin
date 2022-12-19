package ejercicios_practica_internet.ejs_While

/*
Realizar un programa que permita cargar dos listas de 5 valores cada una.
Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor
(mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.
 */

fun main()
{
    var list1 = mutableListOf<Int>()
    var list2 = mutableListOf<Int>()

    while(list1.size < 5 && list2.size < 5)
    {
        println("Introduzca un valor para la lista 1 -> ")
        val input1 = readln().toInt()
        list1.add(input1)

        println("Introduzca un valor para la lista 2 -> ")
        val input2 = readln().toInt()
        list2.add(input2)
    }
    val valList1 = list1.sum()
    val valList2 = list2.sum()

    println("Suma valores lista 1 -> $valList1")
    println("Suma valores lista 2 -> $valList2")

    if(valList1 == valList2) print("Listas iguales")
    else {
        if (valList1 > valList2) print("Lista 1 mayor") else print("Lista 2 mayor")
    }
}