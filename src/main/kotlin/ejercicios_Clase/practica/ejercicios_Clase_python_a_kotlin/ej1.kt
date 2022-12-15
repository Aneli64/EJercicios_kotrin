package ejercicios_Clase.practica.ejercicios_Clase_python_a_kotlin

//Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces.
fun main()
{
    print("Palabra -> ")
    val palabra = readln()
    for (i in 0..10) print(palabra + "\n")
}