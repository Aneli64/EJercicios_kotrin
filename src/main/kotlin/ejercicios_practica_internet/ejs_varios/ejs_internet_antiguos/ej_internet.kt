package ejercicios_practica_internet.ejs_varios.ejs_internet_antiguos

/*
Escribir un programa que permita al usuario obtener un identificador para cada uno de los socios de un club. Para eso ingresará nombre completo y número de DNI de cada socio,
indicando que finalizará el procesamiento mediante el ingreso de un nombre vacío.
Precondición: el formato del nombre de los socios será: nombre apellido. Podría ingresarse más de un nombre, en cuyo caso será: nombre1 nombre2 apellido.
Si un socio tuviera más de un apellido, el usuario sólo ingresará uno.
Se debe validar que el número de DNI tenga 7 u 8 dígitos. En caso contrario, el programa debe dejar al usuario en un bucle hasta que ingrese un DNI correcto.
Por cada socio se debe imprimir su identificador único, el cual estará formado por: el primer nombre, la cantidad de letras del apellido y los primeros 3 dígitos de su DNI.
Ejemplo:
Nombre: Alba María Linares
DNI: 25834910
Alba7258
 */

fun main()
{
    /*println("Introduzca su nombre o nombres y primer apellido -> ")
    var nomApe = readln()*/

    println("Introduzca su DNI [ Formato -> 00000000F ]")
    var dni = readln()

    val charsDNI = mutableListOf<String>()
    for (item in dni) charsDNI.add(item.toString())

    while(charsDNI[8] !in "A".."Z" && !dniCorrecto(charsDNI))
    {
        println("Formato incorrecto, inténtelo de nuevo [ Formato -> 00000000F ]")
        dni = readln()
    }
}

fun dniCorrecto(lista: MutableList<String>):Boolean
{
    var contTrue = 0
    for(item in lista-1) if(item.toString() in "0".."9") contTrue++
    return contTrue == 8
}