package ejercicios_practica_internet.ejs_Funciones

fun main()
{
    println("Introduzca un primer valor -> ")
    var val1 = readln().toDouble()
    println("Introduzca un segundo valor -> ")
    var val2 = readln().toDouble()
    println("Introduzca un tipo de operacion: \n [1- Suma | 2- Resta | 3- Producto | 4- Division]")
    val input = readln().toInt()

    when(input)
    {
        1 -> print(suma(val1, val2))
        2 -> print(resta(val1, val2))
        3 -> print(producto(val1, val2))
        4 -> print(division(val1, val2))
    }

}

fun suma(v1:Double, v2:Double) = v1 + v2
fun resta(v1:Double, v2:Double) = v1 - v2
fun producto(v1:Double, v2:Double) = v1 * v2
fun division(v1:Double, v2:Double) = v1 / v2