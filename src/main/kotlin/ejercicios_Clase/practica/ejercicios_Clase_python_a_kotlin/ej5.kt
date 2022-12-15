package ejercicios_Clase.practica.ejercicios_Clase_python_a_kotlin

/*
Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga
(en caso de haber más de una, mostrar la primera) y cuántas palabras había.
Precondición: se tomará como separador de palabras al carácter “ “ (espacio), ya sea uno o más
 */

fun main() {
    print("Introduzca una frase -> ")
    var frase = readln()
    var listaFrase = frase.split(" ")
    var maxPalabra = ""
    for (item in listaFrase) if (item.length > maxPalabra.length) maxPalabra = item
    print("Palabra mas larga -> $maxPalabra")
}