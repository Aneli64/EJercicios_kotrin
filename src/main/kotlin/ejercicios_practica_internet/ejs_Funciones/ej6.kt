package ejercicios_practica_internet.ejs_Funciones

/*
Crear una función recursiva que permita calcular el factorial de un número.
Realiza un programa principal donde se lea un entero y se muestre el resultado del factorial.
 */


fun factorial(num:Int):Int
{
    var fact = 1
    for(i in 1..num) fact *= i
    return fact
}
fun main()
{
    println(factorial(5))

}