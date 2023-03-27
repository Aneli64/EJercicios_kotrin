package ejercicios_Clase.practica.archivos

import java.io.File

class Menu() {
    fun inicio() {
        println(mensaje())
        var entrada = readln().toInt()
        while (entrada != 10) {
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
                    val archivo = "C:\\Users\\Usuario\\Desktop\\$carpeta"
                    println(listarDirectorio(File(archivo)))
                }

                5 -> listarTodo()

                6 -> {
                    println("Nombre del archivo en el que desea escribir")
                    val archivoIn = readln()
                    var archivo = File("C:\\Users\\Usuario\\Desktop\\directorio\\$archivoIn")
                    println("Escriba a continuación lo que quiera")
                    val mensaje = readln()
                    escribirEnArchivo(archivo, mensaje)
                }
            }
            println(mensaje())
            entrada = readln().toInt()
        }
    }

    fun mensaje(): String {
        return "Que desea hacer \n 1 -> Crear archivo \n " +
                "2 -> Crear directorio \n 3 -> Eliminar archivo o directorio \n " +
                "4 -> Listar directorio \n 5 -> Listar todo (Desktop) \n 6 -> Escribir en archivo"
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
                println("Archivo creado correctamente")
            }

            "carpeta" -> {
                println("Nombre de la carpeta: \n")
                val carpeta = readln()
                val file = File("C:\\Users\\Usuario\\Desktop\\$carpeta\\$archivo")
                file.createNewFile()
                println("Archivo creado correctamente")
            }
        }
    }

    fun crearDirectorio() {
        println("Elija un nombre: ")
        val directorio = readln()
        val file = File("C:\\Users\\Usuario\\Desktop\\$directorio")
        file.mkdir()
        println("Directorio creado correctamente")
    }

    fun eliminarArchivo(archivo: File) { //este no funciona
        if (archivo.exists()) {
            when {
                archivo.isFile -> archivo.delete()
                archivo.isDirectory -> archivo.deleteRecursively()
            }
        }
    }

    fun listarDirectorio(directorio: File): MutableList<String> {
        val lista = mutableListOf<String>()
        for (item in directorio.listFiles()!!) lista.add(item.name)
        return lista
    }

    fun listarTodo() { //falta que si tiene varios directorios, los archivos vayan saliendo cada vez mas a la derecha
        val archivo = File("C:\\Users\\Usuario\\Desktop")
        for (item in archivo.listFiles()!!) {
            when {
                item.isDirectory -> println("Directorio: $item \n Ficheros: \n ${listarDirectorio(item)}")
                item.isFile -> println(item.name)
            }
        }
    }

    fun escribirEnArchivo(archivo: File, mensaje: String) {
        if (archivo.canWrite()) {
            archivo.writeText(mensaje)
            println("Texto añadido correctamente")
        } else {
            println("Archivo no encontrado o sin permisos de escritura")
        }
    }
}

fun main() {
    val ej = Menu()
    ej.inicio()
}
