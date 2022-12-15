package ejercicios_Clase.practica.ejercicios_Clase_python_a_kotlin

/* Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los
años que ha cumplido (desde 1 hasta su edad). */

fun main()
{
    print("Edad: ")
    val edad = readln().toInt()
    print("Años cumplidos -> ")
    for (i in 1..edad) print("$i, ")


}