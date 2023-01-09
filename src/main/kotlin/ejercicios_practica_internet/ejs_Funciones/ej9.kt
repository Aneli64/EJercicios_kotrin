package ejercicios_practica_internet.ejs_Funciones

import kotlin.math.max
import kotlin.math.min

/*
- Hacer un programa que ingrese dos cadenas y:
. Determine cuál de ellas es mayor en orden alfabético.
. Concatene ambas cadenas.
. Determine cuál es mas larga.
. Invierta la primera ingresada.
 El programa deberá mostrar todas las salidas con carteles aclaratorios
LA MAYOR ES ..............................
LAS CADENAS CONCATENADAS QUEDAN.............
LA CADENA MÁS LARGA ES................
LA CADENA cadena INVERTIDA SE LEE .............
 */

fun main()
{
    println("Introduzca una cadena: ")
    var cadena1 = readln()
    println("Introduzca otra cadena: ")
    var cadena2 = readln()

    println("Introduzca un tipo de operacion: \n [ 1- Mayor Cadena | 2- Concatenar cadenas | 3- Cadena mas larga | 4- Cadena invertida ]")
    val input = readln().toInt()

    when(input)
    {
       // 1 -> print(mayorOrdAlf(cadena1, cadena2))
        2 -> print(concat(cadena1, cadena2))
        3 -> print(masLarga(cadena1, cadena2))
        4 -> print(invertPrimera(cadena1))
    }
}

/*
fun mayorOrdAlf(cd1: String, cd2:String)
{
    val palabraMax = max(cd1.length, cd2.length)
    val palabraMin = min(cd1.length, cd2.length)
    for(i in palabraMax..0)
    {
        if(cd1[i] > cd2[i])
    }

}*/
fun concat(cd1: String, cd2: String) = cd1 + cd2
fun masLarga(cd1: String, cd2: String) = if(cd1.length == max(cd1.length, cd2.length)) cd1 else cd2

fun invertPrimera(cd1: String): String
{
    var palabra = ""
    for(item in cd1.reversed()) palabra += item
    return palabra
}




