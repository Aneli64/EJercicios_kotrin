package ejercicios_Clase.practica.ejercicios_Clase_python_a_kotlin

/* Introduzca una nota y diga si es Suspenso,
Suficiente, Bien, Notable o Sobresaliente */
fun main() {
    print("Introduzca su nota -> ")
    val nota = readln().toInt()
    when {
        nota in (0..4) -> print("Suspenso")
        nota == 5 -> print("Suficiente")
        nota == 6 -> print("Bien")
        nota in (7..8) -> print("Notable")
        nota in (9..10) -> print("Sobresaliente")
    }
}