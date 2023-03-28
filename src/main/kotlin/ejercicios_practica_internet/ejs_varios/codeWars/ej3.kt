package ejercicios_practica_internet.ejs_varios.codeWars

fun numberOfPairs(gloves: List<String>) {
    var noRep = mutableListOf<String>()
    gloves.forEach { if (it !in noRep) noRep.add(it) }
    var cont = 0
    var listaCont = mutableListOf<Int>()

    for (item in noRep) {
        for (item2 in gloves)
            if (item == item2) cont++
        listaCont.add(cont)
        cont = 0
    }
    println(listaCont)
    //return 0
}

// assertEquals(1, numberOfPairs( arrayOf("red","red").toList()) )
// assertEquals(0, numberOfPairs( arrayOf("red","green","blue").toList()) )
// assertEquals(4, numberOfPairs( arrayOf("red","green","blue","blue","red","green","red","red","red").toList()) )
fun main() {
    numberOfPairs(arrayOf("red", "green", "blue", "blue", "red", "green", "red", "red", "red").toList())
}
