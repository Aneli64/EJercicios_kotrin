package ejercicios_practica_internet.ejs_varios.codeWars

/*
n = 10, d = 1
the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
We are using the digit 1 in: 1, 16, 81, 100. The total count is then 4
 */
fun nbDig(n: Int, d: Int): Int {
    val listaNum = mutableListOf<String>()
    var count = 0
    for (i in 0..n) listaNum.add("${i * i}")
    for (item in listaNum) if (d.toString() in item) count++
    return count //NO FUNCIONA
}

fun main() {
    nbDig(11011, 2)
}