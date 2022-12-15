package ejercicios_practica_internet.ejs_While

/*
Se ingresan un conjunto de n alturas de personas por teclado
(n se ingresa por teclado). Mostrar la altura promedio de las personas.
 */

fun main() {
    print("numero de alturas a ingresar -> ")
    val nAlturas = readln().toInt()
    val listaAlturas = mutableListOf<Float>()
    for (i in 1..nAlturas) {
        print("Altura: ")
        val altura = readln().toFloat()
        listaAlturas.add(altura)
    }
    print("Media de alturas -> ${listaAlturas.average()}")

}