package ejercicios_Clase.practica.archivos

import java.io.File
import kotlin.math.max

fun main() {

    /*
actividad bytes 1 crear una aplicación que
en un fichero guarde un entero utilizando writeBytes abre el fichero con
el bloc de notas y compara su contenido
 */

    /*val filename = "C:\\Users\\Usuario\\Desktop\\ejemploBytes.txt"
    val file = File(filename)

    val dataArray = ByteArray(10)
    dataArray[0]=87
    dataArray[1]=5
    dataArray[2]=127
    dataArray[3]=111
    dataArray[4]=27
    dataArray[5]=75
    dataArray[6]=8
    dataArray[7]=87
    file.writeBytes(dataArray)
*/
    /*
        val file = File("C:\\Users\\Usuario\\Desktop\\ejemplo.txt")
        val bufferedReader = file.bufferedReader()
        val text: List<String> = bufferedReader.readLines()

        /*Actividad 1 copia con el bloc de notas un artículo de wikipedia guárdalo como un
        fichero y léelo con el programa mostrándolo por pantalla.*/
        for (line in text) {
            println("#_> $line")
        }*/

    //Actividad 2 Cuenta cuantas ocurrencias hay en el artículo de una palabra dada.
    /*println("Introduzca una palabra para saber su numero de repeticiones: ")

    val entrada = readln()
    var cont = 0
    for (item in text) cont += item.split(" ").count { it == entrada }
    println("Su palabra sale $cont veces")*/

    /*
    Actividad 3 muestra dos ficheros (con dos artículos de wikipedia) con las líneas salteadas
    línea 1 primer fichero
    línea 1 segundo fichero
    línea 2 primer fichero
    línea 2 segundo fichero
     */
    /*
        val file2 = File("C:\\Users\\Usuario\\Desktop\\ejemplo2.txt")
        val bufferedReader2 = file2.bufferedReader()
        val text2: List<String> = bufferedReader2.readLines()
        var lineasMezcladas1 = ""

        val file3 = File("C:\\Users\\Usuario\\Desktop\\ejemplo3.txt")
        val bufferedReader3 = file3.bufferedReader()
        val text3: List<String> = bufferedReader3.readLines()
        var lineasMezcladas2 = mutableListOf<String>() //falta terminar este ejercicio MIRAR

        */
    // Actividad 1 escritura de ficheros (lee una serie de nombres hasta que el usuario introduzca uno vacío y grábalos en un fichero)
    /*
    println("Introduzca un nombre: ")
    var entrada = readln()
    var listaNombres = mutableListOf<String>()
    while (!entrada.isBlank()){
        listaNombres.add(entrada)
        println("Introduzca un nombre: ")
        entrada = readln()
    }

    var file = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\ejemplo.txt")
    file.writeText(listaNombres.toString())
    */
    /*
     Actividad 2 escritura lee dos ficheros y únelos  en un tercero
     */
    /*
    val file2 = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\ejemplo2.txt")
    println(file2.readText())

    val file3 = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\ejemplo3.txt")
    println(file3.readText())

    val fileUnidos = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\ejemploUnidos.txt")
    fileUnidos.writeText(file2.readText() + file3.readText())
    */
    /*
    Actividad 3
    de un fichero de texto leelo y grábalo encriptado en otro fichero. Para ello pediremos en nombre del
    fichero origen, el nombre del fichero destino y una clave de encriptación.
    -método artesanal de encriptación sumar la clave al caracter ejemplo ‘a’ +3 =a b+1 c+2 d+ 3 resultado ‘d’,
     problema cuando se pase del número de caracteres posibles debe volver al principio
    -segundo método utiliza una función de encriptación de kotlin
     */
    fun cifradoCesar(fileOrig: File, fileDest: File, num_saltos: Int) {
        val textoMinus = fileOrig.readText().toLowerCase()
        var textoEncriptado = ""
        val alfabeto = "abcdefghijklmnñopqrstuvwxyz"
        for (item in textoMinus) {
            val numLetra = alfabeto.indexOf(item)
            var nuevaLetra = numLetra + num_saltos // el 3 es el numero ingresado por el usuario
            if (item !in alfabeto) {
                textoEncriptado += item
            } else {
                if ((nuevaLetra) > 26) {
                    nuevaLetra -= 26
                    textoEncriptado += alfabeto[nuevaLetra]
                } else {
                    textoEncriptado += alfabeto[nuevaLetra]
                }
            }
        }
        fileDest.writeText(textoEncriptado)

    }
    println("Nombre fichero de origen: ")
    val ficheroOrigen = readln()
    val fileOrigen = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\$ficheroOrigen")

    println("Nombre fichero destino: ")
    val ficheroDestino = readln()

    val fileDestino = File("C:\\Users\\Usuario\\Desktop\\ejemplos\\$ficheroDestino")

    println("Elija un metodo de encriptacion: \n 1. Cifrado César \n 2. Encriptacion de kotlin")
    val metEncrip = readln().toInt()
    when (metEncrip) {
        1 -> cifradoCesar(fileOrigen, fileDestino, 3)
    }


}