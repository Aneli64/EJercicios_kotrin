package ejercicios_practica_internet.ejs_Funciones

/*
Crear una subrutina llamada “Login”, que recibe un nombre de usuario y
una contraseña y te devuelve Verdadero si el nombre de usuario es “usuario1” y
la contraseña es “asdasd”. Además recibe el número de intentos que se
ha intentado hacer login y si no se ha podido hacer login incremente este valor.
 */

fun login():Int
{
    var contInt = 1
    println("Introduzca un usuario: ")
    var user = readln()
    println("Introduzca su contraseña: ")
    var passw = readln()

    while(user != "usuario1" && passw != "asdasd"){
        contInt ++
        println("Introduzca un usuario: ")
        user = readln()
        println("Introduzca su contraseña: ")
        passw = readln()
    }
    return contInt

}

fun main()
{
    print("Datos correctos, numero de intentos -> ${login()}")
}