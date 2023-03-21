package ejercicios_practica_internet.ejs_varios.codeWars

    // runTest("aaaabb", Pair('a',4))
    fun longestRepetition(s: String):Pair<Char?, Int>  {
        var mapa = mutableMapOf<Char, Int>()
        //
        for (item in s) {
            if (item !in mapa.keys.toString()) mapa[item] = 1 else mapa[item] = mapa[item]!! + 1
        }
        return Pair('h', 2)
        //return mapa.minBy { it.value } revisar, va por aqui
    }

fun main(){
    print(longestRepetition("aaaabb"))
}