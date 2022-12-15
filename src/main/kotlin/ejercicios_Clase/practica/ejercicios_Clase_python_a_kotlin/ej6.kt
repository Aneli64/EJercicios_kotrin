package ejercicios_Clase.practica.ejercicios_Clase_python_a_kotlin

// Decir si una palabra es capicúa
fun main()
{
    print("Palabra -> ")
    val palabra = readln()
    var palabraIzq = ""
    var palabraDer = ""

    for(item in palabra) palabraIzq += item
    for(item in palabra.reversed()) palabraDer += item

    if (palabraIzq == palabraDer) print("Palabra capicúa") else print("Palabra no capicúa")

}

