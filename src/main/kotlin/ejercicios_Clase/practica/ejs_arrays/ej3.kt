package ejercicios_Clase.practica.ejs_arrays

/*
3 Desarrolla una aplicación que pida 10 número negativos, los almacena en un array y
los muestre por pantalla. Si el usuario introduce un número positivo se volverá a pedir.
 */

fun main() {

    val array = Array(3, {0})
    for(i in array.indices)
    {
        println("Introduzca un numero negativo -> ")
        val valor = readln().toInt()
        if (valor < 0){
            array[i] = readln().toInt() //no va, mirar condiciones o posible while
        }

        }

    println(array.toList())

}