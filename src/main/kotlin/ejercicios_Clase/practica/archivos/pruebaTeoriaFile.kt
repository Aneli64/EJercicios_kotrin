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

    val file = File("C:\\Users\\Usuario\\Desktop\\ejemplo.txt")
    val bufferedReader = file.bufferedReader()
    val text: List<String> = bufferedReader.readLines()

    /*Actividad 1 copia con el bloc de notas un artículo de wikipedia guárdalo como un
    fichero y léelo con el programa mostrándolo por pantalla.*/
    for (line in text) {
        println("#_> $line")
    }

    //Actividad 2 Cuenta cuantas ocurrencias hay en el artículo de una palabra dada.
    println("Introduzca una palabra para saber su numero de repeticiones: ")
    val entrada = readln()
    var cont = 0
    for (item in text) cont += item.split(" ").count { it == entrada }
    println("Su palabra sale $cont veces")

    /*
    Actividad 3 muestra dos ficheros (con dos artículos de wikipedia) con las líneas salteadas
    línea 1 primer fichero
    línea 1 segundo fichero
    línea 2 primer fichero
    línea 2 segundo fichero
     */

    val file2 = File("C:\\Users\\Usuario\\Desktop\\ejemplo2.txt")
    val bufferedReader2 = file2.bufferedReader()
    val text2: List<String> = bufferedReader2.readLines()
    var lineasMezcladas1 = ""

    val file3 = File("C:\\Users\\Usuario\\Desktop\\ejemplo3.txt")
    val bufferedReader3 = file3.bufferedReader()
    val text3: List<String> = bufferedReader3.readLines()
    var lineasMezcladas2 = mutableListOf<String>()

    val textMaxSize = max(text2.size, text3.size)
    var textMayor = listOf<String>()
    var textMenor = listOf<String>()

    if (text2.size == textMaxSize) {
        textMayor = text2
        textMenor = text3
    } else {
        textMayor = text3
        textMenor = text2
    }

    var count = 0
    lineasMezcladas1 += textMayor.forEach { it.takeIf { count % 2 != 0} ; count++ }
    lineasMezcladas1 += textMayor.forEach { it.takeIf { count % 2 == 0} ; count++ }

    var lista1 =  textMayor.forEach { it.takeIf { count % 2 != 0} ; count++ }
    lista1 as List<String>

    for (item in lista1) lineasMezcladas1 += item
    println(lineasMezcladas1)

}