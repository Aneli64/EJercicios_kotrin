package ejercicios_Clase.practica.archivos

import ejercicios_Clase.practica.POO.herencia.ej3.Produt
import java.io.File

fun main(){
    var palabras = ""
    println("Introduzca palabras para ordenarlas: |entrada vacía para dejar de ingresar palabras|")
    var entrada = readln()
    palabras += "$entrada\n"
    while(entrada.isNotBlank()){
        println("Introduzca palabras para ordenarlas: |entrada vacía para dejar de ingresar palabras|")
        entrada = readln()
        palabras += "$entrada\n"
    }

    val file = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\ficheroPalabras.txt")

    file.writeText(palabras)
    println(ordenarPalabras(file))
}

fun ordenarPalabras(archivo: File){
    val archivoDest = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\palabrasOrdenadas.txt")
    val palabras = mutableListOf<String>()
    archivo.forEachLine { palabras.add(it) }
    val palabrasOrdenadas = palabras.sorted()
    var salida = ""
    palabrasOrdenadas.forEach { salida += "$it\n" }
    archivoDest.writeText(salida)
}

fun ordenarPor(archivo: File, productos: MutableList<Produt>){
    println("Por que campo desea ordenar su documento: \n Numero del campo: ")
    var entrada = readln().toInt()
    when(entrada){
        //1 -> productos.sortBy { productos[] }
    }
}