package ejercicios_practica_internet.ejs_varios.codeWars

import kotlin.math.truncate

fun numberOfPairs(gloves: List<String>) : Int{
    var noRep = mutableListOf<String>()
    gloves.forEach { if (it !in noRep) noRep.add(it) }
    var cont = 0.0
    var listaCont = mutableListOf<Double>()

    for (item in noRep) {
        for (item2 in gloves)
            if (item == item2) cont++
        listaCont.add(cont)
        cont = 0.0
    }
    var nGuantes = 0.0
    listaCont.forEach { nGuantes += truncate((it / 2))}
    return nGuantes.toInt()
}

// assertEquals(1, numberOfPairs( arrayOf("red","red").toList()) )
// assertEquals(0, numberOfPairs( arrayOf("red","green","blue").toList()) )
// assertEquals(4, numberOfPairs( arrayOf("red","green","blue","blue","red","green","red","red","red").toList()) )
fun main() {
    println(numberOfPairs(arrayOf("red", "green", "blue", "blue", "red", "green", "red", "red", "red").toList()))
}
