package ejercicios_practica_internet.ejs_While

/*
Escribir un programa que solicite ingresar 10 notas de alumnos
y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */
fun main() {
    var mayorIgual7 = 0
    var menor7 = 0

    for (i in 0..9) {
        print("Introduzca su nota -> ")
        var nota = readln().toInt()
        if (nota >= 7) mayorIgual7++ else menor7++
    }

    print(
        "Numero de alumnos con nota mayor o igual a 7 -> $mayorIgual7" +
                "\n" + "Numero de alumnos con nota menor a 7 -> $menor7"
    )
}