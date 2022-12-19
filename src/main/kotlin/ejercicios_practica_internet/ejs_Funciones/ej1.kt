package ejercicios_practica_internet.ejs_Funciones

/*
En la función main solicitar que se ingrese una clave dos veces por teclado.
Desarrollar una función que reciba dos String como parametros y
muestre un mensaje si las dos claves ingresadas son iguales o distintas.
 */

fun clavesIguales(cl1:String, cl2:String) = cl1 == cl2

fun main()
{
    println("Introduzca una clave -> ")
    var clave1 = readln()
    println("Introduzca una clave -> ")
    var clave2 = readln()

    if (clavesIguales(clave1, clave2)) print("Claves iguales") else print("Claves distintas")
}
