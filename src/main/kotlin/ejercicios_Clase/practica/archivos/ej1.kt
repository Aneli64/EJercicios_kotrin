package ejercicios_Clase.practica.archivos

import java.io.File

class Menu() {
    fun inicio() {
        println(mensaje())
        var entrada = readln().toInt()
        while (entrada != 6) {
            when (entrada) {
                1 -> crearArchivo()
                2 -> crearDirectorio()
                3 -> {
                    println("Nombre del archivo a eliminar: \n")
                    val archivo = readln()
                    eliminarArchivo(File(archivo))
                }

                4 -> {
                    println("Nombre de la carpeta a listar")
                    val carpeta = readln()
                    println(listarDirectorio(File(carpeta)))
                }
            }
            println(mensaje())
            entrada = readln().toInt()
        }
    }

    fun mensaje(): String {
        return "Que desea hacer \n 1 -> Crear archivo \n " +
                "2 -> Crear directorio \n 3 -> Eliminar archivo o directorio \n " +
                "4 -> Listar directorio \n"
    }

    fun crearArchivo() {
        println("Elija un nombre: ")
        val archivo = readln()
        println("¿Lo quiere añadir a una carpeta o al escritorio?")
        val opcion = readln()
        when (opcion) {
            "escritorio" -> {
                val file = File("C:\\Users\\Usuario\\Desktop\\$archivo")
                file.createNewFile()
            }

            "carpeta" -> {
                println("Nombre de la carpeta: \n")
                val carpeta = readln()
                val file = File("C:\\Users\\Usuario\\Desktop\\$carpeta\\$archivo")
                file.createNewFile()
            }
        }
    }

    fun crearDirectorio() {
        println("Elija un nombre: ")
        val directorio = readln()
        val file = File("C:\\Users\\Usuario\\Desktop\\$directorio")
        file.mkdir()
    }

    fun eliminarArchivo(archivo: File) {
        if (archivo.exists()) {
            when {
                archivo.isFile -> archivo.delete()
                archivo.isDirectory -> archivo.deleteRecursively()
            }
        }
    }

    fun listarDirectorio(directorio: File) = directorio.listFiles()
}

fun main() {
    val ej = Menu()
    ej.inicio()
}
