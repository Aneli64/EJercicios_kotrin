package ejercicios_practica_internet.ejs_Funciones

/*
Escribir dos funciones que permitan calcular:

La cantidad de segundos en un tiempo dado en horas, minutos y segundos.
La cantidad de horas, minutos y segundos de un tiempo dado en segundos.
Escribe un programa principal con un menú donde se pueda elegir la opción
de convertir a segundos, convertir a horas,minutos y segundos o salir del programa.
 */

fun segundos(): String {

    println("Horas: ")
    val horas = readln().toInt() * 3600
    println("Minutos: ")
    val minutos = readln().toInt() * 60
    println("Segundos: ")
    val sgs = readln().toInt()

    val total = (horas + minutos + sgs)
    return "Segundos -> $total"
}

fun horasMinSeg(): String {
    println("Segundos: ")
    var sgsIn = readln().toInt()

    var contH = 0
    var contM = 0
    var contS = 0
    while (sgsIn - 3600 >= 0) {
        contH++
        sgsIn -= 3600
    }
    while (sgsIn - 60 >= 0) {
        contM++
        sgsIn -= 60
    }
    return "$contH horas, $contM minutos y $sgsIn segundos"

}

fun menu(): String {
    println(
        "Elija una opción: " + "\n" +
                " 1| De horas, minutos y segundos a segundos totales " + "\n" +
                " 2| De segundos totales a horas, miuntos y segundos " + "\n" +
                 " 3| Salir del programa"
    )
    var input = readln().toInt()

    while(input !in 1..3)
    {
        println(
            "Opción incorrecta, inténtelo de nuevo: " + "\n" +
                    " 1| De horas, minutos y segundos a segundos totales " + "\n" +
                    " 2| De segundos totales a horas, miuntos y segundos " + "\n" +
                    " 3| Salir del programa"
        )
        input = readln().toInt()
    }
    when (input) {
        1 -> return segundos()
        2 -> return horasMinSeg()
        3 -> return "Saliendo..."
    }
    return ""
}

fun main() {
    print(menu())
}