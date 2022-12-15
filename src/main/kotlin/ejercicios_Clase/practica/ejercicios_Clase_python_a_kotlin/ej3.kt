package ejercicios_Clase.practica.ejercicios_Clase_python_a_kotlin

/* Escribir un programa que pida al usuario un número entero positivo y
muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
 */

fun main()
{
    print("Numero positivo -> ")
    val numero = readln().toInt()
    print("Numeros impares de su numero -> ")
    for(i in 0..numero) if( i % 2 != 0) print("$i, ")
}