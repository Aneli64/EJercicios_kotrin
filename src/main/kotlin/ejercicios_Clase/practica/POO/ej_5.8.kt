package ejercicios_Clase.practica.POO

/*
Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos, sólo hora y minuto o sólo la hora
 (si no se indica, el valor de minuto o segundo será 0). Crear el método toString para mostrar el tiempo en formato: XXh XXm XXs
En el programa principal, debe solicitar por teclado un menú de si queromos introducir  hora, minuto y segundo de forma que se puedan omitir
los segundos o los minutos (y segundos, claro) e instancie la clase Tiempo mostrando su valor.
 */

class Tiempo(var hora:String, var minuto:String = "0", var segundo:String = "0")
{
    override fun toString(): String {
        return "Tiempo(hora='$hora', minuto='$minuto', segundo='$segundo')"
    }
}

fun main()
{
    println("Introduzca hora: ")
    val hora = readln()
    println("Introduzca minutos: ")
    var minuto = readln()
    println("Introduzca segundos: ")
    var segundo = readln()

    if (minuto.isBlank()) minuto = "0"
    if (segundo.isBlank()) segundo = "0"

    val ej = Tiempo(hora, minuto, segundo)
    println(ej)

}